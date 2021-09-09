package com.cc.twentythree.start.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 15:32
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //2.设置回调函数
        enhancer.setCallback(this);
        //2.创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (target instanceof Teacher){
            if (((Teacher) target).isHealth()){
                System.out.println("老师身体健康，不需要代理");
                return null;
            } else {
                System.out.println("Cglib代理开始....");
                return method.invoke(target, objects);
            }
        } else {
            System.out.println("对象不正确，无法代理");
            return null;
        }
    }
}
