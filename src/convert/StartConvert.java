package convert;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class StartConvert {
    public static void main(String[] args) {
        //charToByte();
        //byteToChar();
        //intToString();
        byteToString();
    }






    public static void charToByte(){
        char c[] = {288,111,'a','D','中'};
        CharToByte charToByte = new CharToByte();
        byte[] b = charToByte.charToByte1(c);
        /**
         * 这个是byte[]中实际存的值
         */
        System.out.println( Arrays.toString(b));
        /**
         * 打印出byte[]的ascii的字符串
         * ascii范围是如果不是0-127的字段，会转为乱码
         */
        System.out.println(new String(b));
    }

    public static void byteToChar(){
        byte[] b ={111,124,97,68} ;
        ByteToChar byteToChar = new ByteToChar();
        char[] c = new String(b).toCharArray();
        System.out.println(c);
    }

    public static void intToString(){
        IntToString intToString = new IntToString();
        System.out.println(intToString.intToString1(2));
    }

    public static void byteToString(){
        byte[] b ={111,124,97,68};
        ByteToString byteToString = new ByteToString();
        System.out.println(byteToString.byteToString1(b));
    }
}
