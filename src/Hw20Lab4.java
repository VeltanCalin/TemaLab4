public class Hw20Lab4 {
    public static void main(String[] args) {
        int[] sir={4,5,7,2,9,6,12,45,76};
        //int d=0;
        //int t=0;
        for(int i=0;i<sir.length/2;i++)
        {
             sir[i]=sir[i]*2;
        }

        for (int i=sir.length/2;i<sir.length;i++)
        {
            if(sir[i]%2!=0)
                sir[i]=sir[i]*3;

        }

        for (int i=0;i<sir.length/2;i++)
            System.out.print( sir[i] +" " + "\n");

        for (int i=sir.length/2;i<sir.length;i++)
            System.out.print( sir[i]+" ");


    }


}