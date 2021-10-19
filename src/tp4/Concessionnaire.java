package tp4;
import java.util.ArrayList;

public class Concessionnaire {
    private String adresse;
    private String codePostal;
    private String ville;
    private String marque;
    private ArrayList<Voiture> voitures;

    public Concessionnaire(String adresse, String codePostal, String ville, String marque) {
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.marque = marque;
        voitures = new ArrayList<Voiture>();
    }

    public void addVoiture(Voiture voiture){
        if (marque.equals(voiture.getMarque())){
            voitures.add(voiture);
        } else {
            System.out.println("Erreur: La voiture n'est pas de la même marque que le concessionnaire");
        }
    }

    public void removeVoiture(Voiture voiture){
        voitures.remove(voiture);
    }

    @Override
    public String   toString() {
        return "Concessionnaire{" +
                "adresse='" + adresse + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                ", voitures=" + voitures +
                '}';
    }
}
