/**
 * Выводит строку "Starting project"
 * 
 * @author Vakhtang Karchava
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        // v_byte=120 v_short=129 v_char=a v_int=65999 v_long=4294967296
        // v_float=0.33333334 v_double=0.3333333333333333 v_double=true
        byte v_byte = 120;
        short v_short = 129;
        char v_char = 'a'; // from a to 'a'
        int v_int = 65999;
        long v_long = 429496729; // from 4294967296 to 429496729
        float v_float = 0.33333334f; // from 0.33333334 to 0.33333334f
        double v_double = 0.3333333333333333;
        boolean v_boolean = true; // from v_double to v_boolean
        
        System.out.println("Byte: " + v_byte);
        System.out.println("Short: " + v_short);
        System.out.println("Char: " + v_char);
        System.out.println("Int: " + v_int);
        System.out.println("Long: " + v_long);
        System.out.println("Float: " + v_float);
        System.out.println("Double: " + v_double);
        System.out.println("Boolean: " + v_boolean);

        System.out.println(0.11 + 0.12);
    }
}
