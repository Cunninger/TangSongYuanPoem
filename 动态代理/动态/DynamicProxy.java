package 动态代理.动态;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
// 代理对象需要实现InvocationHandler接口，重写invoke方法
    private Object tarObject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Object proxy, Method method, Object[] args 解释三个参数的作用
        // proxy: 代理对象
        // method: 被代理对象的方法
        // args: 被代理对象的方法的参数
        System.out.println("代理开始");
        Object result = method.invoke(tarObject, args);// 调用被代理对象的方法
        // 
        System.out.println("代理结束");
        return result;
    }

    public Object getInstance(Object tarObject) {
        this.tarObject = tarObject;
        return java.lang.reflect.Proxy.newProxyInstance(tarObject.getClass().getClassLoader(), tarObject.getClass().getInterfaces(), this);
        //                                              被代理对象的类加载器   被代理对象实现的接口     代理对象  
    }
    
}
// 1.生成代理对象
// 2.进入代理对象的invoke方法
// 3.执行被代理对象的invoke方法
