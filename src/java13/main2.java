package java13;

abstract class Zoo02{
    void foo(){
        System.out.println("Zoo01/foo()");
    }
    abstract void hoge();
}


class MyZoo01 extends Zoo02{
    void hoge(){
        System.out.println("MyZoo01/hoge()");
    }
}

class MyZoo02 extends MyZoo01{
    void hoge(){
        System.out.println("MyZoo02/hoge()");
    }
}

public class main2 {
    public static void main(String... args){
        Zoo02 z;
        z = new MyZoo02();
        z.foo();
        z.hoge();
    }
}
