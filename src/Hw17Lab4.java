public class Hw17Lab4 {


    public static void main(String[] args) {


        int [] array = {16,85,46,92,31,78,20};


        for (int i = 0; i < array.length; i++)
            if (array[i] > array[i + 1])

                System.out.println("Perechea de numere este: " + array[i] + ',' + array[i + 1]);

    }
}