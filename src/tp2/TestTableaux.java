package tp2;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Random;


public class TestTableaux {

    public static void main(String[] args) {
        int[] tab = new int[10];
        generer(tab);
        afficher(tab);
        System.out.println(maximum(tab));
        System.out.println(somme(tab));
        System.out.println(moyenne(tab));
        System.out.println(tousEgaux(tab));
        System.out.println(egaux(tab, tab));
        System.out.println(recherche(tab, 50));
        System.out.println(estTrie(tab));
    }

    public static boolean est_vide(int[] array) {
        return array.length <= 0;
    }

    public static void afficher(int[] array) {
        if (est_vide(array)) {
            System.out.println("Le tableau est vide et ne peut donc pas être affiché");
        } else {
            for (int value : array) {
                System.out.printf("%d ", value);
            }
            System.out.println();
        }
    }

    public static void generer(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int somme(int[] array) {
        int res = 0;
        for (int value : array) {
            res += value;
        }
        return res;
    }

    public static double moyenne(int[] array) {
        return (double) somme(array) / array.length;
    }

    public static boolean tousEgaux(int[] array) {
        int first = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != first) {
                return false;
            }
        }
        return true;
    }

    public static boolean egaux(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean recherche(int[] array, int n) {
        for (int value : array) {
            if (value == n) {
                return true;
            }
        }
        return false;
    }

    public static boolean estTrie(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
