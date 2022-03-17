package com.session1.threads_basics2.pc_correct;
//BlockingQueque : java 5: used to solve producer consumer problem
//wait and notify, notifyAll
class Q{
	int n;
	boolean valueSet=false;
	//consumer
	synchronized int get() {
		if(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("get: "+ n);
		valueSet=false;
		notify();
		return n;
	}
	//producer
	synchronized void put(int n) {
		if(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("put: "+ n);
		valueSet=true;
		notify();
	}
}
class Producer implements Runnable{
	Q q;
	
	public Producer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
		}
	}
}
class Consumer implements Runnable{
	Q q;
	
	public Consumer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {
		
		while(true) {
			q.get();
		}
	}
}
public class PandC {

	public static void main(String[] args) {

			Q q=new Q();
			Producer producer=new Producer(q);
			Consumer consumer=new Consumer(q);
			
	}

}




