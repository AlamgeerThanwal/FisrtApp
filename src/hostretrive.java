import java.net.*;
class hostretrive
{
    public static void main(String args[])throws UnknownHostException
    {
        String s;
        InetAddress adr= InetAddress.getLocalHost();
        System.out.println(adr);
        adr=InetAddress.getByName("127.0.0.1");
        s= adr.getHostName();
        System.out.println(s);
        adr=InetAddress.getByName("HALL-PC");
        s=adr.getHostAddress();
        System.out.println(s);
        InetAddress in[]=InetAddress.getAllByName("www.msbte.or.on");
        for(int i = 0; i<in.length;i++);
        System.out.println(in[1]);
    }
}