package com.cc.twentythree.principle.ocp.improve;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/6 16:37
 * 开闭原则
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Quadrate());
    }
}


/**
 * 优点：在需求发生变化时，使用方代码不需要动，服务方现有代码也不需要动，只需要新增一个即可
 */
class GraphicEditor {//使用方
    public void drawShape(Shape s) {
        s.draw();
    }
}

//一下为服务方
abstract class Shape {//变抽象类
    int m_type;
    public abstract void draw ();
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("圆形");
    }
}

class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("三角形");
    }
}
class Quadrate extends Shape {
    Quadrate() {
        super.m_type = 4;
    }
    @Override
    public void draw() {
        System.out.println("正方形");
    }
}