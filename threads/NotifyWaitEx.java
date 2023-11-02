package threads;

class Message {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String m) {
		this.message = message;
	}

	public Message(String m) {
		super();
		this.message = message;
	}
}

class WaitThread implements Runnable {
	private Message m;

	WaitThread(Message m){
			this.m=m;
		}

	@Override
	public void run() {
String s=Thread.currentThread().getName();
synchronized(m) {
	System.out.println(s+" : waiting to get notified");


try {
m.wait();

}catch(InterruptedException e) {
			e.printStackTrace();
		}

System.out.println(s+"got notified");
System.out.println(s+" : Thread is processed"+ m.getMessage());

	}
	}
}

	

class NotifyThread implements Runnable{
		private Message m;
		
		NotifyThread(Message m){
			this.m=m;
		}
	

	@Override
	public void run() {
		String s = Thread.currentThread().getName();
		
		System.out.println(s+"  :Started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(m) {
			m.setMessage(s+" : Notifier ");
			m.notifyAll();
		}
	}

}

public class NotifyWaitEx{

	public static void main(String[] args) {
		Message m1=new Message("Process Thread");
		WaitThread w=new WaitThread(m1);
		new Thread(w,"waitthread1").start();
		WaitThread w1=new WaitThread(m1);
		new Thread(w1,"waitthread2").start();
		NotifyThread n=new NotifyThread(m1);
		new Thread(n,"notify").start();
		System.out.println("all thread started");
		
		

	}

}
