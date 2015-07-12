package com.mtxc.pattern.simple_factory;

/**
 * <b>简单工厂模式</b><br/>
 * 
 * 简单工厂模式又称为静态工厂方法模式<br/>
 * 
 * 简单工厂模式主要有三个角色：<br/>
 * 1、工厂角色：简单工厂模式的核心，负责所有产品创建的内部逻辑，被外部调用，创建对应产品<br/>
 * 2、抽象产品角色：工厂类创建的所有产品的父类，可以是一个抽象类，也可以是一个接口，定义该类产
 * 品的公共属性及方法<br/>
 * 3、具体产品角色：继承或实现抽象产品类的具体产品，这些类是工厂所创建的具体实例对象<br/>
 * 
 * 简单工厂模式的优缺点：<br/>
 * 优点：<br/>
 * 工厂类将所有产品对象的创建逻辑全部封装，用户在创建具体产品的时候不需要知道内部的判断逻辑，
 * 去除了客户端对具体产品的依赖，有利于整个软件体系结构的优化<br/>
 * 缺点：<br/>
 * 由于工厂类集中了所有实例的创建，导致如果这个工厂类出现问题，所有客户端都会受到牵连，违背了
 * “高内聚责任分配”的原则。如果需要增加产品，除了新增产品类外，还需要更改工厂类，添加switch分
 * 支，违背了“开放-封闭原则”。当具体产品类不断增多时候，可能会出现要求工厂类根据不同条件创建不
 * 同实例的需求。这种对条件的判断和对具体产品类型的判断交错在一起，很难避免模块功能的蔓延，对
 * 系统的维护和扩展非常不利<br/>
 * 
 * @author mtxc
 *
 */
public class Main {

	public static void main(String[] args) {
		// 加法测试
		Operation operation = OperationFactory.getOperation("+");
		System.out.println("10+10=" + operation.getResult(10, 10));
		// 减法测试
		operation = OperationFactory.getOperation("-");
		System.out.println("15-2=" + operation.getResult(15, 2));
		// 乘法测试
		operation = OperationFactory.getOperation("*");
		System.out.println("13*3=" + operation.getResult(13, 3));
		// 除法正常测试
		operation = OperationFactory.getOperation("/");
		System.out.println("20/5=" + operation.getResult(20, 5));
		// 除法异常测试
		try {
			System.out.println("10/0=" + operation.getResult(10, 0));
		} catch (ArithmeticException e) {
			System.out.println("10/0计算异常，被除数不能为0");
		}
	}

}
