package com.mphasis;

public class QueueUsinginkedList {

    
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node front = null;  
    private static Node rear = null;  

  
    public static boolean isEmpty() {
        return front == null;
    }

    public static void insert(int data) {
        Node newNode = new Node(data);

        if (rear == null) { // queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " is inserted successfully");
    }

 
    public static void delete() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }

        System.out.println("element deleted: " + front.data);
        front = front.next;

        if (front == null) { // queue became empty
            rear = null;
        }
    }


    public static void display() {
        if (isEmpty()) {
            System.out.println("no data in the queue");
            return;
        }

        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

   
    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);

        display();

        delete();
        delete();

        display();

        delete();
        delete();
    }
}
