import java.io.*;  
import java.util.*;
public class obtr1 implements Serializable{
    public String name, nation; 
    public int nationrank;
    public void Insertd(String namep, String nationp, int nationrankp)
    {
        name = namep;
        nation = nationp;
        nationrank = nationrankp;
    }
    public static void main(String args[]){    
        obtr1 ob[] = new obtr1[3];
        Scanner cin = new Scanner(System.in);
         try{    
     //      FileWriter fw=new FileWriter("testout.txt",true);  
            FileOutputStream fout=new FileOutputStream("fobj.txt");  
            ObjectOutputStream out=new ObjectOutputStream(fout);  
            //out.writeObject(s1);  
           for(int i=0;i<3;i++)
           {
               ob[i] = new obtr1();
               System.out.println("Enter Name Nation Nation-Rank");
               String nameg = cin.next();
               String nationg = cin.next();
               int nationrankg = cin.nextInt();
               ob[i].Insertd(nameg, nationg, nationrankg);
               out.writeObject(ob[i]);
              out.flush();
   //            fw.write(ob[i].name + " " + ob[i].nation + " " + ob[i].nationrank + "\n");   
           }
           
           out.close();
           fout.close();
           
           //fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  