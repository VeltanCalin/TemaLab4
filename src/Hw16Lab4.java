public class Hw16Lab4 {

    public static void main(String[] args) {

        int i,n;
        int prod=1;


        n = SkeletonJava.readIntGUI("Please input a number:");
        SkeletonJava.printConsole(n);
        for( i=1; i<=n; i++)
            prod*=i;


            SkeletonJava.printConsole("Factorial:" + prod);
        }


}
