package ValiableSamples;

public class Sample6_Array {
    public static void main(String[] args) {
        int[] Array_int = new int[] { 10, 20, 30 };
        char[] Array_char = new char[] { 'A', 'B', 'C' };
        
        int Array_int_Count = Array_int.length;//配列の数を取得し、int型の変数に代入する。　今回の場合は3が代入されます。
        int Array_int_Index0 = Array_int[0];//配列0番地の『10』が代入されます。
        Array_int[0] = 100;//配列0番地の値を『100』に更新します。
        /**
         * この時9行目の変数に代入した値は10のままです。
         * 9行目ではArray_int[0]で10の値を出力していますが、あくまで値のためこの後の動作には影響しません。
         * */ 

        System.out.println("*---配列型のサンプル");
        System.out.println("Array_charの2番目の値を出力：" + Array_char[1]);
        System.out.println("*------------------------------------------------*");
    }
    
    /**
     * 配列型です。
     * 型を複数にまとめて一つの変数として格納することができます。
     * 配列の作成は=(イコール)右辺に 『new 型名 [] {入れたい値}』の形で行います。
     * 値の変更は変数名[Index] = 変更後の値、出力は変数名[Index]でできます。
     * ※Indexは基本0スタートです。配列数が1であれば0の番号に値が格納されています。
     * 　
     * 制約としては以下2つです。
     * ・配列の数は代入後に変更することはできません。
     * ・違う型の値を入れることはできません。
     */
}
