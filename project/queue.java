package project;
class queue
{
    int front,rear,a[];
    queue(int size)
    {
        front=-1,rear=0;
        a=new int[size];
    }

    void insert(int x)
    {
        if(rear==a.length-1)
            System.out.println("Overflow");
        else
            a[++front]=x;
        System.out.println("element entered");
    }

    int remove()
    {
        if(front==-1)
            System.out.println("Underflow");
        return a[front++] ;
    }
    
    