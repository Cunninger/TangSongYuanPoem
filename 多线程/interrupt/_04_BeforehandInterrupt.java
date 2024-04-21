package 多线程.interrupt;
public class _04_BeforehandInterrupt {
    public static void main(String[] args) {

        Thread.currentThread().interrupt();

        try {
            SmallTool.printTimeAndThread("开始睡眠");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            SmallTool.printTimeAndThread("发生中断");
        }

        SmallTool.printTimeAndThread("结束睡眠");

    }
}
