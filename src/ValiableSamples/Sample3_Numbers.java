package ValiableSamples;

public class Sample3_Numbers {
    public static void main(String[] args) throws Exception {
        byte Number_byte = 1;
        short Number_short = 1;
        int Number_int = 1;
        long Number_long = 1;

        System.out.println("*---数値サンプル");
        System.out.println("byteに1を代入：" + Number_byte);
        System.out.println("shortに1を代入：" + Number_short);
        System.out.println("intに1を代入：" + Number_int);
        System.out.println("longに1を代入：" + Number_long);
        System.out.println("*------------------------------------------------*");
    }

    /**
     * 整数値を扱うとこができる型です。
     * 扱える数値内であれば全ての方で出力される値は同じです。
     * byte(-128～127) < short(±約3万) < int(±約21億) < long(±約9200兆)と扱える範囲が大きくなります。
     * 一般的には通常int型を利用し、int型の範囲から超える場合にはlongを使用していくという感じです。
     * byte型はファイル操作とか一部で利用することもありますが、あまり使用しないです。
     * short型は数値の上限値があまり大きくないのと、intではなくshortを使うメリットがあまりないのでほとんど利用されない印象です。
     * 全ての整数をlongに格納してもプログラムとしては動きますが、大きい数値を格納できる箱というのはその分メモリをたくさん消費するので、
     * 基本的にはintで収まる範囲の数値はintで扱います。
     */
}
