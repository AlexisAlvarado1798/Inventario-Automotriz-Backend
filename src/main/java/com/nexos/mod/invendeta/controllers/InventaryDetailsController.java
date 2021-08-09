package com.nexos.mod.invendeta.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@RestController
@Target(ElementType.TYPE)
@RequestMapping(path = "inven/api/v1")
@CrossOrigin
@Retention(RetentionPolicy.RUNTIME)
public @interface InventaryDetailsController {
}
