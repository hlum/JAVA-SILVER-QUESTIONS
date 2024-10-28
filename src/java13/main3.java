package java13;

// 抽象クラス Zoo03
abstract class Zoo03 {
    // 具体的なメソッド foo()
    void foo() {
        System.out.println("Zoo03/foo()");
    }

    // 抽象メソッド hoge() - サブクラスで実装される必要がある
    abstract void hoge();
}

// Zoo03を継承する具体的なクラス MyZoo03
class MyZoo03 extends Zoo03 {
    // 抽象メソッド hoge()をオーバーライドして実装
    void hoge() {
        System.out.println("MyZoo03/hoge()");
    }
}

// MyZoo03をさらに継承する具体的なクラス MyZoo04
class MyZoo04 extends MyZoo03 {
    // hoge()メソッドをさらにオーバーライド
    void hoge() {
        System.out.println("MyZoo04/hoge()");
    }
}

// UseZoo クラス - Zoo03 のインスタンスを引数にとり、 hoge() を実行する
class UseZoo {
    // Zoo03型の引数 z の hoge() メソッドを呼び出すメソッド
    void useHoge(Zoo03 z) {
        z.hoge(); // z の実際のクラスに応じた hoge() メソッドが呼び出される
    }
}

// メインクラス
public class main3 {
    public static void main(String... args) {
        UseZoo u = new UseZoo(); // UseZooのインスタンスを作成
        Zoo03 z; // Zoo03型の変数 z を宣言
        z = new MyZoo03(); // z に MyZoo03 のインスタンスを代入
        u.useHoge(z); // useHoge() メソッドを呼び出し、 z の hoge() を実行
    }
}
