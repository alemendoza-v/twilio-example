package com.goldie.example.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.goldie.example.model.WhatsAppResponse;
import com.goldie.example.service.WhatsAppService;

@RestController
public class WhatsAppController {
    @Autowired
    WhatsAppService whatsAppService;

    Logger logger = LoggerFactory.getLogger(WhatsAppController.class);

    @PostMapping("/callback")
    @ResponseStatus(HttpStatus.NO_CONTENT) 
    public void handleCallback(@RequestParam Map<String, String> response) {
        logger.info(response.get("SmsStatus"));
    }
    
    @PostMapping("/send")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void sendMessage(@RequestBody String message) {
        whatsAppService.sendMessage(message);
    }
}
