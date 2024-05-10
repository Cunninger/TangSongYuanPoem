package codetest;

public class copydemo {
   

    public static void main(String[] args) {
        Person a = new Person();
        Person b = a;

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


    }
}
