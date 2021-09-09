package com.cc.twentythree.start.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 15:32
 */
public class ProxyFactory {
    //要代理的目标类，因为不知道进来的是什么，所以这里用所有类的父类Objcet；
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        /**
         *  public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h) throws IllegalArgumentException{
         *
         * ........}
         * 参数解析：
         * ClassLoader loader 指定当前目标对象使用的类加载器，获取对象的类加载器方法是固定的
         * Class<?>[] interfaces 目标对象实现的接口类型，通过泛型的方式确认类型
         * InvocationHandler h 事情处理，执行目标对象方法时，会出发事情处理器方法，即会把当前执行的目标的对象方法当参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        //通过反射机制调用目标对象的方法
                        /**
                         * 其中args是数组
                         * target就是目标对象
                         * returnVal就是该方法的调用后的返回值
                         */
                        if (target instanceof Teacher){
                            if (((Teacher) target).isHealth()){
                                System.out.println("老师身体健康，不需要代理");
                                return null;
                            } else {
                                System.out.println("JDk代理开始....");
                                return method.invoke(target, args);
                            }
                        } else {
                            System.out.println("对象不正确，无法代理");
                            return null;
                        }
                    }
                });
    }
}
