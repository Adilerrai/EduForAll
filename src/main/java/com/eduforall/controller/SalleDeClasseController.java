package com.eduforall.controller;

import com.eduforall.service.SalleDeClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cours")
public class SalleDeClasseController {


    @Autowired
    private SalleDeClasseService salleDeClasseService;








}
