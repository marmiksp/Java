import java.io.*;  
public class tr2 {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("testout.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;
          String str = br.readLine(); 
          while(str != null){   
           
           String s1[] = str.split("\\s");
            str =  br.readLine();
          System.out.println(s1[1]);  
          }
          br.close();    
          fr.close();    
    }    
}    