import java.util.*;
public class Panagram
{
    public static void main(String [] args)
    {
        Scanner g=new Scanner(System.in);
        String s1=g.nextLine();
        s1=s1.toLowerCase();
        s1=s1.replaceAll(" ","");
        int flag[]=new int[26];
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            flag[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(flag[i]!=0)
            {
                count++;
            }
            
        }
        if(count==26)
        {
            System.out.println("Yes Pangram");
        }
        else
        {
            System.out.println("No Pangram");
        }
        /*char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(arr[i]==s2.charAt(j))
                {
                    flag++;
                    break;
                }
            }
        }
        if(flag==26)
        {
            System.out.println("Yes Pangram");
        }
        else
        {
            System.out.println("Not Pangram");
        }*/
        g.close();
    }
}