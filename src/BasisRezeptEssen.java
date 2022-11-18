public class BasisRezeptEssen extends BasisRezept {

    private boolean vegetarisch;
    private boolean vegan;

    public BasisRezeptEssen(String name, Zutat[]zutaten, boolean vegetarisch, boolean vegan){

        super(name, zutaten);
        this.vegetarisch = vegetarisch;
        this.vegan = vegan;

    }

    public boolean isVegetarisch() {
        return vegetarisch;
    }

    public void setVegetarisch(boolean vegetarisch) {
        this.vegetarisch = vegetarisch;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

}
