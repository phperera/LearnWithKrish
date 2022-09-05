public class Printer implements Runnable{
    
    
 /*  public void start(){
       // super.start();
        System.out.println("this is start");
        super.start();
    }*/
    
    @Override
    public void run(){
       // System.out.println("his is from child thread");
    for(int i=0;i<50;i++){
        System.out.println("child "+Thread.currentThread().getName()+" "+ i);
      try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            System.out.println("Im up...");
            //Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
       
   
    //can overload the run methods but always the no argumnet method will invoke first
 //   public void run(int x){
   //     for(int i=0;i<10;i++){
      //  System.out.println("child "+Thread.currentThread().getName()+" "+i);
    //}
    }
}

