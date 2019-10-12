import java.io.FileWriter;  
import java.util.*;
public class tr1 {
    public String name, nation; 
    public int nationrank;
    public void Insertd(String namep, String nationp, int nationrankp)
    {
        name = namep;
        nation = nationp;
        nationrank = nationrankp;
    }
    public static void main(String args[]){    
        tr1 ob[] = new tr1[4];
        Scanner cin = new Scanner(System.in);
         try{    
           FileWriter fw=new FileWriter("testout.txt",true);  

           for(int i=0;i<4;i++)
           {
               ob[i] = new tr1();
               System.out.println("Enter Name Nation Nation-Rank");
               String nameg = cin.next();
               String nationg = cin.next();
               int nationrankg = cin.nextInt();
               ob[i].Insertd(nameg, nationg, nationrankg);
               System.out.println("####");    
               fw.write(ob[i].name + " " + ob[i].nation + " " + ob[i].nationrank + "\n");   
           }
           
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  