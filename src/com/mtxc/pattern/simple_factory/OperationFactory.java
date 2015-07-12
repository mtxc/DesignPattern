package com.mtxc.pattern.simple_factory;

/**
 * 运算符工厂类
 * 
 * @author mtxc
 *
 */
public class OperationFactory {

	/**
	 * 运算符工厂方法
	 * 
	 * @param operation
	 *            运算符字符串
	 * @return 字符串所代表的具体的运算符类
	 */
	public static Operation getOperation(String operation) {
		switch (operation) {
		case "+":
			return new OperationAdd();
		case "-":
			return new OperationSub();
		case "*":
			return new OperationMul();
		case "/":
			return new OperationDiv();
		default:
			return null;
		}
	}

}
