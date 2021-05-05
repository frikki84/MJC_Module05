package com.epam.esm.service.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AuthentificationRequestDtoTest {
    private String name = "Anonim";
    private String password = "Anonim";
    private AuthentificationRequestDto dto = new AuthentificationRequestDto(name, password);

    @Test
    void getName() {
        assertEquals(name, dto.getName());
    }

    @Test
    void getPassword() {
        assertEquals(password, dto.getPassword());
    }


    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }
}