package com.goldie.example.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldie.example.sender.WhatsAppSender;

@Service
public class WhatsAppService {
    @Autowired
    WhatsAppSender whatsAppSender;

    private static final String PHONE_NUMBER = "8712142303";

    public void sendMessage(String message) {
        whatsAppSender.send(message, PHONE_NUMBER);
    }

    public String handleCallback(Map<String, String> twilioResponse) {
        String to = whatsAppSender.getMessage(twilioResponse.get("MessageSid"));

        if (twilioResponse.get("MessageStatus").equals("failed")) {
            return "Could not send message to: " + to;
        }
        
        StringBuilder messageInfo = new StringBuilder();
        messageInfo.append("Message ID: ").append(twilioResponse.get("MessageSid\n"));
        messageInfo.append("Message status: ").append(twilioResponse.get("MessageStatus"));

        return messageInfo.toString();
    }
}
