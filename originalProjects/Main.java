package originalProjects;
import java.util.Scanner;

public class Main {
    public static String encrypt(String code) {
        String message = "";
        for (int i = 0; i < code.length(); i++) {
            int length = 0;

            while (code.charAt(i) == code.charAt(i + length)) {
                length++;
                if (i + length > code.length() -1 ) {
                    break;
                }
            }

            if (code.charAt(i) == '1') {
                message += String.format("0 %s ", code.substring(i, i + length));
            } else if (code.charAt(i) == '0') {
                message += String.format("00 %s ", code.substring(i, i + length));
            }
            length--;
            i += length;
        }
       message = message.replace('1', '0');
        return message;
    }

    public static String getSevenDigits(String sentence) {
        String code = "";
        for (int i = 0 ; i < sentence.length(); i++) {
            char character = sentence.charAt(i);
            String digits = Integer.toBinaryString((int) character);
            code += String.format("%07d", Integer.parseInt(digits));
        }
        return code;
    }
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String sentence = scanner.nextLine();
        String code = getSevenDigits(sentence);
        String message = encrypt(code);
        System.out.println();
        System.out.println("The result:");
        System.out.print(message);
       
    }
}