package com.cc.twentythree.principle.ocp;

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
    }
}
//一个用于绘图的类

/**
 * 优点：简单易操作
 * 缺点：不符合ocp原则（对扩展开放，对修改关闭） 如果需要添加一个三角形，修改的地方太多
 */
class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type ==3 ){
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("矩形");
    }

    public void drawCircle(Shape r) {
        System.out.println("圆形");
    }
    public void drawTriangle(Shape r){
        System.out.println("三角形");
    }
}


class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}