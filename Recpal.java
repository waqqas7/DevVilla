class Recpal
{
    void main(String s)
    {
        int d=s.length();
        int i=0;
        if (Rev(s,i,d)==s)
            System.out.println("It is a palindrome");
        else
            System.out.println("it is not a palindrome");
    }

    String Rev(String s,int i,int d)
    {
        String t="";
        if(i!=d)    
        { t=t+s.charAt(i);
            Rev(s,i+1,d);
        }
        return t;
    }
}

