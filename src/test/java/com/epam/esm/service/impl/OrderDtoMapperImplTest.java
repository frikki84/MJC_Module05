package com.epam.esm.service.impl;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.epam.esm.repository.entity.GiftCertificate;
import com.epam.esm.repository.entity.Order;
import com.epam.esm.repository.entity.User;
import com.epam.esm.service.entity.GiftCertificateDto;
import com.epam.esm.service.entity.OrderDto;
import com.epam.esm.service.entity.UserDto;
import com.epam.esm.service.service.mapper.CertificateDtoMapper;
import com.epam.esm.service.service.mapper.UserDtoMapper;
import com.epam.esm.service.service.mapper.impl.OrderDtoMapperImpl;

@ExtendWith(MockitoExtension.class)
class OrderDtoMapperImplTest {

    @Mock
    private CertificateDtoMapper certificateMapper;
    @Mock
    private UserDtoMapper userDtoMapper;
    @InjectMocks
    private OrderDtoMapperImpl mapper;

    private User user = new User();
    private UserDto userDto = new UserDto();
    private GiftCertificate certificate = new GiftCertificate();
    private GiftCertificateDto certificateDto = new GiftCertificateDto();
    private Order order = new Order();
    private OrderDto orderDto = new OrderDto();
    private long ID = 1L;

    @BeforeEach
    void setUp() {
        order.setId(ID);
        order.setUser(user);
        order.setGiftCertificateList(Arrays.asList(certificate));
        orderDto.setId(ID);
//        orderDto.setUser(userDto);
        orderDto.setGiftCertificateList(Arrays.asList(certificateDto));
    }

    @Test
    void chandeDtoToOrder() {
        Mockito.when(certificateMapper.changeDtoToCertificate(certificateDto)).thenReturn(certificate);
        Mockito.when(userDtoMapper.chandeDtoToUser(userDto)).thenReturn(user);
        Assertions.assertEquals(order, mapper.chandeDtoToOrder(orderDto));

    }

    @Test
    void chandeOrderToDto() {
        Mockito.when(certificateMapper.changeCertificateToDto(certificate)).thenReturn(certificateDto);
        //Mockito.when(userDtoMapper.chandeUserToDto(user)).thenReturn(userDto);
        Assertions.assertEquals(orderDto, mapper.chandeOrderToDto(order));
    }
}