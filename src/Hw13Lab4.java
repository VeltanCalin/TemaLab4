public class Hw13Lab4 {

    public static void main(String[] args) {

        int sum = 0;
        int counter=0;
        int n;
        //int n = SkeletonJava.readIntGUI("Please input a number: ");

        do {
            n = SkeletonJava.readIntGUI("Please input a number:");
            SkeletonJava.printConsole(n);

            if (n > 4 & n < 11) {
                sum += n;
                counter++;
                if(counter>1) {
                    SkeletonJava.printConsole("Sum is:" + sum);
                }
                SkeletonJava.printConsole(" " );
            }

            else
                SkeletonJava.printConsole("Element is out of range");

        } while (n != 0);

        SkeletonJava.printConsole("Program has stopped");

    }
}