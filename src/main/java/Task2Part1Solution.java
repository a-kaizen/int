public class Task2Part1Solution {
    public Object o1 = new Object();
    public Object o2 = new Object();
    public void tst1() {
        synchronized (o1) {
            System.out.println("tst1 o1() " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("synchronized (o1) { -> tst2()" + Thread.currentThread().getName());
            tst2();
        }
    }
    public void tst2() {
        System.out.println("tst2 o2() " + Thread.currentThread().getName());
        synchronized (o2) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("synchronized o2 tst1() after" + Thread.currentThread().getName());
            tst1();
        }

    }
    /*
    TODO: Write a Java program that will result in deadlock,
      then change it to remove deadlock.
     */
    public static void main(String[] args) {
        Task2Part1Solution task2 = new Task2Part1Solution();

        // A
        Thread x1 = new Thread(() -> {
            System.out.println("1");
            task2.tst1();
            System.out.println("1 end");
        });
        x1.start();

        // B
        Thread x2 = new Thread(() -> {
            System.out.println("2");
            task2.tst2();

            System.out.println("2 end");
        });
        x2.start();
    }


}
