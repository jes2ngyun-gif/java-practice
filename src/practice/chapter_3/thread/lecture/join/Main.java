package practice.chapter_3.thread.lecture.join;

import practice.chapter_3.thread.lecture.multi.MyThread;

public class Main {
    public static void main(String[] args) {

        System.out.println("::: main 쓰레드 시작:::");

        MyThread thread0 = new MyThread();
        MyThread thread1 = new MyThread();

        long startTime = System.currentTimeMillis();

        // 1. tread 0 시작
        System.out.println("thread 0 시작");
        thread0.start();

        // 2. tread 1 시작
        System.out.println("thread 1 시작");
        thread1.start();

        // main 쓰레드를 대기 시키기
        try {
            thread0.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("작업 소요 시간 : " + totalTime + " ms " );
        System.out.println("::: main 쓰레드 종료:::");
    }
}
