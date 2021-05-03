package com.epam.esm.repository.repository;

import java.util.List;

import com.epam.esm.repository.entity.Order;

public interface OrderRepository extends CrdOperations<Order> {

    List<Order> readOrdersByUser(long userID);
}
