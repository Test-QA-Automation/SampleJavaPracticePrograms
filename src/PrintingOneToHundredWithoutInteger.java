public class PrintingOneToHundredWithoutInteger
{
    public static void main(String[] args) {
        int one = 'A'/'A';
        String str = "..........";

        for (int i=one; i<=(str.length()*str.length()); i++) {
            System.out.println(i);
        }

        System.out.println("*******************************************");

        for (int i=one; i<=(str.length()*str.length()); i+=one) {
            System.out.println(i);
        }

    }
}
