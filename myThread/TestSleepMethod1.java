package myThread;


class TestSleepMethod1 extends Thread{  
     public static int I=0;
 public void run(){  
   
  for(int i=1;i<5;i++){

    try{Thread.sleep(1500);}catch(InterruptedException e){System.out.println(e);}  
    I++;
    System.out.println(I +  Thread.currentThread().getName());  
    
  }  
 }  
 public static void main(String args[]){  
  TestSleepMethod1 t1=new TestSleepMethod1();  
  TestSleepMethod1 t2=new TestSleepMethod1();  
   
  t1.start();  
  t2.start();  
 }  
}  