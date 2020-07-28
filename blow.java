class blow
{

    public static String recursion(String a)
    {
        if(a.length()==0)return "";
        else
        
            return recursion(a.substring(1))+a.charAt(0);
        
    }

    public static void disp()
    {
        String ss= "ABCDE";
        for(int i=ss.length();i>0;i--)
            System.out.println(recursion(ss.substring(0,i)));
    }
}