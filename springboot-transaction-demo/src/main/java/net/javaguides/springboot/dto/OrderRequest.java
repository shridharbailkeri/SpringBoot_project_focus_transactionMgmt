package net.javaguides.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import net.javaguides.springboot.entity.Order;
import net.javaguides.springboot.entity.Payment;

@Getter
@Setter
public class OrderRequest { // we use this to send data from client to server

    private Order order;

    private Payment payment;
}
