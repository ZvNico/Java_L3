package tp4;

public class Test {
    public static void main(String[] args) {
        Concessionnaire[] concessionnaires = new Concessionnaire[3];
        concessionnaires[0] = new Concessionnaire("14 Chemin des olivets","94800","Villejuif","Citroën");
        concessionnaires[1] = new Concessionnaire("50 Rue de la verte","91340","Ollainville","Renault");
        concessionnaires[2] = new Concessionnaire("13 Boulevard des capucines","75000","Paris","Peugeot");
        Voiture[] voitures = new Voiture[9];
        voitures[0] = new Voiture("Citroën","C1","citadine");
        voitures[1] = new Voiture("Citroën","C2","citadine");
        voitures[2] = new Voiture("Citroën","C4","routière");
        voitures[3] = new Voiture("Peugeot","208","citadine");
        voitures[3] = new Voiture("Peugeot","208 GTI","sportive");
        voitures[3] = new Voiture("Peugeot","508","routière");

    }
}
