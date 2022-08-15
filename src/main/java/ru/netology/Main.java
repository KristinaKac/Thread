package ru.netology;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("group");
        final MyThread thread1 = new MyThread(group, "thread_1");
        final MyThread thread2 = new MyThread(group, "thread_2");
        final MyThread thread3 = new MyThread(group, "thread_3");
        final MyThread thread4 = new MyThread(group, "thread_4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(15_000);
        group.interrupt();
    }
}