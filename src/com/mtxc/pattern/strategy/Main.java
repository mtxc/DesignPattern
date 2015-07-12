package com.mtxc.pattern.strategy;

/**
 * <b>策略模式</b><br/>
 * 策略模式定义了算法家族，分别封装起来，让他们之间可以互相替换，此模式让
 * 算法的变化，不会影响到使用算法的客户<br/>
 * 
 * 组成：<br/>
 * 抽象策略角色：通常由一个抽象类或一个接口实现，声明算法公共行为<br/>
 * 具体策略角色：封装了具体的算法或行为，继承自抽象策略类<br/>
 * 环境角色：用一个具体策略类配置，维护一个抽象策略对象的引用<br/>
 * 
 * 应用场景：<br/>
 * 1、多个类只区别在表现行为不同，可以使用Strategy模式，在运行时动态选择
 * 具体要执行的行为<br/>
 * 2、需要在不同情况下使用不同的策略(算法)，或者策略还可能在未来用其它方
 * 式来实现。<br/>
 * 3、对客户隐藏具体策略(算法)的实现细节，彼此完全独立。<br/>
 * 
 * 优点：<br/>
 * 1、策略模式提供了管理相关的算法族的办法。策略类的等级结构定义了一个算
 * 法或行为族。恰当使用继承可以把公共的代码转移到父类里面，从而避免重复的
 * 代码。<br/>
 * 2、策略模式提供了可以替换继承关系的办法。继承可以处理多种算法或行为。
 * 如果不是用策略模式，那么使用算法或行为的环境类就可能会有一些子类，每一
 * 个子类提供一个不同的算法或行为。但是，这样一来算法或行为的使用者就和算
 * 法或行为本身混在一起。决定使用哪一种算法或采取哪一种行为的逻辑就和算法
 * 或行为的逻辑混合在一起，从而不可能再独立演化。继承使得动态改变算法或行
 * 为变得不可能。<br/>
 * 3、使用策略模式可以避免使用多重条件转移语句。多重转移语句不易维护，它
 * 把采取哪一种算法或采取哪一种行为的逻辑与算法或行为的逻辑混合在一起，统
 * 统列在一个多重转移语句里面，比使用继承的办法还要原始和落后。<br/>
 * 
 * 缺点：<br/>
 * 1、客户端必须知道所有的策略类，并自行决定使用哪一个策略类。这就意味着客
 * 户端必须理解这些算法的区别，以便适时选择恰当的算法类。换言之，策略模式
 * 只适用于客户端知道所有的算法或行为的情况。<br/>
 * 2、策略模式造成很多的策略类，每个具体策略类都会产生一个新类。有时候可以
 * 通过把依赖于环境的状态保存到客户端里面，而将策略类设计成可共享的，这样
 * 策略类实例可以被不同客户端使用。换言之，可以使用享元模式来减少对象的数
 * 量。<br/>
 * 
 * @author mtxc
 *
 */
public class Main {

	public static void main(String[] args) {

		Context context;
		// 测试ConcreteStrategyA，通过传入全类名的方式配置
		try {
			context = new Context("com.mtxc.pattern.strategy.ConcreteStrategyA");
			context.execute();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 测试ConcreteStrategyB，通过传入全类名的方式配置
		try {
			context = new Context("com.mtxc.pattern.strategy.ConcreteStrategyB");
			context.execute();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
