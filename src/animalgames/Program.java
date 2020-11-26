package animalgames;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	private static List<Method> entries;
	private static String catalog;
	
	public static void main(String[] args) {
		loadAllEntries();
		var out = System.out;
		var err = System.err;
		var input = new Scanner(System.in);
		out.println("\n欢迎来到动物运动会！");
		out.print(catalog);
		while (true) {
			out.print("\n请输入一项操作前面的序号来执行该操作：");
			var num = input.nextInt();
			if (num == 0) {
				break;
			}
			else if (num <= entries.size()) {
				try {
					out.println();
					entries.get(num - 1).invoke(null);
					out.println("执行成功。");
					out.print("输入任意内容以继续：");
					input.next();
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
					input.close();
					throw new UnsupportedOperationException();
				}
				out.print(catalog);
			}
			else {
				err.println("输入的内容有误，请重新输入。");
			}
		}
		input.close();
		out.println("程序结束。"); 
	}
	
	private static void loadAllEntries() {
		catalog = "--------------------------------\n下面列出了本程序所能执行的所有操作。\n\t0. 退出程序\n";
		entries = new ArrayList<Method>(30);
		try {
			var loader = Thread.currentThread().getContextClassLoader();
			var dirs = loader.getResources("animalgames");
			while (dirs.hasMoreElements()) {
				var url = dirs.nextElement();
				var protocol = url.getProtocol();
				if (protocol.equals("file")) {
					var path = URLDecoder.decode(url.getFile(), "UTF-8");
					loadClassesByFile("animalgames", path, loader);
				}
				else if (protocol.equals("jar")) {
					loadClassesByJar(url, loader);
				}
				else throw new UnsupportedOperationException();
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new UnsupportedOperationException();
		}
	}
	
	private static void loadClassesByFile(String packageName, String path, ClassLoader loader) {
		var dir = new File(path);
		var files = dir.listFiles(new FileFilter() {
			@Override
            public boolean accept(File file) {
                return file.isDirectory() || file.getName().endsWith(".class");
            }
		});
		for (var file : files) {
			if (file.isDirectory()) {
				loadClassesByFile(packageName + "." + file.getName(), file.getAbsolutePath(), loader);
			}
			else {
				var className = packageName + "." + file.getName().substring(0, file.getName().length() - 6);
				try {
					var theClass = loader.loadClass(className);
					loadEntry(theClass);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					throw new UnsupportedOperationException();
				}
			}
		}
	}

	private static void loadClassesByJar(URL url, ClassLoader loader) {
		try {
			var entries = ((JarURLConnection)url.openConnection()).getJarFile().entries();
			while (entries.hasMoreElements()) {
				var entry = entries.nextElement();
				var name = entry.getName();
				if (name.startsWith("animalgames/") && name.endsWith(".class")) {
					var className = name.substring(0, name.length() - 6).replace('/', '.');
					var theClass = loader.loadClass(className);
					loadEntry(theClass);
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new UnsupportedOperationException();
		}
	}
	
	private static void loadEntry(Class<?> theClass) {
		var methods = theClass.getDeclaredMethods();
		for (var method : methods) {
			if (Modifier.isStatic(method.getModifiers())) {
				var annotation = method.getAnnotation(Entry.class);
				if (annotation != null) {
					var text = annotation.title();
					entries.add(method);
					catalog += "\t" + entries.size() + ". " + text + "\n";
				}
			}
		}
	}
}
