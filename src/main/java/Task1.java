public class Task1 {

    /*
    TODO: check if number is a palindrome
     */
    public static void main(String[] args) {
        isPalindrome(121);
        isPalindrome(77);
        isPalindrome(123);
        isPalindrome(123588);
        isPalindrome(12321);
        isPalindrome(123454321);
    }

    public static void isPalindrome(int a) {
        boolean isPalindrome = solution(a);
        if (isPalindrome) {
            System.out.println(a + " is a palindrome");
        } else {
            System.out.println(a + " is not a palindrome");
        }
    }

    public static boolean solution(int a) {
        //loop
        // divide by 10, save remainer
        // save each number into array
        ////        var sol2 = number.toCharArray()
////        for (int i=0; i<; i++) {
////
////        }


        return false;
//        String number = String.valueOf(a);
//
////        var sol2 = number.toCharArray()
////        for (int i=0; i<; i++) {
////
////        }
//        StringBuilder sb = new StringBuilder(number);
//        String nextStr = sb.reverse().toString();
//        return nextStr.equals(number);
    }

//    @ParametrizedTest
//    @Arguemt
}
