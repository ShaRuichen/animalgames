package animalgames.mvc;

public class AnimalController {
	private Animal model;
	private AnimalView view;
	
	public AnimalController(Animal model, AnimalView view) {
		this.model = model;
		this.view = view;
	}
	
	// 获取动物ID
	public int getAnimalId() {
		return model.getId();
	}
	// 设置动物ID
	public void setAnimalId(int id) {
		model.setId(id);
	}
	// 获取动物名
	public String getAnimalName() {
		return model.getName();
	}
	// 设置动物名
	public void setAnimalName(String name) {
		model.setName(name);
	}
	// 更新视图
	public void updateView() {
		view.printAnimalDetails(model.getId(), model.getName());
	}
}
