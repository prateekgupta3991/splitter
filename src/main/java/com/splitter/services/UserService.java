package com.splitter.services;


import com.splitter.dto.UserRequestDto;
import com.splitter.dto.UserResponseDto;
import com.splitter.entities.User;

import java.util.List;

/**
 * Created by prateek on 28/9/17.
 */
public interface UserService {

    User addNewUser(UserRequestDto userRequestDto);

    List<UserResponseDto> getAllUsers();

    UserResponseDto getUser(Long userId);
}
