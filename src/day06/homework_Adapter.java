package com.homework.adapter;

public class homework_Adapter {
    public static void main(String args[]) {
        Window w = new Window();
        w.setListener(new WindowAdapter() {
            public void min() {
                System.out.println("min");
            }
        }).min();
        w.min();
        w.max();
    }
}

class Window {
    private WindowListener w;

    public Window setListener(WindowListener w) {
        this.w = w;
        return this;
    }

    void min() {
        System.out.println("default min");
    }

    void max() {
        System.out.println("default max");
    }
}

interface WindowListener {
    void resize();

    void move();

    void close();
}

abstract class WindowAdapter implements WindowListener {
    public void resize() {
        System.out.println("resize");
    }

    public void move() {
        System.out.println("move");
    }

    public void close() {
        System.out.println("close");
    }
}