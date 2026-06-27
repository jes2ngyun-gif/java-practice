package practice.java_basic.chapter_3.thread.lecture.runnable;

public class Main {
    public static void main(String[] args) {

        MyRunnable myTask = new MyRunnable();

        Thread thread0 = new Thread(myTask);
        Thread thread1 = new Thread(myTask);

        thread0.start();
        thread1.start();

    }
}
