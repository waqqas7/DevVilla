package project;

import java.util.*;
class palSec
{
    public static void main()
    {
        int i=0,m=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String s=sc.nextLine();
        char c=' ';
        s=s+" ";
        String st="";
        s=s.toLowerCase();
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c==' ')
            {st=s.substring(m,i)+" "+st;
                m=i+1;
            }
        }
        if(s.compareTo(st)==0)
            System.out.println("palindromic");
        else
            System.out.println("No");
    }
}
