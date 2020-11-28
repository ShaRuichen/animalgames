package animalgames.bridge;

public class Shirt extends Show {

    public Shirt(SelectAPI selectAPI) {
        super(selectAPI);
    }//展示可选时装

    public void select() {
        selectAPI.selectClothes();
    }//列举可选时装明细
}
