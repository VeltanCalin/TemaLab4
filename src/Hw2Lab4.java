import java.util.Scanner;

public class Hw2Lab4 {

    public static void main(String[] args) {

        int sum = 0;
        int n;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter how many numbers to cal  avg");

        n=sc.nextInt();

        int myArray[]=new int[n];
        System.out.println("enter   "+n+"  numbers");

        for(int i=0;i<n;i++)
            myArray[i]=sc.nextInt();

        for(int i=0;i<n;i++)
            sum +=myArray[i];

        System.out.println("average="+sum/n);

    }




}
