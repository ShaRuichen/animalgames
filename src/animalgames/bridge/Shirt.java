package animalgames.bridge;

public class Shirt extends Show {

    public Shirt(SelectAPI selectAPI) {
        super(selectAPI);
    }

    public void select() {
        selectAPI.selectClothes();
    }
}
