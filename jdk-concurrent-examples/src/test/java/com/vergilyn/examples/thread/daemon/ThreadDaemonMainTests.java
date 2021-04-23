package com.vergilyn.examples.thread.daemon;

/**
 * @author vergilyn
 * @since 2021-04-23
 */
public class ThreadDaemonMainTests extends AbstractThreadTests{

	public static void main(String[] args) {
		ThreadDaemonMainTests tests = new ThreadDaemonMainTests();

		// 守护线程，强制抛弃
		// tests.testTemplate(true, 2);

		// 用户线程，会等待执行完毕
		tests.testTemplate(false, 2);

		// 都会 强制结束运行的线程
		// System.exit(0);
	}
}
