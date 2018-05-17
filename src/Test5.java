// Se da un sir de numere ordonate crescator. Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia la care s-a gasit, altfel se va afisa -1

public class Test5 {

    public static void main(String[] args) {

        int n = SkeletonJava.readIntGUI("Introduceti numarul: ");
        int[] array = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int gasit = 0;
        int i = 0;

        do {
            if (n != array[i])
                i++;
            else
                gasit = 1;
        } while (gasit != 1 && array[i] <= n); // in cazul in care sirul nu ar fi ordonat crescator, va trebui sa parcurgem tot sirul, inlocuind a doua conditie cu i < array.length

        if (gasit == 1)
            SkeletonJava.printGUI("Numarul " + n + " se afla in sir la pozitia " + i);
        else
            SkeletonJava.printGUI("-1");
    }
}