public class all_patterns {
    static void Pattern1(int n) {
        int i;
        int j;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int n) {
        int i;
        int j;

        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        int i;
        int j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n) {
        int i;
        int j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void Pattern5(int n) {
        int i;
        int j;

        for (i = n; i > 0; i--) {
            for (j = i; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    static void Pattern6(int n) {
        int i;
        int j;

        for (i = n; i > 0; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();

        }
    }

    static void Pattern7(int n) {
        int i;
        int j;
        for (i = 0; i < n; i++) {

            // to print spaces, the formula is n-i-1

            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // to print stars, the formula is 2*i+1

            for (j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // to print spaces, the formula is n-i-1

            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void Pattern8(int n) {
        int i;
        int j;

        for (i = 0; i < n; i++) {

            // to print spaces, the formula is i=j

            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // to print stars, the formula is 2n - (2*i+1), here n is 5

            for (j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // to print spaces, the formula is i=j

            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void Pattern9(int n) {
        Pattern7(n);
        Pattern8(n);
    }

    static void Pattern10(int n) {
        int i;
        int j;
        int stars;
        for (i = 1; i <= 2 * n - 1; i++) {
            stars = i;
            if (stars > n)
                stars = 2 * n - i;
            for (j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern11(int n) {
        int i;
        int j;
        int start = 1;
        for (i = 0; i < n; i++) {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void Pattern12(int n) {
        int i;
        int j;
        int spaces = 2 * (n - 1);

        // Outer loop for the number of rows.
        for (i = 1; i <= n; i++) {

            // for printing numbers in each row
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // for printing spaces in each row
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // for printing numbers in each row
            for (j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces -= 2;
        }
    }

    static void Pattern13(int n) {
        int i;
        int j;
        int num = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    static void Pattern14(int n) {
        int i;
        for (i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void Pattern15(int n) {
        int i;
        for (i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void Pattern16(int n) {
        int i;
        int j;
        for (i = 0; i < n; i++) {
            char ch = (char) ('A' + i); // need type conversion to char because i has a int data type
            for (j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }

    static void Pattern17(int n) {
        int i;
        int j;
        for (i = 0; i < n; i++) {

            // to print spaces, the formula is n-i-1

            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // to print characters, the formula is 2*i+1
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            // to print spaces, the formula is n-i-1

            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void Pattern18(int n) {
        int i;
        for (i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void Pattern19(int n) {
        int i;
        int j;
        int iniS = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }
        iniS = 2 * n - 2;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            iniS -= 2;
            System.out.println();
        }

    }

    static void Pattern20(int n) {
        int i;
        int j;
        int spaces = 2 * n - 2;
        for (i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            for (j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n)
                spaces -= 2;
            else
                spaces += 2;

        }
    }

    static void Pattern21(int n) {
        int i;
        int j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void Pattern22(int n) {
        int i;
        int j;
        for (i = 0; i < 2 * n - 1; i++) {
            for (j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;

                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(right, left)));
            }
            System.out.println();
        }
    }

    static void Pattern23(int n) {
        int i;
        int j;

        for (i = 1; i < n; i++) {
            int spaces = n - i;
            // print spaces
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern24(int n) {
        int i;
        int j;
        for (i = n; i >= n; i--) {

            // to print spaces
            for (j = n; j > i; i--) {
                System.out.print(" ");
            }

            // to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Pattern1(5);
        // Pattern2(5);
        // Pattern3(5);
        // Pattern4(5);
        // Pattern5(5);
        // Pattern6(5);
        // Pattern7(5);
        // Pattern8(5);
        // Pattern9(5);
        // Pattern10(5);
        // Pattern11(5);
        // Pattern12(5);
        // Pattern13(5);
        // Pattern14(5);
        // Pattern15(5);
        // Pattern16(5);
        // Pattern17(5);
        // Pattern18(5);
        // Pattern19(5);
        // Pattern20(5);
        // Pattern21(5);
        // Pattern22(5);
        // Pattern23(7);
        // Pattern24(5);

    }
}
