import java.util.*;
class Trywords
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a long sentence");
        System.out.println("And then after pressing enter input the search word");
        String sent =sc.nextLine();
        String word=sc.next();
        Trywords T = new Trywords();
        String sub="";
        int i=0,m=0,count=0;
        char c=' ';
        for(i=0;i<sent.length();i++)
        {  
            c=sent.charAt(i);
            if(c==' ')
            {
                sub=sent.substring(m,i);
                m=i+1;
                if(T.test(sub,word))
                {
                    count++;
                    System.out.println("the word " +word+ "is present in the sentence" +count + "times" );
                }
            }
        }
    }

    boolean test(String z,String word)
    {
        int i=0;String sub="";
        int j=word.length();
        for(i=0;i<z.length()-word.length();i++)
        {
            if(z.substring(i,i+j)==word)
                break;
        }
        
    }
}