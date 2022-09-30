public class P6_4 extends Thread
{
       public static void main(String args[])  
    {   
        P6_4 t1=new P6_4();    
        P6_4 t2=new P6_4();  
        P6_4 t3=new P6_4();  
         
        t1.setPriority(4);  
        t2.setPriority(7); 
        t3.setPriority(Thread.NORM_PRIORITY);
        
        System.out.println("Priority of thread t1 is: " + t1.getPriority()); //4  
        System.out.println("Priority of thread t2 is: " + t2.getPriority()); //7  
        System.out.println("Priority of thread t1 is: " + t3.getPriority());
    }  
}  
        
    