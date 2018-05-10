import java.util.Arrays;
public class Hw6Lab4 {

    public static void main(String[] args) {
        int sum = 0;
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        int firstArray[] = {69,89,37,15,20,1,76,34,-65,33};
        int [] secondArray = new int[firstArray.length];

        for (i = 0; i < firstArray.length; i++) {

            if (max < firstArray[i]){
                max = firstArray[i];
            }
            if(min > firstArray[i]){
                min = firstArray[i];
            }
            sum+=firstArray[i];
            secondArray[j]=firstArray[i]*2;
            j++;
        }


        System.out.println("Maxim from array is:" + max );
        System.out.println("Minim from array is:" + min );
        System.out.println("Sum of array elements is :" + sum);
        System.out.println("Elements from second array:" + Arrays.toString(secondArray));
    }
}