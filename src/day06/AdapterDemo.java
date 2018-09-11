package com.adapter.demo;

class AdapterDemo {
    public static void main(String[] args) {
        Button b = new Button();
        b.setListener(new MouseAdapter() {
            public void onClick() {
                System.out.println("click on b");
            }
        });
        b.click();
        b.dbClick();

        Button c = new Button();
        c.setListener(new MouseAdapter() {
            public void onDbClick() {
                System.out.println("double click on c");
            }
        });
        c.dbClick();

        // 方法链编程
        new Button().setListener(new MouseAdapter() {
            public void onClick() {
                System.out.println("单击了匿名Button");
            }

            public void onDbClick() {
                System.out.println("双击了匿名Button");
            }
        }).click()
                .dbClick();
    }
}

// 按钮
class Button {
    private MouseListener l;

    public Button setListener(MouseListener l) {
        this.l = l;
        return this; // 方法链编程 条件
    }

    public Button click() {
        l.onClick();
        return this;
    }

    public void dbClick() {
        l.onDbClick();
    }
}

interface MouseListener {
    void onClick();

    void onDbClick();

    void onRightClick();

    void onMiddleClick();
}

// 适配器
abstract class MouseAdapter implements MouseListener {
    public void onClick() {
        System.out.println("click");
    }

    public void onDbClick() {
    }

    public void onRightClick() {
    }

    public void onMiddleClick() {
    }
}