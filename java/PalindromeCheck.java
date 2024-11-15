public class PalindromeCheck {
       public static boolean ispalindrome(string str) {
           int start = 0;
           int end = str.length() - 1;
           while (start < end) {
               if (str.charAt(start) != str.carAt(end)) {
                     return false;
               }
               start++;
               end--;
           }
           return true;
       }
}