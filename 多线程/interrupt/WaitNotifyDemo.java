package 多线程.interrupt;

public class WaitNotifyDemo {
    public static void main(String[] args) {
        final Object lock = new Object();// 解释   线程之间的通信是通过对象锁来进行的，
        // 每个对象都有一个锁，线程可以通过synchronized关键字来获取对象的锁，
        // 当线程获取到锁之后，就可以执行synchronized代码块，当线程执行完synchronized代码块之后，会释放锁。

        Thread waitingThread = new Thread(new Runnable() {
          
            @Override
            public void run() {
                System.out.println("等待线程正在等待通过");
                
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                
                System.out.println("等待线程已经收到信息，准备启动...");
            }
        });// 通过wait()方法可以让线程释放对象锁，进入等待状态。

        Thread notifyingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // Simulate some processing.
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                System.out.println("通信线程准备通知等待线程");
                try {
                    // Simulate some processing.
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                synchronized (lock) {
                    lock.notify();
                }
            }
        });// 通过notify()方法可以唤醒一个正在等待的线程，唤醒之后，等待线程就可以继续执行了。

        waitingThread.start();
        notifyingThread.start();
    }
}