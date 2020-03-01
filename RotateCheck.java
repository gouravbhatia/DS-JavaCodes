import java.util.*;
public class RotateCheck
{
    public static void main(String [] args)
    {
        Scanner g=new Scanner(System.in);
        String s1=g.nextLine();
        String s2=g.nextLine();
        int n=s1.length();
        String str=s1.substring(2)+s1.substring(0,2);
        String str1=s1.substring(n-2,n)+s1.substring(0,n-2);  
        System.out.println(str);
        System.out.println(str1);
        if(s2.equals(str)||s2.equals(str1))
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        g.close();

    }
}