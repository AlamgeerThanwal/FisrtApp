import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.InputStreamReader;
public class SetverSide  {
    public static void main(String[]args) throws IOException
    {
        ServerSocket s=new ServerSocket(2045);
        System.out.println("Server Started, Waiting for client");
         Socket s1=s.accept();
         BufferedReader br=new BufferedReader(
             new InputStreamReader(s1.getInputStream())
         );
         OutputStream out =s1.getOutputStream();
         PrintStream ps=new PrintStream(out);

         BufferedReader br1 =new BufferedReader(
             new InputStreamReader(System.in)
         );
         do{
             String res =br.readLine();
             System.out.println("Client Send: "+res);
             System.out.println("Server: ");
             String msg=br1.readLine();
             System.out.print("\n\n");
             ps.println(msg);

         }
         while(true);
    }
} 
    
