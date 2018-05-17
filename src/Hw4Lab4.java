public class Hw4Lab4 {
    public static void main(String[] args) {
        double gradeC=0.0;

        //citire grade F
        double gradeF=SkeletonJava.readDoubleGUI("Grade F: ");



        //converitre F in C
        gradeC=(gradeF-32)*5/9;

        //afisare
        System.out.println(gradeF+" grade F reprezinta " + gradeC + " grade C");

    }
}
