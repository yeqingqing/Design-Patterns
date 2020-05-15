package convert;

import java.io.UnsupportedEncodingException;

public class ByteToString {
    private String s;

    public String byteToString1(byte[] b){
        try{
            s = new String(b,"ISO-8859-1");
        }catch (UnsupportedEncodingException e){

        }
        return s;
    }

    public String byteToStting2(byte[] b){
        try{
            s = new String(b,"UTF-8");
        }catch (UnsupportedEncodingException e){

        }
        return s;
    }
}
