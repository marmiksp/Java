import java.net.*;
import java.io.*;
import java.util.*;

public class Server
{
    public static void main(String args[]) throws Exception
    {
        Scanner cin = new Scanner(System.in);
        ServerSocket ss = new ServerSocket(5111);
        Socket s = ss.accept();
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        
       // PrintWriter pr = new PrintWriter(s.getOutputStream());
        String str1="a" ,str2 ="a"; 
       // InputStreamReader in = new InputStreamReader(s.getInputStream());
        //BufferedReader br = new BufferedReader(in); 

        while(!(str1.equals("bye")))
        {
            // Recieve msg
            str1 = (String)dis.readUTF();
            System.out.println(str1);
            // Send msg
            str2 = cin.nextLine();
            dos.writeUTF(str2);  
            dos.flush();  
    
        }
        s.close();
        ss.close();
      
        dos.close();
        dis.close();
    }
}