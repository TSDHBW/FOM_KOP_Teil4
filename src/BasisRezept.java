public class BasisRezept {

    private String name;
    private Zutat[] zutaten;

    public BasisRezept(String name, Zutat[]zutaten){

        this.name = name;
        this.zutaten = zutaten;

    }

    public void zubereiten (int anzahlPortionen){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    public void setZutaten(Zutat[] zutaten) {
        this.zutaten = zutaten;
    }

}
