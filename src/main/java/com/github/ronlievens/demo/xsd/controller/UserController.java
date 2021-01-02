package com.github.ronlievens.demo.xsd.controller;

import com.github.ronlievens.demo.xsd.cdm.UserRequest;
import com.github.ronlievens.demo.xsd.cdm.UserResponse;
import lombok.val;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RequestMapping("/api/user")
@Validated
@RestController
public class UserController {

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public UserResponse ask(@RequestBody final UserRequest request) {
        val response = new UserResponse();
        response.setId(request.getId());
        response.setName(request.getName());
        response.setCreated(OffsetDateTime.now());
        if (response.getCreated().getSecond() % 2 == 0) {
            response.setGender("male");
        } else {
            response.setGender("female");
        }
        return response;
    }
}
