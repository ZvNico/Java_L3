package tp4;

import java.util.ArrayList;
import java.util.Objects;

public class Voiture {
    private String marque;
    private String modele;
    private String categorie;
    private ArrayList<Pneu> pneus;

    public Voiture(String marque, String modele, String categorie) {
        this.marque = marque;
        this.modele = modele;
        this.categorie = categorie;
        this.pneus = new ArrayList<Pneu>();
        String pneuMarque;
        if(marque.equals("Renault")){
            pneuMarque = "Continental";
        } else {
            pneuMarque = "Michelin";
        }
        for (int i = 0; i < 4;i++){
            pneus.add(new Pneu(0.250,pneuMarque));
        }
    }

    public String getMarque() {
        return marque;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", categorie='" + categorie + '\'' +
                ", pneus=" + pneus +
                '}';
    }
}

