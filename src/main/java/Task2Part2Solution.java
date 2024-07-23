public class Task2Part2Solution {
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
            synchronized (o2) {
                System.out.println("synchronized (o1) and (o2) in tst1() " + Thread.currentThread().getName());
            }
        }
    }

    public void tst2() {
        synchronized (o1) {
            System.out.println("tst2 o1() " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (o2) {
                System.out.println("synchronized (o1) and (o2) in tst2() " + Thread.currentThread().getName());
            }
        }
    }

    /*
    TODO: Write a Java program that will result in deadlock,
      then change it to remove deadlock.
     */
    public static void main(String[] args) {
        Task2Part2Solution task2 = new Task2Part2Solution();

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
