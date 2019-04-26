package com.splitter.controllers;

import com.splitter.dto.UserNetWorthDto;
import com.splitter.dto.UserRequestDto;
import com.splitter.dto.UserResponseDto;
import com.splitter.entities.User;
import com.splitter.services.UserAssetLiabilitiesService;
import com.splitter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/user")
public class UserController extends AbstractController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserAssetLiabilitiesService userAssetLiabilitiesService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView model = new ModelAndView("HelloWorldPage");
        model.addObject("msg", "hello world");
        return model;
    }

    @PostMapping(value = "")
    public ResponseEntity<User> createNewUser(@RequestBody UserRequestDto json) {

        User usr = userService.addNewUser(json);
        return new ResponseEntity<>(usr, HttpStatus.OK);
    }

    @GetMapping(value = "")
    public ResponseEntity<List<UserResponseDto>> getUser() {

        List<UserResponseDto> userList = userService.getAllUsers();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @GetMapping(value = "/{userid}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable(value = "userid") Long userId) {

        UserResponseDto user = userService.getUser(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping(value = "/email")
    public ResponseEntity<UserResponseDto> getUserByEmailId(@RequestParam(value = "emailId") String emailId) {

        UserResponseDto user = userService.getUserByEmailId(emailId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping(value = "/{userid}/worth")
    public ResponseEntity<UserNetWorthDto> getMyNetWorth(@PathVariable(value = "userid") Long userId) {

        UserNetWorthDto userNetWorth = userAssetLiabilitiesService.getMyNetWorth(userId);
        return new ResponseEntity<>(userNetWorth, HttpStatus.OK);
    }
}
