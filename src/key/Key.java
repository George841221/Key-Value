package key;

import java.util.*;

public class Key {

    public static int[] generateNum() {
        int[] gen = new int[charArrayLength(stringToChar(message()))];
        Random ran = new Random();
        for (int i = 0; i < gen.length; i++) {
            gen[i] = ran.nextInt(1000);
        }
        return gen;
    }

    public static String message(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your message here: ");
        String message;
        message = sc.nextLine();

        return message;
    }

    public static char[] stringToChar(String mes) {
        char[]  characters = new char[mes.length()];
        for (int i = 0; i < mes.length(); i++) {
            characters[i] = mes.charAt(i);
        }

        return characters;
    }

    public static int charArrayLength(char[] size) {
        int num = 0;
        for (char letter : size) {
            if (letter > size.length) {
                num++;
            }
        }
        return num;
    }

    public static Map<int[], String> encode(int[] nums, String letter) {
        Map<int[], String> encodeMessage = new HashMap<>();
        encodeMessage.put(nums, letter);

        return encodeMessage;
    }
}