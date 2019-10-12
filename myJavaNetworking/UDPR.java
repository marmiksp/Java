import java.net.*;  
public class UDPR{  
  public static void main(String[] args) throws Exception {  
    DatagramSocket ds = new DatagramSocket(3000);  
    byte[] buf = new byte[10240000];  
    DatagramPacket dp = new DatagramPacket(buf, 10240000);  
    while(true)
    {
    ds.receive(dp);  
    String str = new String(dp.getData(), 0, dp.getLength());  
    if(str == "bye")
    { break; }

    System.out.println(str);   } 
    ds.close();  
  }  
}  