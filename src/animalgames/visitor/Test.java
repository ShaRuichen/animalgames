package animalgames.visitor;

import java.util.Scanner;

import animalgames.Entry;

public class Test {
    public static void main(String[] args) {
        @Entry(title = "查看某猫科运动员属性")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name,species and assignment, press enter to divide.");
        String TempName = scanner.nextLine();
        String TempSpec = scanner.nextLine();
        String TempAsgi = scanner.nextLine();
        scanner.close();
        FelidaeProperty felidae = new Felidae(TempName,TempSpec,TempAsgi);
        felidae.show(new FelidaePropertyDisplayVisitor());
    }
}
