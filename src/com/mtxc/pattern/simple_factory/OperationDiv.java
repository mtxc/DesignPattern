package com.mtxc.pattern.simple_factory;

/**
 * 除法运算符
 * 
 * @author mtxc
 *
 */
public class OperationDiv extends Operation {

	@Override
	public double getResult(double numA, double numB) {
		// 除数为0，抛出算术异常
		if (numB == 0)
			throw new ArithmeticException();
		return (numA / numB);
	}

}
