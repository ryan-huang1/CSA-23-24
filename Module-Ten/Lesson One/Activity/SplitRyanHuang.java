public class Tester
{
    public static void main(String args[])
    {
        String s = "Hello again";
        String sp[];

        sp = s.split("a");

        for(int j = 0; j < sp.length; j++)
        {
            System.out.println(sp[j]);
        }
    }
}
