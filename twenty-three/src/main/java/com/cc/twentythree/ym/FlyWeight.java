package com.cc.twentythree.ym;

public class FlyWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��� Integer.valueOf(x) x ��  -128 --- 127 ֱ�ӣ�����ʹ����Ԫģʽ����,�������
		//��Χ�࣬����Ȼ new 
		
		//С��:
		//1. ��valueOf �����У����ж�ֵ�Ƿ��� IntegerCache �У�������ڣ��ʹ����µ�Integer(new), ���򣬾�ֱ�Ӵ� ����ط���
		//2. valueOf ��������ʹ�õ���Ԫģʽ
		//3. ���ʹ��valueOf �����õ�һ��Integer ʵ������Χ�� -128 - 127 ��ִ���ٶȱ� new ��
		
		
		Integer x = Integer.valueOf(127); // �õ� xʵ�������� Integer
		Integer y = new Integer(127); // �õ� y ʵ�������� Integer
		Integer z = Integer.valueOf(127);//..
		Integer w = new Integer(127);

		/*
		valueOf����Դ��
		���Կ��������㴫���ֵ��-128 -- 127֮��ʱ����ֱ���ڳ��л�ȡ����ֻ�в��������Χ�ڵ�ʱ�򣬲Żᴴ��һ���µ�
		public static Integer valueOf(int i) {
			if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
				return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
			return new Integer(i);
		}*/
		
		System.out.println(x.equals(y)); // ��С��true
		System.out.println(x == y ); //  false
		System.out.println(x == z ); // true
		System.out.println(w == x ); // false
		System.out.println(w == y ); // false
		
		
		Integer x1 = Integer.valueOf(200);
		Integer x2 = Integer.valueOf(200);
		System.out.println("x1==x2" + (x1 == x2)); // false
		
		
		


	}

}
