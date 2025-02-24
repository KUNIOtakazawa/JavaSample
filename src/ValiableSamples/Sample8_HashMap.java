package ValiableSamples;

import java.util.HashMap;

public class Sample8_HashMap {
    public static void main(String[] args) {
        var value = new HashMap<Integer, String>(); //型推論varによりHashMap<Integer, String>型が指定されます。

        value.put(1, "Key1_A");
        value.put(2, "Key2_B");
        value.put(3, "Key3_C");
        value.put(2, "Key2_B");

        System.out.println("*---");
        System.out.println("登録されているキーを指定した場合：" + value.get(2));
        System.out.println("登録されていないキーを指定した場合：" + value.get(6));
        System.out.println("*------------------------------------------------*");
    }

    /**
     * 重複のないキーと値のセットを登録することのできるクラスです。
     * クラスのため変数宣言時に入れるキーと値の型を指定してインスタンスを生成する必要があります。
     * ※インスタンスとはそのクラスをプログラム内で利用できる状態にしたものです。
     * 　
     */
}
