package com.session2.basic_threads;

class Printer{
	//any java object can work as lock
	private Object lock=new Object();
	
	//synchronized keyword force current thread to accquire lock on current object (Printer ob)
	public  void print(String letter) {
		//
		//
		//critical section
		synchronized (lock) {
			System.out.print("[ ");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			System.out.println(letter +"]");
		}
		
		///
		//
		
	}
}

class Client implements Runnable{
	private Printer printer;
	private String letter;
	
	private Thread thread;
	public Client(Printer printer, String letter) {
		this.printer = printer;
		this.letter = letter;
		this.thread=new Thread(this);
		this.thread.start();
	}
	@Override
	public void run() {
		printer.print(letter);
	}
	
}
public class NeedOfSyn {
	
	public static void main(String[] args) {
		Printer printer=new Printer();
		
		Client ram=new Client(printer, "i love java");
		Client amit=new Client(printer, "i love ML");
		Client kapil=new Client(printer, "i love traveling");
		
		
	}

}



