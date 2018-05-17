import static java.lang.Math.*;

public class Hw9Lab4 {
    public static void main(String[] args) {

        double distantaDintreOrase=SkeletonJava.readDoubleConsole("Distanta dintre orase este: ");
        double vitezaIon=SkeletonJava.readDoubleConsole("Viteza lui Ion este: ");
        double vitezaFlorica=SkeletonJava.readDoubleConsole("Viteza Floricai este: ");
        double distantaIon=0;
        double timp=0;

        distantaIon=distantaDintreOrase*vitezaIon/(vitezaFlorica+vitezaIon);

        timp=distantaIon/vitezaIon*60;

        System.out.println("Ion si Florica se intalnesc dupa "+timp+" minute");
        System.out.println("Distanta parcursa de Ion este de "+distantaIon+" km");
    }
}