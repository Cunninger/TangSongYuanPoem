package 动态代理;

public class ProxyDemo {
    public static void main(String[] args) {
        Person student = new Student();
        StaticProxy staticProxy = new StaticProxy(student);
        student.doWork();
        staticProxy.doWork();
    }
}
