package tp4;

public class Pneu {
    private Double largeur;
    private String marque;

    public Pneu(Double largeur, String marque) {
        this.largeur = largeur;
        this.marque = marque;
    }

    @Override
    public String toString() {
        return "Pneu{" +
                "largeur=" + largeur +
                ", marque='" + marque + '\'' +
                '}';
    }
}
