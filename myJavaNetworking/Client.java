import java.net.*;
import java.io.*;
import java.util.*;

public class Client
{
    public static void main(String args[]) throws Exception
    {
        Scanner cin = new Scanner(System.in); // H
        Socket s = new Socket("localhost", 5111);
        //PrintWriter pr = new PrintWriter(s.getOutputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str1="a",str2 ="a";
        //InputStreamReader in = new InputStreamReader(s.getInputStream());
        //BufferedReader br = new BufferedReader(in); 

        while(!(str1.equals("bye")))
        {
            // Send msg
            str2 = cin.nextLine();
            dos.writeUTF(str2);  
            dos.flush(); 
            // Recieve msg
            str1 = (String)dis.readUTF();
            System.out.println(str1);
             
        }

        s.close();
    
        dos.close();
        dis.close();
    }
}