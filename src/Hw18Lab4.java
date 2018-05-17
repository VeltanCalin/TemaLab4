

public class Hw18Lab4 {

    public static void main(String[] args) {

        int x = SkeletonJava.readIntGUI("Introduceti numarul: ");
        int n = SkeletonJava.readIntGUI("Introduceti puterea: ");
        int sum = 1;
        int putere = 1;

        for (int i = 1; i <= n; i++) {
            putere *= n;
            sum += putere;
        }

        SkeletonJava.printGUI("Suma este: " + sum);
    }
}