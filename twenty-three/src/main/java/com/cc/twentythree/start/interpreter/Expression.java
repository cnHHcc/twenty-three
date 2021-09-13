package com.cc.twentythree.start.interpreter;

import java.util.HashMap;

/**
 * 抽象类表达式，通过HashMap键值对，可以获取到变量的值
 */
public abstract class Expression {
	/**
	 * HashMap中存放的就是公式和值。key就是表达式的公式（表达式），value就是具体的值
	 * 即{a=10,b=20,c=40}
	 * @param var
	 * @return
	 */
	public abstract int interpreter(HashMap<String, Integer> var);
}
