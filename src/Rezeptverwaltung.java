import java.util.InputMismatchException;
import java.util.Scanner;

public class Rezeptverwaltung {

    private BasisRezept[] rezepte;

    public Rezeptverwaltung (){

        rezepte = new BasisRezept[1000];

    }

    public void nehmeRezeptAuf (BasisRezept rezept) {

        boolean aufgenommen = false;
        for (int i = 0; i < rezepte.length; i++){
            if(rezepte[i]!=null && rezepte[i].getName().equals(rezept.getName())
                    && rezepte[i].getTyp().equals(rezept.getTyp())){
                aufgenommen = true;
                rezepte[i] = rezept;
                System.out.println("Rezept: " + rezept.getName() + " wurde aktualisiert");
                break;
            }
        }
        if (aufgenommen == false){
            for (int i = 0; i < rezepte.length; i++){

                if (rezepte[i] == null){
                    aufgenommen = true;
                    rezepte[i] = rezept;
                    System.out.println("Rezept: " + rezept.getName() + " wurde aufgenommen");
                    break;
                }
            }
        }
        if (aufgenommen == false){
            System.out.println("Rezept konnte nicht aufgenommen werden. Alle verfügbaren Plätze sind belegt");
        }
    }

    public void zeigeAlleRezepteAn () {

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                System.out.println(rezepte[i].getName());

            }
        }
    }

    public void loescheRezept (String rezeptname, String rezeptart){

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                if (rezepte[i].getName().equals(rezeptname) && rezepte[i].getTyp().equals(rezeptart)){

                    rezepte[i] = null;

                }
            }
        }
    }

    public void zeigeRezeptAn (String rezeptname, String rezeptart){

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                if (rezepte[i].getName().equals(rezeptname) && rezepte[i].getTyp().equals(rezeptart)){

                    System.out.println("Anzeige von Rezept:");
                    System.out.println("Name: " + rezepte[i].getName());
                    System.out.println("Rezeptart: " + rezepte[i].getTyp());
                    System.out.print("Zutaten: ");
                    for (int j = 0; j < rezepte[i].getZutaten().length; j++){

                        System.out.print(rezepte[i].getZutaten()[j].getName() + " ");

                    }
                }
            }
        }
    }

    public int ermittleAnzahlRezepte (String rezeptart){

        int anzahl = 0;

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                if (rezepte[i].getTyp().equals(rezeptart)){

                    anzahl++;

                }
            }
        }
        return anzahl;
    }

    public int ermittleAnzahlRezepte (){

        int anzahl = 0;

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                anzahl++;

            }
        }
        return anzahl;
    }

    public BasisRezept getRezept(String rezeptname, String rezeptart){

        boolean aktualisiert = false;
        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                if (rezepte[i].getName().equals(rezeptname) && rezepte[i].getTyp().equals(rezeptart)){

                    return rezepte[i];

                }
            }
        }

        if (aktualisiert == false){
            System.out.println("Rezept nicht gefunden");
        }
        return null;

    }


    public BasisRezept[] getRezepte() {
        return rezepte;
    }

    public void setRezepte(BasisRezept[] rezepte) {
        this.rezepte = rezepte;
    }

}
