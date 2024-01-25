package com.pika.ecommerce.controllers;

import com.pika.ecommerce.dto.user.SignInDto;
import com.pika.ecommerce.dto.user.SignInResponseDto;
import com.pika.ecommerce.dto.user.SignupDto;
import com.pika.ecommerce.exceptions.AuthenticationFailException;
import com.pika.ecommerce.exceptions.CustomException;
import com.pika.ecommerce.dto.user.SignUpResponseDto;
import com.pika.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public SignUpResponseDto Signup(@RequestBody SignupDto signupDto) throws CustomException {
        return userService.signUp(signupDto);
    }

    @PostMapping("/signIn")
    public SignInResponseDto SignIn(@RequestBody SignInDto signInDto) throws CustomException, AuthenticationFailException {
        return userService.signIn(signInDto);
    }

}
