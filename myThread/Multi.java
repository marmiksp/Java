package myThread;

class Multi extends Thread{  
public void run(){  
System.out.println("thread is running..." + Thread.currentThread().getName());  
}  
public static void main(String args[]){  
Multi t1=new Multi(); 
Multi t2=new Multi();  
 t2.setPriority(Thread.MAX_PRIORITY);  
 t1.setPriority(Thread.MIN_PRIORITY);  
t1.start();
t2.start();  
 }  
}  