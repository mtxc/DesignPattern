package com.mtxc.pattern.simple_factory;

/**
 * 加法运算符
 * 
 * @author mtxc
 *
 */
public class OperationAdd extends Operation {

	@Override
	public double getResult(double numA, double numB) {
		return (numA + numB);
	}

}
