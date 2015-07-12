package com.mtxc.pattern.simple_factory;

/**
 * 乘法运算符
 * 
 * @author mtxc
 *
 */
public class OperationMul extends Operation {

	@Override
	public double getResult(double numA, double numB) {
		return (numA * numB);
	}

}
