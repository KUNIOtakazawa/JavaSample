package ValiableSamples;
public class Sample1_char {
    public static void main(String[] args) {
        char char_Text = '?';
        char char_Number = 65000;
        char char_Unicode = '\u5555';

        System.out.println("*---char型で?を指定したいときの入れ方サンプル");
        System.out.println("?を代入したとき：" + char_Text);
        System.out.println("65000を代入したとき：" + char_Number);
        System.out.println("\u5555を代入したとき：" + char_Unicode);
        System.out.println("*------------------------------------------------*");
    }
    /**
     * プログラムの世界では1つの文字は数値で表されます。
     * 値を代入するときは、代入したい値を''(名称：シングルクォーテーション)で囲む必要があります。
     * char型は1つの文字を格納するためのクラスで1文字、0から65535の数値またはUnicode文字コードを指定することができます。
     * なんとなく文字以外も有効な場合があるということを覚えておいてもらえれば現段階では十分です。
     */
}
