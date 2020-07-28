package project;

import java.util.*;
class recMenu
{
    int c=0,dec=0,bin=0,hexa=0,item=0,l=0,u=9,i=0,hd=0;String hex="";
    Scanner sc = new Scanner(System.in);
    int a[]=new int[10];
    void main()
    {
        System.out.println("Enter \n 1 for Decimal to hexadecimal \n 2 for Hexadecimal to Decimal \n 3 for binary search \n 4 for Linear Search");
        int s=sc.nextInt();
        switch(s)
        {
            case 1:
            {
                System.out.println("enter a Decimal Number");
                int num=sc.nextInt();
                decimal(num);
                break;
            }
            case 2:
            {
                System.out.println("enter a Hexadecimal number");
                hex=sc.next();

                int i=hex.length()-1;

                System.out.println(hexadecimal(hex,i));
                break;

            }
            case 3:
            {
                int j=0;
                System.out.println("enter the elements");
                for( j=0;j<10;j++)
                {
                    a[j]=sc.nextInt();
                }
                System.out.println("enter the item to be searched");
                item = sc.nextInt();
                BinSearch(l,u);
                break;
            }
            case 4:
            {
                int k;
                System.out.println("enter the elements");
                for(k=0;k<10;k++)
                {
                    a[k]=sc.nextInt();
                }
                System.out.println("enter the item to be searched");
                item = sc.nextInt();
                if(linearSearch(k,item))
                    System.out.println("found");
                else
                    System.out.println("Not found");
                break;
            }
            default:{
                System.out.println("Wrong Input");}
        }
    }

    void decimal(int n)
    {

        if(n>0)
        {
            int d=n%16;
            decimal(n/16);
            if(d>=0&&d<=9)
                System.out.print((char)(d+48));
            else
                System.out.print((char)(d+55));
        }

    }

    int hexadecimal(String s,int c)
    {
        if(c>=0)
        {
            char ch=s.charAt(c);
            if(ch>='0'&&ch<='9')
                hexa=hexa+(ch-48)*(int)Math.pow(16,hd++);
            if(ch>='A'&&ch<='F')
                hexa=hexa+(ch-55)*(int)Math.pow(16,hd++);
            hexadecimal(s,c-1);
        }
        return hexa;
    }

    void BinSearch(int l,int u)
    {

        int m=(l+u)/2;
        if(u>=l){
            if(item==a[m])
            {
                System.out.println("found");
                return;
            }   
            if(item>a[m])
                BinSearch(m+1,u);
            else
                BinSearch(l,m-1);}
        else if(l>u)
            System.out.println("not found");
    }

    boolean linearSearch(int i,int s)
    {
        if(i >= a.length)
            return false;
        if(a[i] == s)
            return true;
        else
            return linearSearch(i + 1,s);
    }

}
