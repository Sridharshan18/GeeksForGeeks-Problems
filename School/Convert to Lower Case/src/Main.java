import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(convertToLowerCase(s));
    }

    public static String convertToLowerCase(String s)
    {
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i< s.length(); i++)
        {
            char a;
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                a = (char) (s.charAt(i) + 32);
            }
            else
            {
                a = s.charAt(i);
            }

            ans = ans.append(a);
        }
        return ans.toString();
    }
}