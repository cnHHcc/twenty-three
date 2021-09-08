package com.cc.twentythree.start.decorator;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 16:09
 * 被装饰者具体实现类
 */
@Data
public class EspressoCoffee extends Coffee{
    public EspressoCoffee() {
        setDes("意式咖啡");
        setPrice(12.0f);
    }
}
