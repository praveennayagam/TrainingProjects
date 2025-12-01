package com.mphasis;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChefES extends Thread{
	
	private String order;
	
	
	public ChefES(String order) {
		super();
		this.order = order;
	}
	@Override
	public void run() {
		
			System.out.println(getName()+" is preparing "+ order);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName()+" got interrupted");
				e.printStackTrace();
			}
			System.out.println(getName()+" served "+order);
		}
	

	


	public static void main(String[] args) {
		
		
		ExecutorService manager=Executors.newFixedThreadPool(4);
		
		String[]menu= {"briyani","chicken curry","fish curry","panner fry","fried rice"};
		
		for(String item: menu)
		{
			ChefES chefThread=new ChefES(item);
			manager.submit(chefThread);
			
		}
		
		manager.shutdown();
	}

}
