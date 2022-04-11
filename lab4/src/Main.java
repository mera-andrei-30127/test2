import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("alibaba");
        System.out.println(Number.min());
    }
}
    class Number{
        public static int min(int... numbers) {
        return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
    }}
