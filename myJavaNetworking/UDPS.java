import java.net.*;  
import java.util.*;
public class UDPS{  
  public static void main(String[] args) throws Exception {  
    DatagramSocket ds = new DatagramSocket();  
    Scanner cin = new Scanner(System.in);
    String str="k" ;
    while(str != "bye")
    {
    str = cin.next(); 
    InetAddress ip = InetAddress.getByName("127.0.0.1");  
     
    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);  
    ds.send(dp);  
    }
    ds.close();  
  }  
}  