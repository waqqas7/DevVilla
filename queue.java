                                   class queue
{
    int a[],front,rear;
    queue(int size)
    {
        a=new int[size];
        front=rear=-1;
    }

    void insert(int x)
    {
        if(rear==a.length-1)
        {    System.out.println("overflow");
            return;}
        else if(rear==-1)
        {
            front=rear=0;
            a[rear]=x;
        }
        else
            a[++rear]=x;
    }

    void remove()
    {
        int ele=-9999;
        if(front ==-1)
            System.out.println("Underflow");
        else if(front==rear)
        {
            ele=a[front];
            front =rear=-1;
        }
        else
        {
            ele=a[front++];
        }
        System.out.println(ele);
    }

    void display()
    {
        System.out.println("Queue --->");
        for(int i=0;i<rear;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
