import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;


public class ValidateClient {

	public static void main(String[] args) throws IOException {
		Socket s=new Socket("localhost", 2022);

        BufferedReader br=new BufferedReader(
            new InputStreamReader(System.in)
        );
        System.out.println("Enter UserName And Passwaord: ");
        String user=br.readLine();
        String pass=br.readLine();

        OutputStream os=s.getOutputStream();
        PrintStream ps=new PrintStream(os);

        ps.println(user);
        ps.println(pass);

        BufferedReader br1=new BufferedReader(
            new InputStreamReader(s.getInputStream())
        );
        String res=br1.readLine();

        System.out.println(res);

	}

}
