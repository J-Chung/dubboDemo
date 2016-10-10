package cn.zto.test;

import cn.zto.consumer.ConsumerThd;

public class AppTest {
	public static void main(String[] args) {
		ConsumerThd thd = new ConsumerThd();
		thd.sayHello();
	}
}
