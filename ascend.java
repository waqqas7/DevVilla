class ascend
{
    public static void ain(int n)
    {
        int i=0,d=0;
        int copy=n;
        for(i=0;i<10;i++)
        {
            n=copy;
            while(n>0)
            {
                d=n%10;
                if(d==i)
                    System.out.print(d);
                n=n/10;
            }
        }
    }
}
