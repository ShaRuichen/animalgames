package animalgames.mvc;

public class souvenirController {
	private souvenir model;
	private souvenirView view;
	
	public souvenirController(souvenir model, souvenirView view) {
		this.model = model;
		this.view = view;
	}
	
	// 获取纪念品ID
	public int getsouvenirId() {
		return model.getId();
	}
	// 设置纪念品ID
	public void setsouvenirId(int id) {
		model.setId(id);
	}
	// 获取纪念品名
	public String getsouvenirName() {
		return model.getName();
	}
	// 设置纪念品名
	public void setsouvenirName(String name) {
		model.setName(name);
	}
	// 更新视图
	public void updateView() {
		view.printsouvenirDetails(model.getId(), model.getName());
	}
}
