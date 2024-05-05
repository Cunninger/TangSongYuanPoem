package 动态代理;

public class StaticProxy implements Person{
    private Person person;
    
    public StaticProxy(Person person) {
        this.person = person;
    }

    @Override
    public void doWork(){
        System.out.println("代理开始");
        person.doWork();
        System.out.println("代理结束");
    }
}

