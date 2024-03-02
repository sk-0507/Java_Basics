import java.util.*;

class Cases {
    // upper case A to Z
    public static void aToZ() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }

    // lower a to z
    
    public static void lowerAtoZ() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }

    // only vowel lower
    public static void onlylowerVowel() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i') {
                System.out.print(ch + " ");
            }
        }
    }

    // only consonents
    public static void onlylowerCon() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i')) {
                System.out.print(ch + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("***Upper case A to Z***\n");
        aToZ();
        System.out.print("\n***Lower case A to Z***\n");
        lowerAtoZ();
        System.out.print("\n***Lower case vowel only***\n");
        onlylowerVowel();
        System.out.print("\n***Lower case consonents only***\n");
        onlylowerCon();
    }
}