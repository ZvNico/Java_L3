package tp4;
import java.util.ArrayList;

public class Concessionnaire {
    private String adresse;
    private String codePostal;
    private String ville;
    private ArrayList<Voiture> voitures;

    public Concessionnaire(String adresse, String codePostal, String ville, ArrayList<Voiture> voitures) {
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.voitures = voitures;
    }

    @Override
    public String toString() {
        return "Concessionnaire{" +
                "adresse='" + adresse + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                ", voitures=" + voitures +
                '}';
    }
}
