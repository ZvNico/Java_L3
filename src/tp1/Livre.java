package tp1;

public class Livre {
    private String titre, auteur;
    private int nbPages;

    public static void main(String[] args) {
        Livre livre1 = new Livre("J.K Rolling", "Harry Potter à l'école des sorciers");
        Livre livre2 = new Livre("Adolf Hitler", "Mein Kampf");
        livre1.setNbPages(5);
        livre2.setNbPages(10);
        System.out.printf("Auteur de '%s': %s\nAuteur de '%s': %s\n", livre1.getTitre(), livre1.getAuteur(), livre2.getTitre(), livre2.getAuteur());
        System.out.printf("Nombre de pages de '%s': %d\nNombre de pages de '%s': %d\n", livre1.getTitre(), livre1.getNbPages(), livre2.getTitre(), livre2.getNbPages());
        System.out.printf("Nombre de pages de '%s' + nombre de pages de '%s': %d\n", livre1.getTitre(), livre2.getTitre(), livre1.getNbPages() + livre2.getNbPages());
    }

    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
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
}
