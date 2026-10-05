package Thread_class;

public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread: "+ Thread.currentThread().getId()+" is Running: "+i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void uuuu(String[] args){
        MyThread thread1=new MyThread();
        MyThread thread2=new MyThread();
        thread1.start();
        thread2.start();
    }
}
