/**
 * Klasse MVCController ist für die Erzeugung des User Interface und des Datenmodells verantwortlich.
 * Zusätzlich werden alle Benutzeraktionen im User Interface in Form von ActionEvents behandelt.
 * @author Timo
 * @version 1.0
 */
public class MVCController {

    private MVCView view;
    private MVCModel model;

    public MVCController() {
        //Erzeugung des User Interface durch ein Objekt der Klasse MVCView
        this.view = new MVCView(this);
        //Erzeugung des Datenmodells durch ein Objekt der Klasse MVCModel
        this.model = new MVCModel();

        testeRezeptverwaltung();

    }

    public void testeRezeptverwaltung() {

        Zutat limette = new Zutat("Limette", 2.00);
        Zutat zucker = new Zutat("Zucker", 0.25);
        Zutat orange = new Zutat("Orange", 1.50);
        Zutat zitrone = new Zutat("Zitrone", 1.00);
        Zutat minze = new Zutat("Minze", 0.75);
        Zutat wasser = new Zutat("Wasser", 0.10);
        Zutat eis = new Zutat("Eis", 0.50);


        Zutat[] zutatenCaipirinha = {limette, zucker};
        Cocktail caipirinha = new Cocktail("Caipirinha", zutatenCaipirinha, false, false, 0, true);

        Zutat[] zutatenOrangenlimo = {orange, minze, wasser, eis};
        Limonade orangenlimo = new Limonade("Orangenlimo", zutatenOrangenlimo, false, true, "Orange", true);

        Zutat[] zutatenZitronenlimo = {zitrone, minze, zucker, wasser, eis};
        Limonade zitronenlimo = new Limonade("Zitronenlimo", zutatenZitronenlimo, false, false, "Zitrone", false);

        model.rezeptverwaltung.nehmeRezeptAuf(orangenlimo);
        model.zutatenverwaltung.nehmeZutatAuf(zitrone);
        model.zutatenverwaltung.nehmeZutatAuf(eis);
        model.zutatenverwaltung.nehmeZutatAuf(zitrone);

        Verkaufspreis[]speisen ={caipirinha,orangenlimo,zitronenlimo};
        System.out.println(ermittleGesamtpreis(speisen));

    }

    public double ermittleGesamtpreis (Verkaufspreis[]speisen){

        System.out.println("----");
        System.out.println("Gesamtpreis:");
        double gesamtpreis = 0.00;
        for (int i = 0; i < speisen.length; i++){
            if (speisen[i]!=null){
                gesamtpreis = gesamtpreis + speisen[i].ermittleVerkaufspreis();
            }
        }
        return gesamtpreis;

    }
}
