package com.epam.esm.service.service.mapper;

import com.epam.esm.repository.entity.Order;
import com.epam.esm.service.entity.OrderDto;

public interface OrderDtoMapper {

    public Order chandeDtoToOrder(OrderDto dto);

    public OrderDto chandeOrderToDto(Order order);

}

