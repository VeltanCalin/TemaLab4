public class Hw15Lab4 {
    public static void main(String[] args) {
        int nr1= SkeletonJava.readIntConsole("Introduceti baza");
        int nr2= SkeletonJava.readIntConsole("Introduceti exponentul");
        int produs=1;

        for (int i=0;i<nr2;i++)
            produs=produs*nr1;

        System.out.println(produs);
    }
}