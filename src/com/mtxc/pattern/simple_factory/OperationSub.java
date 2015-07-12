package com.mtxc.pattern.simple_factory;

/**
 * 减法运算符
 * 
 * @author mtxc
 *
 */
public class OperationSub extends Operation {

	@Override
	public double getResult(double numA, double numB) {
		return (numA - numB);
	}

}
