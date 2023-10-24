import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] s = { "Geek", "Geeks", "Geeksfor",
                "GeeksforGeek", "GeeksforGeeks" };
        int n = s.length;
        System.out.println(displayLongestName(s,n));
    }

    public static String displayLongestName(String[] s , int n )
    {
        int maxlength = 0;
        for(int i = 0 ; i<n ; i++)
        {
            if(s[i].length()>s[maxlength].length())
            {
                maxlength = i;
            }
        }
        return s[maxlength];
    }
}