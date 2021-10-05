package tp3;

public class Livre {
    private String titre, auteur;
    private int nbPages;
    private double prix;
    private boolean isPrixFixe;

    public static void main(String[] args) {
        Livre livre1 = new Livre("J.K Rolling", "Harry Potter à l'école des sorciers");
        Livre livre2 = new Livre("Adolf Hitler", "Mein Kampf");
        livre2.setNbPages(10);
        System.out.println(compare2(livre1, livre2));
    }

    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    public Livre(String unAuteur, String unTitre, double prix) {
        this(unAuteur, unTitre);
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public double getPrix() {
        return prix;
    }

    public boolean isPrixFixe() {
        return isPrixFixe;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setNbPages(int nbPages) {
        if (nbPages >= 0) {
            this.nbPages = nbPages;
        } else {
            System.out.println("Le nombre de pages passé en paramètre doit être positif pour modifie l'attribut");
        }
    }

    public void setPrix(double prix) {
        if (isPrixFixe) {
            System.out.println("Le prix à déjà été fixé");
        } else {
            this.prix = prix;
            setPrixFixe(true);
        }
    }

    public void setPrixFixe(boolean prixFixe) {
        isPrixFixe = prixFixe;
    }

    public static boolean compare2(Livre livre1, Livre livre2) {
        return livre1.nbPages == livre2.nbPages;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", nbPages=" + nbPages +
                (isPrixFixe ? "Prix pas encore donnée" : "prix=" + prix) +
                '}';
    }
}
