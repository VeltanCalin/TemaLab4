import java.util.Scanner;


public class Hw11Lab4 {

    public static void main(String[] args) {


        int[] a = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
        int var=-1;
        int nr;
        int poz=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number: ");
        nr = sc.nextInt();


        for (int i = 0; i < a.length; i++) {

            if (nr == a[i]) {

                System.out.println("Pozitia numarului este: " + i);
                 var++;
                  }
            if(var == -1)
                System.out.println(var);

            }


        }
    }



