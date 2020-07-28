import java.util.*;
class RecBinSearch
{
    int a[]=new int[10];
    int item; int l=0,u=9;
    Scanner sc=new Scanner(System.in);  
    void BinSearch(int l,int u)
    {

        int m=(l+u)/2;
        if(u>=l){
            if(item==a[m])
            {
                System.out.println("found"+ "at"+ m);
                return;
            }   
            if(item>a[m])
                BinSearch(m+1,u);
            else
                BinSearch(l,m-1);}
        else if(l>u)
            System.out.println("not found");
    }

    public  void main()
    {
        System.out.println("enter the elements");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the item to be searched");
        item = sc.nextInt();
        BinSearch(l,u);
    }
}