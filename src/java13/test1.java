package java13;

class Test{
    void foo(){
        System.out.println("Test/foo");
    }

    void piyo(){
        System.out.println("Test/piyo");
    }
}

class SubTest extends Test{
    @Override
    void foo(){
        System.out.println("SubTest/foo");
    }

    void piyo(){
        System.out.println("SubTest/hoge");
    }
}

class SubSubTest extends SubTest{
    @Override
    void foo(){
        System.out.println("SubSubTest/foo");
    }

    void piyo(){
        System.out.println("SubSubTest/piyo");
    }
}

public class test1 {
    public static void main(String[] args) {
        Test t = new SubSubTest();
        t.piyo();
    }
}
