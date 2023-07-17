package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

public class Main14 {
    public static void main(String[] args) {
        Queue queue = new Queue(1000);
        Product product1 = new Product();
        product1.setId("HH001");
        product1.setDate(new Date());
        product1.setName("TV Samsung");
        product1.setPrice(1000);
        queue.enqueue(product1);

//        Queue queue = new Queue(1000);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        System.out.println(queue.dequeue()
//                + " dequeued from queue\n");
//        System.out.println("Front item is "
//                + queue.front());
//        System.out.println("Rear item is "
//                + queue.rear());
    }
}

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
class Product {
    private String id;
    private String name;
    private Date date;
    private float price;
}

class Queue {
    int front, rear, size;
    int capacity;
    Product array[];

    public Queue(int capacity)
    {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new Product[this.capacity];
    }

    // Queue is full when size becomes
    // equal to the capacity
    boolean isFull(Queue queue)
    {
//        if(queue.size == queue.capacity) return true;
//        return false;
        return (queue.size == queue.capacity);
    }

    // Queue is empty when size is 0
    boolean isEmpty(Queue queue)
    {
        return (queue.size == 0);
    }

    // Method to add an item to the queue.
    // It changes rear and size
    void enqueue(Product item)
    {
        if (isFull(this))
            return;
        this.rear = (this.rear + 1)
                % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item
                + " enqueued to queue");
    }

    // Method to remove an item from queue.
    // It changes front and size
    Product dequeue()
    {
        if (isEmpty(this))
            return null;

        Product item = this.array[this.front];
        this.front = (this.front + 1)
                % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    // Method to get front of queue
    Product front()
    {
        if (isEmpty(this))
            return null;

        return this.array[this.front];
    }

    // Method to get rear of queue
    Product rear()
    {
        if (isEmpty(this))
            return null;
        return this.array[this.rear];
    }
}
