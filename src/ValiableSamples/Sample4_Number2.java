package ValiableSamples;

public class Sample4_Number2 {
    
    public static void main(String[] args) {
        float Number2_float = 1.0f;
        double Number2_double = 1.0;

        System.out.println("*---小数サンプル");
        System.out.println("1.0をfloatに代入：" + Number2_float);
        System.out.println("1.0をdoubleに代入：" + Number2_double);

        //おまけ
        for (int i = 0; i < 100; i++) {
            Number2_float += 0.01f;
            Number2_double += 0.01;
        }
        System.out.println("おまけ1---floatの変数に0.01を100回加算したときの値：" + Number2_float);
        System.out.println("おまけ2---doubleの変数に0.01を100回加算したときの値：" + Number2_double);
        System.out.println("本来とも2.0が出力されないといけないが、小数は誤差が生じるためこのようになる。(または実行環境により異なる場合もある。)");
        System.out.println("*------------------------------------------------*");
    }
    /**
     * 小数を扱うことのできる型です。
     * 変数に直接小数の値を入れるケースはあまりないと思います。
     * 実際のパターンとしては割り算の結果として変数に小数が入ってくるパターンが多いと思います。
     * また、特別な理由がない限り数値の精度の問題でdouble型を利用します。
     * floatはあまり記憶しておかなくてもそこまで問題にはならないです。
     * 金額の計算とか精度が求めらる計算には絶対使用してはいけません！！！(例えば)
     */
}
