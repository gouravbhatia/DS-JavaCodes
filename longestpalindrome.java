import java.util.*;
public class longestpalindrome{
    public static void main(String [] args)
    {
        Scanner g=new Scanner(System.in);
        String s=g.nextLine();
        int count=0;
        int j=0;
        for(int i=s.length()-1;i>=0;i--)
        {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
                j++;
        }
        if(count==s.length())
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        g.close();
    }
}