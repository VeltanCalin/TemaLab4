public class Hw3Lab4 {

    public static void main(String[] args) {

        int sum=0;
        int n;
        int counter=0;
        int avg=0;

        do {
            n = SkeletonJava.readIntGUI("Please input a number:");
            SkeletonJava.printConsole(n);
            sum+=n;
            counter++;
            avg=sum/counter;
            if(counter>1) {
                SkeletonJava.printConsole("Average is:" + avg);

            }

        } while (n != 0);


    }
}

