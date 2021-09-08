package com.cc.twentythree.start.decorator;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 16:04
 * 被装饰者、装饰者抽象类
 */
@Data
public abstract class Drink {
    /**
     * 描述
     */
    public String des;
    /**
     * 价格
     */
    private float price = 0.0f;
    /**
     * 计算价格的抽象方法
     * 供子类具体实现
     * @return
     */
    public abstract float cost();
}
