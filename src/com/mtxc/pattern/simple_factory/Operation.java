package com.mtxc.pattern.simple_factory;

/**
 * 运算符的抽象基类
 * 
 * @author mtxc
 *
 */
public abstract class Operation {
	
	/**
	 * 运算符计算的抽象方法
	 * 
	 * @param numA 运算数A
	 * @param numB 运算数B
	 * @return 运算结果
	 */
	public abstract double getResult(double numA, double numB);
	
}
