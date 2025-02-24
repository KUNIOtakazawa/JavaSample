package ValiableSamples;

public class Sample5_Boolean {
    
    public static void main(String[] args) {
        boolean value1 = true;
        boolean value2 = value1 == false;
        boolean value3 = value1 == true;

        System.out.println("*---真偽値のサンプル");
        System.out.println("変数2にtrueを代入：" + value1);
        System.out.println("変数2の値がfalseであるかの結果を代入：" + value2);
        System.out.println("変数2の値がtrueであるかの結果を代入：" + value3);
        System.out.println("*------------------------------------------------*");
    }

    /**
     * true(OK)またはfalse(NG)の2値を扱うクラスです。
     * 条件判定でよく使用されます。その際は変数に入れずにやるパターンも多いです。
     * 多くのケースでは後述する演算子を利用してtrueまたはfalseを判定して代入します。
     */
}
