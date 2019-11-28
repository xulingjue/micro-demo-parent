package xyz.micro_demo.mail;

import java.util.concurrent.TimeUnit;

/**
 * ThreadTest
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/11/25 10:25
 * @Version V1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        final Thread thread = new Thread() {
            @Override
            public void run() {
                synchronized (this) {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
        //thread.setName("zouxh");//起名字，方便在线程栈里面进行查看
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (thread) {
            System.out.println(Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread.notify();
        }
    }
}
