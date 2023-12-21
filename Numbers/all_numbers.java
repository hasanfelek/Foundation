public class all_numbers {

    static void checkPalindrome(int n) {
        int num = 0;
        int temp = n;
        while (n > 0) {
            int lastDigit = n % 10; // Extracting the last digit
            num = num * 10 + lastDigit; // appending the last digit to num
            n = n / 10; // shrinking the value of n by 1 digit at a time
        }
        if (temp == num)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");
    }

    static void checkPrime(int n) {
        // a prime number only has 2 factors, a factor is a number upon dividing the
        // remainder will be 0
        int count = 0; // count can have 2 as the max value, because if a number is prime its factors
                       // will be the number itself and 1
        for (int i = 1; i <= n; i++) { // looping from 1 to n to check all possible factors,if n is prime there will be
                                       // only 2 factors(n and 1)
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println("number is prime");
        else
            System.out.println("number is not prime");
    }

    static void checkArmstrong(int n) { // e.x. n=153->length=3->1^3+5^3+3^3=153->then its an armstrong number
        int original = n;
        int sum = 0;
        int numberLength = 0;
        int temp = n;
        while (temp != 0) { // in this loop we calculate length of the given number & store it in
                            // numberLength
            numberLength++;
            temp = temp / 10;
        }
        while (n != 0) {
            int lastDigit = n % 10; // extracting last digit from the given number
            sum += (int) (Math.pow(lastDigit, numberLength)); // and raising the power (equal to the length of a number)
                                                              // to the last digit
            n /= 10; // shrinking the given number, till it reaches 0 to end the loop
        }
        if (original == sum)
            System.out.println("it is a armstrong number");
        else
            System.out.println("not an armstrong number");
    }

    static void checkPerfect(int n) { // e.x. n=6->proper divisors of 6 are (1,2,3)->sum of (1+2+3)=given number
                                      // n->then its a perfect number
        // proper divisors refers to all the positive divisors excluding itself
        int sum = 0;
        for (int i = 1; i <= n - 1; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n)
            System.out.println("it is a perfect number");
        else
            System.out.println("not a perfect number");
    }

    static void checkEvenOdd(int n) {
        if (n % 2 == 0)
            System.out.println("this is an even number");
        else
            System.out.println("this is an odd number");
    }

    static void checkPositiveNegative(int n) {
        if (n >= 0)
            System.out.println("positive number");
        else
            System.out.println("negative number");
    }

    static void sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void sumAPSeries(int n, double a, double d) { // to find out the AP series, the first term is a,the
                                                         // difference b/w the numbers in a progression is d,n is the
                                                         // total numbers in a progression
        // e.x. n=4,a=2,d=2->the ap series we get is (2,4,6,8)->sum of (2+4+6+8) is 20
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += a;
            a += d;
        }
        System.out.println(sum);
    }

    static void sumGPSeries(int n, double a, double r) { // to find out the GP series, the first term is a,the common
                                                         // ratio in a progression is r,n is the total numbers in a
                                                         // progression
        // or apply formula of gp series directly as a(r^n-1)/r-1
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += a;
            a *= r;
        }
        System.out.println(sum);
    }

    static void swap(int x, int y) {
        System.out.println("before swapping " + x + " " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("after swapping " + x + " " + y);
    }

    static void leapYear(int n) { // A year is a leap year only if it satisfies the following conditions 1) The
                                  // year is divisible by 400,if this doesn't satisfy then next condition should
                                  // be meet 2) The year is divisible by 4 but not by 100
        if (((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }

    static void reverseNumber(int n) {
        System.out.println("original number " + n);
        int temp = n;
        int rev = 0;
        while (n > 0) {
            temp = n % 10; // starting extracting from the last digit
            rev = rev * 10 + temp; // append the extracted digit to the rev variable
            n = n / 10; // shrink the number(starts deleting from the last digit)
        }
        System.out.println("reversed number " + rev);
    }

    static void minMaxDigit(int n) {
        int minNum = Integer.MAX_VALUE; // sets max value for an integer
        int maxNum = Integer.MIN_VALUE; // sets min value for an integer
        int temp;
        while (n > 0) {
            temp = n % 10; // extracts last digit from the given number
            minNum = Math.min(minNum, temp); // these two statements ensure that the minNum and maxNum contain the same
            maxNum = Math.max(maxNum, temp); // extracted last digit from the given number.
            n = n / 10;
        }
        System.out.println("maximum digit in a number is " + maxNum);
        System.out.println("minimum digit in a number is " + minNum);
    }

    static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }

    static void fibonacciSeries(int n) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print("the fibonacci series upto " + n + " is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    static void factorsNum(int n) {
        System.out.print("the factors of number " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void primeFactors(int n) {
        System.out.print("Prime Factors : ");
        for (int i = 2; n > 1; i++) {

            if (n % i == 0) {

                while (n % i == 0) {

                    System.out.print(i + " ");
                    n = n / i;
                }
            }

        }
    }

    static int gcdNumbers(int a,int b){
        if(b==0){
            return a;
        }

        return gcdNumbers(b,a%b);
    }

    /* to find lcm of two numbers
       1. take the value returned by gcd() 
       2. and apply in the formula (a*b)/gcd store in a variable and display the result
    */ 

    static void sumDigits(int n){
        int sum=0;
        int temp;
        while(n>0){
            temp=n%10;
            sum += temp;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumDigits(102);
    }
}