package com.cc.twentythree.start.builder.improve;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 9:27
 * 房子（对应角色时product）
 */
@Data
public class House {
    /**
     * 地基
     */
    private String base;
    /**
     * 墙
     */
    private String wall;
    /**
     * 屋顶
     */
    private String roofed;
}
