class blood
{
    public static void main(int n,int n1)
    {
        int i,copy=n,copy1=n1;
        int k,k1,r=0,r1=0;
        if(n%10!=0&&n1%10!=0){
            for(i=1;i<=9;i++)
            {
                n=copy;
                k=0;k1=0;
                while(n>0)
                {
                    r=n%10;
                    if(r==i)
                        k=1;
                    n=n/10;

                }
                n1=copy1;
                while(n1>0)
                {
                    r1=n1%10;
                    if(r1==i)
                        k1=1;
                    n1=n1/10;

                }
                if(k==1&&k1==1)
                    System.out.println(i);
                else
                    System.out.println("no digits match");
                break;
            }
        }
        else if((n%10==0)&&(n1%10==0))
            System.out.println(0);
    }
}
