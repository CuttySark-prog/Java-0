import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main
{
    public static void main (String args[])
    {
        String alfabet = "aabcdefghijklmnopqrstvwxyzABCDEFGHIJKLMNOPQRSTVWXYZ";
      //  System.out.println(String.valueOf(CharBuffer.wrap(alfabet)));
        for (int i = 0; i < alfabet.length(); i++)
        {
          System.out.printf("%s - %s %n", alfabet.charAt(i), alfabet.getBytes(Charset.defaultCharset()));
        }
    }
}
