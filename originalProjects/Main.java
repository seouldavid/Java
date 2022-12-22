package originalProjects;
import java.util.Scanner;

public class Main {
    public static String toBinary(String message) {
        String[] arrayOfZeros = message.split(" ");
        String binaryString = "";
        for (int i = 0; i < arrayOfZeros.length; i += 2) {
            String check = arrayOfZeros[i];
            // System.out.println(arrayOfZeros[i]);
            // System.out.println(arrayOfZeros[i+1]);
            switch(check) {
                case "0":
                    binaryString += arrayOfZeros[i+1].replace('0','1');
                //    System.out.println("replace" + arrayOfZeros[i+1].replace('0','1'));
                   break;
                case "00":
                    binaryString += arrayOfZeros[i+1];
                    break;
                  //  System.out.println(binaryString);

            }
            // System.out.println(binaryString);
        }
        return binaryString;
    }
    public static String convertBinaryToChar(String binaryString){
        String finalMessage = "";
        // System.out.println(binaryString);
        for (int i = 0; i < binaryString.length(); i += 7) {
            finalMessage += (char) Integer.parseInt(binaryString.substring(i, i + 7), 2);
            // System.out.println(finalMessage);
        }
        return finalMessage;
    }
    // public static String encrypt(String code) {
    //     String message = "";
    //     for (int i = 0; i < code.length(); i++) {
    //         int length = 0;

    //         while (code.charAt(i) == code.charAt(i + length)) {
    //             length++;
    //             if (i + length > code.length() - 1 ) {
    //                 break;
    //             }
    //         }

    //         if (code.charAt(i) == '1') {
    //             message += String.format("0 %s ", code.substring(i, i + length));
    //         } else if (code.charAt(i) == '0') {
    //             message += String.format("00 %s ", code.substring(i, i + length));
    //         }
    //         length--;
    //         i += length;
    //     }
    //    message = message.replace('1', '0');
    //     return message;
    // }

    // public static String getSevenDigits(String sentence) {
    //     String code = "";
    //     for (int i = 0 ; i < sentence.length(); i++) {
    //         char character = sentence.charAt(i);
    //         String digits = Integer.toBinaryString((int) character);
    //         code += String.format("%07d", Integer.parseInt(digits));
    //     }
    //     return code;
    // }
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input encoded string:");
        String sentence = scanner.nextLine();
        // String code = getSevenDigits(sentence);
        // String message = encrypt(code);
        System.out.println();
        System.out.println("The result:");
        System.out.print(convertBinaryToChar(toBinary(sentence)));
       
    }
}