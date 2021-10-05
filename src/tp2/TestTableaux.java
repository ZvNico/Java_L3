package tp2;

public class TestTableaux {

    public static void main(String[] args) {
        int[] tab = new int[10];
        for (int i = 0; i < 10; i++) {
            tab[i] = i * 3;
        }
        afficher(tab);
    }

    public static boolean est_vide(int[] array) {
        return array.length <= 0;
    }

    public static void afficher(int[] array) {
        for (int value : array) {
            System.out.print(value);
        }
        System.out.println();
    }

    public TestTableaux() {

    }
}
