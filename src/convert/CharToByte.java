package convert;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.UnsupportedEncodingException;

public class CharToByte {
    private  byte[] b;

    public byte[] charToByte1(char[] c)  {

        try {
            b  =  new String(c).getBytes("UTF-8");
        }catch (UnsupportedEncodingException e){
        }
        return b;
    }


}
