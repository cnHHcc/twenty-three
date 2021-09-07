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
 * 优点：在需求发生变化时（增加一个正方形），使用方代码不需要动，服务方现有代码也不需要动，只需要新增一个即可
 * 使用放不需要关心这个实际的draw方法由谁调用，我们只需要把对应的抽象类的实现类传进去就可以了
 */
class GraphicEditor {//使用方
    public void drawShape(Shape s) {
        s.draw();
    }
}

//一下为服务方
abstract class Shape {//变抽象类
    int m_type;
    //抽象方法，让子类去重写
    public abstract void draw ();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("三角形");
    }
}
class Quadrate extends Shape {
    @Override
    public void draw() {
        System.out.println("正方形");
    }
}