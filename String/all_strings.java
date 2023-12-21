public class all_strings {

    static boolean checkPalindrome(String str) { // two pointers approach
        str = str.toLowerCase();
        int left = 0; // we have to take two pointers,left pointer will traverse the string from left
                      // end of a string
        int right = str.length() - 1; // right will traverse from the extreme right end of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;

    }

    static void countVowels(String str) {
        str = str.toLowerCase(); // for case sensitive
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if (ch == ' ')
                spaces++;
            else
                consonants++;
        }
        System.out.println("vowels:" + vowels);
        System.out.println("consonents:" + consonants);
        System.out.println("spaces:" + spaces);
    }

    static void vowelRemover(String str) { // to remove only spaces use "\\s"
        str = str.replaceAll("[aeiouAEIOU]", ""); // using replaceAll function
        System.out.println(str);
    }

    static void charRemover(String str) { // to remove characters from a string other than alphabets
        str = str.replaceAll("[^a-zA-Z]", ""); // using replaceAll function
        System.out.println(str);
    }

    static void findASCII(char ch) {
        int val = ch;
        System.out.println(val);
    }

    static void reverseString(String str) {
        System.out.println("Original String:" + str);
        char[] characters = str.toCharArray(); // converting string to character array
        for (int i = 0; i < str.length() / 2; i++) { // the for loop iterates only up to half of the string length,
                                                     // swapping characters from the beginning and the end of the
                                                     // character array.
            char temp = characters[i];
            characters[i] = characters[str.length() - 1 - i];
            characters[str.length() - 1 - i] = temp;
        }
        String n = new String(characters); // new String(characters) creates a new string using the characters from the
                                           // char array.
        System.out.println("Reversed String:" + n);
    }

    static void charFrequency(String str) {
        str.toLowerCase(); // convert to lower case
        for (char ch = 'a'; ch <= 'z'; ch++) { // iterate through all alphabets
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (ch == str.charAt(i))
                    count++; // if ch(a)==str.charAt(a)
            }
            System.out.println(ch + " " + count);
        }
    }

    static void nonRecurringChar(String str) {
        int[] freq = new int[200]; // creating a new array
        char[] s = str.toCharArray(); // converting given string to the array of characters

        for (int i = 0; i < str.length(); i++) { // this loop increments the index of the freq[] for the characters of
                                                 // the string,the spaces in a given string will not be considered
            if (str.charAt(i) == ' ')
                continue;
            else
                freq[(int) (str.charAt(i))]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[(int) (str.charAt(i))] == 1 && s[i] != ' ')
                System.out.print(s[i] + " "); // the non recurring character in a string will have the atmost value of 1
                                              // in freq[] array, so that particular character will be printed
        }
    }

    static void maxRecurringChar(String str) {
        int[] charCount = new int[128];
        int maxFrequency = 0;

        // Count character frequencies
        for (char c : str.toCharArray()) {
            charCount[c]++;
            maxFrequency = Math.max(maxFrequency, charCount[c]);
        }

        // Find characters with the maximum frequency
        System.out.print("The maximum occurring character(s) are");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] == maxFrequency) {
                System.out.print(" " + (char) i + " with a frequency of " + maxFrequency);
            }
        }
    }

    static void removeDuplicates(String str) {
        System.out.println("the input string : " + str);
        boolean[] bool = new boolean[26]; // create a empty boolean array where all boolean values are false initially
        String modified = ""; // creating a new string modified to receive the modifed string with no
                              // duplicates
        for (int i = 0; i < str.length(); i++) {
            if (bool[str.charAt(i) - 'a'] == false) { // when a index position is false 1) add the character to the
                                                      // modified 2) and make that position true to make sure that no
                                                      // repeated character is added to the modified string again
                modified += str.charAt(i);
                bool[str.charAt(i) - 'a'] = true;
            }
        }
        System.out.println("after removing duplicates : " + modified);
    }

    static void printDuplicates(String str) {
        System.out.println("the input string : " + str);

        int[] counts = new int[26];

        for (int i = 0; i < str.length(); i++)
            counts[str.charAt(i) - 'a']++;

        for (int i = 0; i < 26; i++)
            if (counts[i] > 1)
                System.out.println((char) (i + 'a') + " - " + counts[i]);
    }

    static void removeCharacters(String str1, String str2) {
        // Remove Characters from first String present in the Second String
        StringBuffer result = new StringBuffer(); // create an object of StringBuffer
        for (int i = 0; i < str1.length(); i++) { // using two pointer approach i pointer will start from 0 of str1,
                                                  // similarly j with str2
            int flag = 0; // flag will be set to 0 initially, we set its value to 1 when we encounter a
                          // char similar in str2 w.r.t. to str1
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    flag = 1;
                }
            }
            if (flag != 1)
                result.append(str1.charAt(i)); // finally printing the char from str1 which is not present in str2 i.e.
                                               // when flag will be zero

        }
        System.out.println("resultant string : " + result);
    }

    static void largestWord(String str) {
        // Find the largest word in a String
        String[] words = str.split("\\s+"); // splits the input string into an array of words based on one or more
                                            // spaces (whitespace) as delimiters. This means that consecutive spaces
                                            // will be treated as a single delimiter, ensuring that multiple spaces
                                            // between words don't result in empty array elements.
        String result = "";
        for (String word : words) {
            if (word.length() > result.length()) {
                result = word;
            }
        }

        System.out.println("the largest word is : " + result);
    }

    static void countWords(String str) {
        // Count the number of words in a given string
        String[] words = str.split("\\s+");
        System.out.println("the number of words in a given string are : " + words.length);
    }

    

    public static void main(String[] args) {
        countWords("this is a sample sentence");
    }
}