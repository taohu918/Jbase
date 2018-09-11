package com.adapter.base;

class NoneName3 {
    public static void main(String[] args) {
        Button b1 = new Button();
        b1.addListener(new MouseAdapter() {
            public void onClick() {
                System.out.println("点击了1下!!");
            }

            public void onDbClick() {
                System.out.println("点击了2下!!");
            }
        });
        b1.click();
        b1.dbClick();
    }
}

//按钮
class Button {
    private MouseListener listener;

    void addListener(MouseListener listener) {
        this.listener = listener;
    }

    void click() {
        listener.onClick();
    }

    void dbClick() {
        listener.onDbClick();
    }
}

//鼠标监听器
interface MouseListener {
    public void onClick();        //单击事件

    public void onDbClick();    //双击事件

    public void rightClick();    //

    public void xxxClick();
}

//鼠标适配器
abstract class MouseAdapter implements MouseListener {
    public void rightClick() {
    }

    public void xxxClick() {
    }
}

