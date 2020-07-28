class fifo
{
    int a[],front=0,rear=-1;
    public fifo(int n)
    {
        a=new int[n];
    }

    void insert(int item)
    {
        if(rear==a.length-1)
        {
            System.out.println("overflow");           
        }
        else
            a[++rear]=item;
    }

    void remove()
    {
        if(rear==-1||front==rear+1)
        {
            System.out.println("underflow");
        }
        System.out.println("Deleted element="+a[front++]);
    }

    void display()
    {
        System.out.println("queue=");
        for(int i=front;i<=rear;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

    