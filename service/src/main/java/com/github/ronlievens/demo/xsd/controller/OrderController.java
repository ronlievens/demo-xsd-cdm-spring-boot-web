package com.github.ronlievens.demo.xsd.controller;

import com.github.ronlievens.demo.xsd.cdm.Order;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/order")
@Validated
@RestController
public class OrderController {

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public Order ask(@PathVariable final Integer id) {
        return new Order();
    }
}
