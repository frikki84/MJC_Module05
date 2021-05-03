package com.epam.esm.service.service.mapper.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.epam.esm.repository.entity.User;
import com.epam.esm.service.entity.UserDto;
import com.epam.esm.service.service.mapper.UserDtoMapper;

@Component
public class UserDtoMapperImpl implements UserDtoMapper {

    @Autowired
    private final PasswordEncoder passwordEncoder;

    public UserDtoMapperImpl(PasswordEncoder passwordEncoder) {

        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User chandeDtoToUser(UserDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setEmail(dto.getEmail());
        user.setRole(dto.getRole());
        return user;
    }

    @Override
    public UserDto chandeUserToDto(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        dto.setRole(user.getRole());
        return dto;
    }

}
