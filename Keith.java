import java.util.*;
class Keith
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int copy=n;
        int d=0,i=0,c=0,index=0,sum=0,j=0;
        while(copy>0)
        {
            d=copy%10;
            copy/=10;
            c++;
        }
        copy=n;
        int a[]=new int[c];
        index=c;
        while(copy>0)
        {
            a[--index]=copy%10;
            copy=copy/10;
        }
        for(j=0;j<c;j++)
        {
            sum=sum+a[j];
        }
    }
}

