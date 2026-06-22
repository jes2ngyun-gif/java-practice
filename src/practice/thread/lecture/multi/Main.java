package practice.thread.lecture.multi;

public class Main {
    public static void main(String[] args) {

        System.out.println("::: main 쓰레드 시작:::");

        MyThread thread0 = new MyThread();
        MyThread thread1 = new MyThread();

        // 1. tread 0 시작
        System.out.println("thread 0 시작");
        thread0.start();

        // 2. tread 1 시작
        System.out.println("thread 1 시작");
        thread1.start();



        System.out.println("::: main 쓰레드 종료:::");
    }
}
