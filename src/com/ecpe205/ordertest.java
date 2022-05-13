package com.ecpe205;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;




@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OrderTest {
    Order order;

    @BeforeAll
    void list(){
        order = new Order();
        order.addItem(new Product("1","garmasal",200),2);
        order.addItem(new Product("2","bryani",160),1);
        order.addItem(new Product("3","kawali",265),1);
        order.addItem(new Product("4","pemiento",500),30);
        order.addItem(new Product("5","orage",30),1);
    }

    @Test
    void addItems(){
        order.addItem(new Product("1","butter",145),14);
        order.addItem(new Product("12","ham",456),22);
        order.addItem(new Product("123","mayo",130),1);
        order.addItem(new Product("1234","vanilla",20),2);
        order.addItem(new Product("4566","cornsyrup",450),1);
       
    }



    @Test
    void getAmounts(){
        Order order = new Order();

        //1.
        order.addItem(new Product("1","garmasal",200),2);
        assertEquals(400,order.getItems().get(0).getAmount());

        //2.
       order.addItem(new Product("2","bryani",160),1);
        order.getItems().get(1).setProduct());
        assertEquals(160,order.getItems().get(1).getAmount());

        //3.
         order.addItem(new Product("3","kawali",265),1)
        order.getItems().get(2).setQuantity(50);
        assertEquals(530,order.getItems().get(2).getQuantity());

    }
}