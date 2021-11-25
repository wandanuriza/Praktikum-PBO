package exception;

public class AsyncRun implements Runnable {
    @Override
	public void run() {
		// TODO Auto-generated method stub
    	System.out.println("AsyncRun.run on thread " + Thread.currentThread().getId());
    	throw new ArithmeticException();
	}

public static void main ( String[] args ) {
	try {
		Thread t = new Thread(new AsyncRun()); //using the constructor Th
		t.start();
		System.out.println("main on thread" + Thread.currentThread().getId());
		throw new NullPointException();		
	}
	catch(Exception ex)
	{
		System.out.println(ex.getClass().getName() + " handled");
	}
}
