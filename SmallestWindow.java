import java.util.*;
public class SmallestWindow
{
    public static void main(String [] args)
    {
        Scanner g=new Scanner(System.in);
        String str=g.nextLine();
        String pattern=g.nextLine();
        str=str.toLowerCase();
        pattern=pattern.toLowerCase();
        int len1=str.length();
        int len2=pattern.length();
        int count[]=new int[26];
        int count1[]=new int[26];
        for(int i=0;i<len1;i++)
        {
            for(int j=i+1;j<len1;j++)
            {
                if(str.substring(i,j)==pattern)
                {
                    System.out.println(str.substring(i,j));
                }
            }
        }
        for(int i=0;i<len2;i++)
        {
            count[pattern.charAt(i)-'a']++;
        }
        for(int i=0;i<len1;i++)
        {
            count1[str.charAt(i)-'a']++;
        }
        g.close();
    }
}