package java13;

//抽象クラス
abstract class Zoo{
    void foo(){
        System.out.println("foo");
    }

    abstract void hoge();

    abstract  void piyo();
}

//抽象クラスを継承するクラス
class MyZoo extends Zoo{
    @Override
    void hoge(){
        System.out.println("hoge");
    }

    @Override
    void piyo() {
        System.out.println("piyo");
    }
}


public class SampleAbstract01 {
    public static void main(String[] args) {
        Zoo zoo1 = new MyZoo();
        zoo1.foo();

    }
}
