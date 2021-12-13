import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.InputStreamReader;

public class ValidateServer
{
    public static void main(String[] args) throws IOException {
         
        {
            ServerSocket s=new ServerSocket(2022);
            System.out.println("Setver Started, Waiting for Client");
            Socket s1=s.accept();
            BufferedReader br=new BufferedReader(
                new InputStreamReader(s1.getInputStream())
            );


            String user=br.readLine();
            String pass=br.readLine();

            OutputStream out=s1.getOutputStream();
            PrintStream ps=new PrintStream(out);
            if(user.equals("abc")&& pass.equals("1234"))
            {
             ps.println("Validate Successfully");   
            }
            else
            {
                ps.println("Validate Un-Successfull");
            }
        }

    }
}