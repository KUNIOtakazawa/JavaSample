package ValiableSamples;
public class Sample7_var {
    
    public static void main(String[] args) {
        var var_int = 1;//　特別な指定がなければデフォルトではint型に変換されます。
        var var_double = 1.0;
        var var_String = "sample";
        var var_char = 's';
        var var_boolean = true;
        var var_Arrayint = new int[] { 1, 2, 3 };
        /**
         * 以下のようなケースはコンパイルエラーとなる。
         * var sample;
         * sample = "Samplevalue";
         */

        System.out.println("*---");
        System.out.println();
        System.out.println("*------------------------------------------------*");
    }

    /**
     * 動的に型を判定してくれる構文です。
     * 宣言時に =(イコール)の右辺にある記述からコンパイラーが型を推論し自動的に設定してくれます。
     * 型推論と呼ばれることもあります。
     * varを利用するメリットとしてはコードがすっきりします。
     * 10行目のようにクラスの使用宣言(インスタンス化)とかは特に記述量が多くなるので、varを利用すると見やすくなりますし記述も楽になります。
     */
}
