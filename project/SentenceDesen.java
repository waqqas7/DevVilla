package project;

import java.util.*;
class SentenceDesen
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String s=sc.nextLine();
        s=s+" ";
        String a[]=new String[s.length()];
        int i=0,m=0,index=0,j=0;
        String sub="";
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                sub=s.substring(m,i);
                m=i+1;
                a[index++]=sub;
            }
        }
        for(i=0;i<index;i++)
        {
            for(j=0;j<index-1-i;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    sub=a[j];
                    a[j]=a[j+1];
                    a[j+1]=sub;
                }
            }
        }
        System.out.println(" new sentence-->");
        for(i=0;i<index;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

