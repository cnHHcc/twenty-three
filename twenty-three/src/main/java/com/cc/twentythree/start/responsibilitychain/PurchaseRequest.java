package com.cc.twentythree.start.responsibilitychain;

import lombok.Data;

/**
 * @author cc
 * @date 2021/9/13 22:05
 * 请求实体类
 */
@Data
public class PurchaseRequest {
    private int type;
    private float price;
    private int id;

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

}
