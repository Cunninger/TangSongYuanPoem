package 动态代理.动态;

import java.util.ArrayList;
import java.util.List;

public class testDynamicProxy {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        List<String> dynamicProxyList = (List)new DynamicProxy().getInstance(new ArrayList<String>());;
        dynamicProxyList.add("hello");
        System.out.println(dynamicProxyList.toString());

    }
}
