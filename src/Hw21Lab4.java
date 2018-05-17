public class Hw21Lab4 {
    public static void main(String[] args) {
        int[] sir={4,5,7,2,9,6,12,45,76};
        int[] sirExtras=new int[sir.length];
        int primaValoare=0;
        int aDouaValoare=0;
        int aux=0;
        int aux1=0;

        primaValoare=SkeletonJava.readIntConsole(" Introduceti primul numar ");
        aDouaValoare=SkeletonJava.readIntConsole(" Introduceti al doilea numar ");

        //salvarea pozitiilor celor doua valori
        for (int i=0;i<sir.length;i++) {
            if (sir[i] == primaValoare)
                aux = i;
            if (sir[i] == aDouaValoare)
                aux1 = i;
        }

        //crearea sirului nou
        for (int i=aux;i<=aux1;i++)
        {
            sirExtras[i]=sir[i];
        }

        //afisare
        for (int i=aux;i<=aux1;i++)
            System.out.print(sirExtras[i]+" ");
    }
}