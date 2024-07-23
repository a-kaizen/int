public class Task4 {

    /*
    TODO: write a program to substitute 2 values in place without using additional variables and print them out
     */
    public static void main(String[] args) {
        solution1(7, 11);
        solution2(7, 11);
    }

    public static void solution1(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("------------------------------");
        System.out.println(a);
        System.out.println(b);
    }

    public static void solution2(int a, int b) {

    }
}
