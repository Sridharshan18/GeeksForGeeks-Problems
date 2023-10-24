import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(binaryNumber(s));
    }

        public static boolean binaryNumber (String s)
        {
            for (int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);
                if (c != '0' && c != '1') {
                    return false;
                }
            }
            return true;
        }
}
