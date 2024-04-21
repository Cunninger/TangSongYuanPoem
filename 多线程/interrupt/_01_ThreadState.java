package 多线程.interrupt;
import java.util.concurrent.TimeUnit;

public class _01_ThreadState {
    public static void main(String[] args) {
        // Thread thread = new Thread();
        // System.out.println("1- " + thread.getState());
        // thread.start();
        // System.out.println("2- " + thread.getState());

        // try {
        //     TimeUnit.MILLISECONDS.sleep(1);
        // } catch (InterruptedException e) {
        //     SmallTool.printTimeAndThread("产生中断" + e.getMessage());
        // }

        // System.out.println("3- " + thread.getState());

        Thread thread = new Thread(() -> {
            try {

                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });//  
        System.out.println("1- " + thread.getState()); // NEW
        thread.start();
        System.out.println("2- " + thread.getState()); // RUNNABLE
        
        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("3- " + thread.getState()); // TIMED_WAITING
    }

}
