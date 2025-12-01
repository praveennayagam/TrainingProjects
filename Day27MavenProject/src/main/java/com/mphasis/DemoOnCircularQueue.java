package com.mphasis;

public class DemoOnCircularQueue {

	private static int front=-1;
	private static int rear=-1;
	private static int []cq=new int[10];
	
	public static boolean isEmpty()
	{
		return	front==-1;
	}
	public static boolean isFull()
	{
		  return (rear + 1) % cq.length == front;
	}
	
	public static void insert(int data) {
	    if (isFull()) {
	        System.out.println("queue is full");
	    } else {
	        if (rear == -1) {   // first insertion
	            front = 0;
	        }
	            rear=(rear+1)%10;
	            cq[rear] = data;
	            System.out.println(data + " inserted successfully");
	        } 
	    }
	

	
	public static void delete()
	{
		if(isEmpty())
			System.out.println("queue is empty");
		else
		{
			System.out.println(cq[front]+" deleted successfully");
			if(front==rear)
				front=rear=-1;
			else
			front=(front+1)%10;
		}
	}
	
//	public static void delete() {
//	    if (isEmpty()) {
//	        System.out.println("queue is empty");
//	    } else {
//	        System.out.println(cq[front] + " deleted successfully");
//
//	        if (front == rear) {
//	            // Queue becomes empty after removing the last element
//	            front = -1;
//	            rear = -1;
//	        } else {
//	            // Move front forward in circular manner
//	            front = (front + 1) % cq.length;
//	        }
//	    }
//	}

	
	public static void display()
	{
		if(isEmpty())
			System.out.println("no data im the circularqueue");
		else
		{
			for(int i=front;i!=rear;i=(i+1)%10)
			{
				System.out.println(cq[i]);
			}
			System.out.println(cq[rear]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
