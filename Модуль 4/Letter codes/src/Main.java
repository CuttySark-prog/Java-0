import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main
{
    public static void main (String args[])
    {
        String alfabet = "aabcdefghijklmnopqrstvwxyzABCDEFGHIJKLMNOPQRSTVWXYZ";
        System.out.println(String.valueOf(CharBuffer.wrap(alfabet)));
        for (int i = 0; i < alfabet.length(); i++)
        {


         //   System.out.println(alfabet.getBytes());
        }
        String alf = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯa";
        for (int i = 0; i < alfabet.length(); i++)
        {
            System.out.println(alf.getBytes());
        }
    }
}
