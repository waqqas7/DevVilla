class vuddle
{
    void ain()
    {
        int i=1;
        int a=1309;
        int j=15028;
        //vuddle ob =new vuddle();
        first(a,i);
        second(j,i);
    }

    void first(int a,int i)
    {
        if(i<a)
        {
            if(a%i==0)
                System.out.println(i);   
            first(a,i+1);

        }
        return;
    }

    void second(int j,int i)
    {
        if(i<j)
        {
            if(j%i==0)
                System.out.println(i);
            second(j,i+1);
        }
    }
}
