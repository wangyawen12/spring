package org.example.demospring2.proxy;

public class OrderServiceImpl implements OrderService{
    @Override
    public void generate() {
        try{
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("order generated");
    }
}
