package RunnableInterfaces;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Runnable: "+Thread.currentThread().getId()+" is Running: "+i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println("Excution is Inturupted");
            }
        }
    }
    public static void ppp(String[] args){
        MyRunnable runnable=new MyRunnable();
        Thread thread1=new Thread(runnable);
        Thread thread2=new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
