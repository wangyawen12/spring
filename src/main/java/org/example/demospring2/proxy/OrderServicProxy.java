package org.example.demospring2.proxy;

public class OrderServicProxy implements OrderService{


    OrderService orderService;

    public OrderServicProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void generate() {
        long begin = System.currentTimeMillis();

        orderService.generate();
        long end = System.currentTimeMillis();
        System.out.println("it takes "+(end - begin)+"seconds");

    }
}
