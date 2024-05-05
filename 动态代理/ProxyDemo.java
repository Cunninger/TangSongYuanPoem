package 动态代理;

public class ProxyDemo {
    public static void main(String[] args) {
        Person student = new Student();
        StaticProxy staticProxy = new StaticProxy(student);
        student.doWork();
        staticProxy.doWork();
    }
}
// 目标对象 student
// 代理对象 StaticProxy
// 代理对象和目标对象都实现了同一个接口 Person
// 代理对象中持有目标对象的引用
// 代理对象中的方法调用目标对象的方法
