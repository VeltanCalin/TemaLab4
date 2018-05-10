
public class Hw19Lab4 {


    public static void main(String[] args) {


        int[] a = {5, 2, 89, 65, 15, 34, 67, 82, 97, 107};
        int i;
        int j;
        int n = a.length;

        for (i = 0; i < n; i++) {

            for (j = 1; j < n - 1; j++) {

                if (a[j - 1] > a[j]) {

                    int tmp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                }
            }
        }

        System.out.println("Elementele ordonate crescator sunt:");

        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}



















