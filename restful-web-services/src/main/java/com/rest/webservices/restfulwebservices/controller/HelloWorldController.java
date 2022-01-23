package com.rest.webservices.restfulwebservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource ; // helps to pick up the properties from message bundles

    @GetMapping("/hello-world-internationalized")
    public String helloWorldInternationalized(
          //  @RequestHeader(name = "Accept-Language", required = false)Locale locale
    ){

        return messageSource.getMessage("good.morning.message",null,"Default Message", //locale)
                LocaleContextHolder.getLocale());

        // en = Hello world
        // nl = Goede Morgen
        // fr = Bonjour
    }
}
