package builder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        //Using Runnable 
        Printer p = new Printer();
        Thread t = new Thread(p);
   //   Printer p = new Printer();
      //  System.out.println("Main before "+Thread.currentThread().getPriority());
      //  Thread.currentThread().setPriority(7);
      //  Thread t = new Thread(p);
     //   t.setPriority(10);//high priority to child thread
     //   System.out.println("Main thread priority "+Thread.currentThread().getPriority());
      //  System.out.println("child thread priority "+t.getPriority());
      
      t.start();
  //    t.join(1000);
  t.interrupt();
  //   Printer p = new Printer();
    // p.setDaemon(true);
     //p.start(); //no strat method in priner class but its there in parent class thread
    //  System.out.println("This is form main thread");
    // p.run(); //not get a new thread- not a multi threading scenario
      for(int h=0;h<50;h++){
          System.out.println("main "+Thread.currentThread().getName()+" "+h);
      }
    
 System.out.println("############");
     //instead of start method what will hapen if we run()
    
}
    //tread join
    
}
//when the child thread is a deamin thread program will not wait until it co 
//program terminates when the last non daemon thread terminates