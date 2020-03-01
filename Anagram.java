import java.util.*;
public class Anagram{
    public static void main(String [] args)
    {
        Scanner g=new Scanner(System.in);
        String s1=g.nextLine();
        String s2=g.nextLine();
        char []a=new char[s1.length()];
        char []b=new char[s1.length()]; 
        a=s1.toCharArray();
        b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(a[i]==b[i])
            {
                count++;
            }
        }
        if(count==s1.length())
        {
            System.out.println("Yes Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        g.close();
    }
}