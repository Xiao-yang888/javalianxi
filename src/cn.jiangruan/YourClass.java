package cn.jiangruan.test;

public class YouClass extends Thread {
    @Override
    public void run() {
        while (!(Dome.UID == 0)){
            Dome.UID--;
            System.out.println("你的线程程序"+Dome.UID);
        }
    }
}

