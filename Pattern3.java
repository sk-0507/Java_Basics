import java.util.*;

class Pattern3 {
    // pat1
    public static void pat1() {
        int stop = 5;
        char ch = 'A';
        System.out.println("\n---Pattern one---\n");
        for (int r = 1; r <= stop; r++) {
            for (int c = 1; c <= stop + 1 - r; c++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    // pat2
    public static void pat2() {
        int stop = 5;
        char ch = 'A';
        System.out.println("\n---Pattern two---\n");
        for (int r = 1; r <= stop; r++) {
            for (int c = 1; c <= stop; c++) {
                if (r + c - r >= r) {
                    System.out.print(ch + " ");
                    ch++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // pat3
    public static void pat3() {
        int stop = 5;
        char ch = 'A';
        System.out.println("\n---Pattern three---\n");
        for (int r = 1; r <= stop; r++) {
            for (int c = 1; c <= r; c++) {

                System.out.print(ch + " ");
                ch++;

            }
            System.out.println();
        }
    }

    // pat4
    public static void pat4() {
        int stop = 5;
        char ch = 'A';
        System.out.println("\n---Pattern four---\n");
        for (int r = 1; r <= stop; r++) {
            for (int c = 1; c <= stop; c++) {
                if (r + c >= stop + 1) {
                    System.out.print(ch + " ");
                    ch++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int exit = 1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n----Enter the option's----\n");
            System.out.print(
                    "1)For inverted right pyramid\n2)For inverted left pyramid\n3)For right pyramid\n4)For left pyramid\nEnter your option: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    pat1();
                    break;
                case 2:
                    pat2();
                    break;
                case 3:
                    pat3();
                    break;
                case 4:
                    pat4();
                    break;
                default:
                    System.out.println("Please enter valid option's ");
                    break;
            }
            System.out.print(
                    "\n=> Press '1' to return into previous menu\n=> Press '0' to exit the program\n=> Enter your option =>  ");
            exit = s1.nextInt();
        } while (exit != 0);

    }
}