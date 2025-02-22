
import java.util.Scanner;

public class Ali_Kayra_Ilhan_Task3 {

    public static void main(String[] args) {
        String output = "";
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String s = scan1.nextLine();
        System.out.println("Enter the value of encryption: ");
        int p = scan1.nextInt();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int asciiVal = (int) c;
            if (asciiVal >= 65 && asciiVal <= 90) {
                asciiVal += p;
                if (asciiVal > 90) {
                    asciiVal = asciiVal - 26;
                }

            }

            output = output + (char) asciiVal;
        }
        System.out.println("Output: ");
        System.out.println(output);
    }

}
