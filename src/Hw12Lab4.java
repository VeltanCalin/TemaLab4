
public class Hw12Lab4 {

    public static void main(String[] args) {

        int sum = 0;
        int i;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        int n = SkeletonJava.readIntGUI("Please input array length: ");
        int[] array = new int[n];

        for ( i = 0; i < array.length; i++) {
            array[i] = SkeletonJava.readIntGUI("Please input element: ");
            sum+=array[i];

        }

                System.out.println("Sum of array elements:" + sum);


    }



}
