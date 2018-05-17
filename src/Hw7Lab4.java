public class Hw7Lab4 {
    public static void main(String[] args) {

        //citirea pretului
        double pretProdus=SkeletonJava.readDoubleGUI("Pretul produsul este: ");

        double pretTVA=0;
        pretTVA=0.19*pretProdus;

        SkeletonJava.printGUI("TVA-ul este de: " + pretTVA);
    }
}