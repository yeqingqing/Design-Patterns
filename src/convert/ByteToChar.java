package convert;

public class ByteToChar {

    private char[] c;

    public char[] ByteToChar1(byte[] b){
        return new String(b).toCharArray();
    }
}
