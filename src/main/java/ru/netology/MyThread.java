package ru.netology;

public class MyThread extends Thread {

    MyThread(String name){
        super(name);
        System.out.println("Creating thread" + name);
    }
    MyThread(ThreadGroup group, String name){
        super(group, name);
    }
    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(3000);
                System.out.println(getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {
        } finally {
            System.out.printf("%s завершен \n", getName());
        }
    }
}
