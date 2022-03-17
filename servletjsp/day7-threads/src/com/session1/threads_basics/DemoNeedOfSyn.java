package com.session1.threads_basics;

class Printer {
	private Object lock=new Object();
	
	public void print(String letter) {
		//
		//
		synchronized (lock) {
			System.out.print("[");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(letter + "]");
		}

		//
		//
	}
}

class Client implements Runnable {
	private Printer printer;
	private String letter;
	private Thread thread;

	public Client(Printer printer, String letter) {
		this.printer = printer;
		this.letter = letter;
		this.thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		printer.print(letter);
	}

}

public class DemoNeedOfSyn {

	public static void main(String[] args) {
		Printer printer = new Printer();
		Client raj = new Client(printer, "i love java");
		Client ekta = new Client(printer, "i love traveling");
		Client seema = new Client(printer, "i love MI");

	}

}
