package OperatorSamples;

public class Sample {
    public static void main(String[] args) {
        //算術演算子
        int value1 = 1 + 1; //　結果：2　足し算
        int value2 = 1 - 1; //　結果：0　引き算
        int value3 = 3 * 5; //　結果：15　掛け算

        int value4_1 = 5 / 2; //　結果：2　 純粋な割り算※代入時にint型は小数を受け付けないので『切り捨て』された状態で代入される。
        var value4_2 = 5 / 2; //　結果：2.5　純粋な割り算※結果が小数を含む2.5のため、型推論でdouble型が指定されて代入される。
        double value4_3 = 5 / 2;//　結果：2.5　純粋な割り算
        int value4_4 = 5 % 2; //　結果：1　割り算の結果の余り※余りがなければ0となる。

        //インクリメントとデクリメント
        value1++; //value1 = value1 + 1と同じ処理をします。
        value1--; //value1 = value1 - 1と同じ処理をします。
        ++value1; //value1 = value1 + 1と同じ処理をします。
        --value1; //value1 = value1 - 1と同じ処理をします。

        /**
         * 変数代入とインクリメント/デクリメントが同じ行に入る場合は処理順序により代入される値が変わります。
         */
        int value4_before = ++value1;//value1の値を1加算してvalue1に再代入したあと、value1の値をvalue4_beforeに代入します。
        int value4_after = value1--;//value1の値をvalue4_afterに代入したあと、value1の値を1減算してしてvalue1に再代入します。

        //比較演算子
        System.out.println(2 == 1); // 左右の値が等しいか
        System.out.println("A" == "B");//左右の値が等しいか
        System.out.println(2 != 1);//左右の値が等しくないか
        System.out.println(2 > 1);//2が1より大きいか
        System.out.println(2 < 1);//2が1より小さいか
        System.out.println(2 >= 1);//2が1と同じ値かそれよりも大きいか(以上)
        System.out.println(2 <= 1);//2が1と同じ値かそれよりも小さいか(以下)

        //論理演算子
        System.out.println(2 == 1 & 2 == 1);// &起点で左辺と右辺を評価し、両方ともtrueとなる条件であればtrueを返す。
        /**
         * &の短絡系　左辺を評価時、結果がfalseであればその時点でfalseを返し、右辺の評価を行わない。
         * 左辺の評価がtrueの場合は&と同じ動作となる。
         */
        System.out.println(2 == 1 && 1 == 1);

        System.out.println(2 == 1 | 2 == 1);// |起点で左辺と右辺を評価し、いずれかがtrueとなる条件であればtrueを返す。
        /**
         * |の短絡系　左辺を評価時、結果がtrueであればその時点でtrueを返し、右辺の評価を行わない。
         * 左辺の評価がfalseの場合は|と同じ動作となる。
         */
        System.out.println(2 == 1 || 1 == 1);

        System.out.println(2 == 1 ^ 1 == 1);// ^起点で左辺と右辺を評価し、左辺と右辺の評価結果が異なればtrueを返す。

        System.out.println(!true);//Boolean形式の結果を反転させる。　この場合はfalse
        System.out.println(!(2 == 1)); //この場合はtrue ※()で囲まないとエラーとなるときは囲んでください。

        //複合代入演算子
        value1 += 1; // value1 = value1 + 1と同じ処理です。
        value1 -= 1; // value1 = value1 - 1と同じ処理です。
        value1 *= 1; // value1 = value1 * 1と同じ処理です。
        value1 /= 1; // value1 = value1 / 1と同じ処理です。
        value1 %= 1; // value1 = value1 % 1と同じ処理です。
        /**
         * 全て短く書くための構文です。
         * 処理的にはどちらで書いても正常に動作します。
         */
    }
    
    /**
     * ビット演算子というものもありますが、用途が特殊なため省きます。
    */
}
