import java.io.*;  
public class obtr2 implements Serializable {  
    public static void main(String args[])throws Exception{    
          //FileReader fr=new FileReader("testout.txt");    
          //BufferedReader br=new BufferedReader(fr);    
           ObjectInputStream in=new ObjectInputStream(new FileInputStream("fobj.txt"));  
          int i;
          boolean flag = true;
           obtr1 ob = (obtr1) in.readObject();
          while(flag){   
           
           //String s1[] = str.split("\\s");
            //str =  br.readLine();
          
          System.out.println(ob.name + " " + ob.nation + " " + ob.nationrank + "\n");
          try{ob = (obtr1)in.readObject();  }
          catch(Exception e)
          {
              flag = false;
          }
             
          }
           in.close();
     
    }    

} 