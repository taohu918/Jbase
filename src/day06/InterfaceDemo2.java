package day06;

import javafx.scene.Camera;

class InterfaceDemo2 {
    public static void main(String[] args) {
        //创建usb设备
        Mp3 mp3 = new Mp3();
        AiGuoZhe agz = new AiGuoZhe();
        Mouse m = new Mouse();

        //创建Computer
        Computer com = new Computer();

        //传参 USB
        com.insert(mp3);
        com.insert(agz);
        com.insert(m);
    }
}

/*
 * 电脑USB接口
 * */
class Computer {
    public void insert(USB usb) {
        System.out.println("USB设备就绪:");
        usb.play();
    }
}

//定义接口
interface USB {
    public void play();
}

//实现接口
class Mp3 implements USB {
    //实现方法
    public void play() {
        System.out.println("I'm mp3");
    }
}

class AiGuoZhe implements USB {
    public void play() {
        System.out.println("I'm USB");
    }
}

class Mouse implements USB {
    public void play() {
        System.out.println("I'm mouse");
    }
}
