import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(removeSpaces(s));
    }

    public static String removeSpaces(String s)
    {
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}