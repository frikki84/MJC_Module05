package com.epam.esm.service.service.mapper;

import com.epam.esm.repository.entity.User;
import com.epam.esm.service.entity.UserDto;

public interface UserDtoMapper {

    public User chandeDtoToUser(UserDto dto);

    public UserDto chandeUserToDto(User user);

}
