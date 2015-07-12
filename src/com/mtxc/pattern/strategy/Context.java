package com.mtxc.pattern.strategy;

/**
 * 使用策略的上下文，使用一个ConcreteStrategy来配置，维持一个Strategy对象的引用
 * 
 * @author mtxc
 *
 */
public class Context {

	private Strategy strategy;
	
	/**
	 * 通过全类名反射的方式配置ConcreteStrategy
	 * 
	 * @param strategy 使用的ConcreteStrategy全类名
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public Context(String strategy) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		this.strategy = (Strategy) Class.forName(strategy).newInstance();
	}
	
	/**
	 * 执行算法
	 */
	public void execute(){
		strategy.AlgorithmInterface();
	}
	
}
