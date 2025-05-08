import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            String str1 = sc.next();
            String str2 = sc.next();

            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();

            for(int j = 0; j < str1.length(); j++){
                map1.put(str1.charAt(j), map1.getOrDefault(str1.charAt(j), 0) + 1);
            }
            for(int j = 0; j < str2.length(); j++){
                map2.put(str2.charAt(j), map2.getOrDefault(str2.charAt(j), 0) + 1);
            }

            if(map1.equals(map2)){
                System.out.println("Possible");
            }
            else {
                System.out.println("Impossible");
            }

        }
    }
}