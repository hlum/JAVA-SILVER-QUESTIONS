package java13;


//抽象クラス
abstract class Zoo2{
    void foo(){
        System.out.println("foo");
    }

    abstract void hoge();

    abstract  void piyo();
}


abstract class SubZoo extends  Zoo2{
    @Override
    void hoge(){
        System.out.println("hoge");
    }
}

//抽象クラスを継承するクラス
class MyZoo2 extends SubZoo{

    @Override
    void piyo() {
        System.out.println("piyo");
    }
}


public class SampleAbstract02 {
    public static void main(String... args){
        Zoo2 zoo = new MyZoo2();
        zoo.hoge();
    }
}
