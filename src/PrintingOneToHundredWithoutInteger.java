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

        String inputString = "020";

        // Remove leading zeros
        String resultString = inputString.replaceFirst("^0+(?!$)", "");

        // Print the result
        System.out.println("Original String: " + inputString);
        System.out.println("Converted String: " + resultString);

    }
}
