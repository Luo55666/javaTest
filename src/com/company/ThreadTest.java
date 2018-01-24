package com.company;

/**
 * ThreadTest
 *
 * @author Luo
 * @create 2018-01-23 10:08
 **/
public class ThreadTest extends Thread{
    private String name;
    public ThreadTest(String name){
        this.name=name;
    }
    // 为了保持票数的一致，票数要静态
    static int tick = 50;

    // 创建一个静态钥匙
    static Object ob = "aa";

    static boolean isempty=false;

    @Override
    public void run() {
        super.run();
        while (!isempty){
                synchronized (ob){
                    if (tick>0){
                        System.out.println(getName()+"卖出了第"+tick+"张票");
                        tick--;
                    }else {
                        System.out.println("票卖完了");
                        isempty=true;
                    }
                }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }





    }
}
