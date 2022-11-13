import java.util.Scanner;

public class demo2 {
public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    String string = scanner.next();
    int count = 0;
    for (int i = 0, j = string.length() - 1; i < string.length() / 2; i++, j--) {
        if (string.charAt(i) == string.charAt(j)) {
            count++;
        }
    }
    if (count == string.length() / 2) System.out.print("yes");
    else System.out.print("no");
}
}