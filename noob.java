class noob
{
    public static void main()
    {
        int A[]=new int[10];
        int i=0,k=2,count=0,j=0;
        for(i=0;i<10;i++)
        {
            A[i]=++j;
        }
        while(k<10)
        {
            count=0;
            for(i=1;i<=10;i++)
            {
                if(A[count]%k!=0)
                    A[count]=i;
                else if(A[count]%k==0)
                    A[count]=0;
                count=count+1;
            }

            for(i=0;i<10;i++)
            {
                System.out.print(A[i]+" ");
            }
            k++;
        }
    }
}

