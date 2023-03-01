import java.util.Arrays;

//Напишите код, с помощью которого можно разделить строку на части.
public class Main {
    public static void main(String[] args) {

        line("I love my homeland".split(" "));              // строка реазделилась на 4 части
        line("I love my homeland".split(" ", 2));  // строка разделилась на 2 части
        line("AD:C5:92:18:55:A5".split(":", 3));  // строка разделилась на 3 части
        line("the-method-of-dividing-into-lines".split("-", 3));  // строка разделилась на 3 части
    }
    static void line(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
