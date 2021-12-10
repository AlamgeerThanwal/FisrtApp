import java.net.*;
class Test
{
    public static void main(String[]args)
    {
        try{
            URL hp=new URL("https://youtu.be/oPn_RY7jO4c");
            System.out.println(hp.getProtocol());
            System.out.println(hp.getFile());

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}