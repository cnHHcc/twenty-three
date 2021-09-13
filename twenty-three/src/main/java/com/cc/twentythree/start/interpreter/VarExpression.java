package com.cc.twentythree.start.interpreter;

import java.util.HashMap;

/**
 * 变量解析器
 */
public class VarExpression extends Expression {

	private String key; //a,b,c

	public VarExpression(String key) {
		this.key = key;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		//根据变量名称，获取对应的值
		return var.get(this.key);
	}
}
