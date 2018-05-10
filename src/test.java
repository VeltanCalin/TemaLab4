import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        int n = SkeletonJava.readIntGUI("introduceti lungimea sirului: ");
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = SkeletonJava.readIntGUI("introdu elementul: ");
        }

        SkeletonJava.printConsole("Sirul introdus este: " + Arrays.toString(array));
    }
}


