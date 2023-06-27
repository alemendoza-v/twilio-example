package com.goldie.example.sender;                                                                                                     

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Component("whatsapp")
public class WhatsAppSender implements Sendable {

    @Value("${twilio.account.sid}")
    private String accountSid;

    @Value("${twilio.account.token}")
    private String authToken;

    @Value("${twilio.account.number}")
    private String phoneNumber;

    @Value("${host}")
    private String host;

    private final Map<String, String> messages = new HashMap<>();

    public WhatsAppSender() {
    }

    @Override
    public boolean send(String notification, String to) {
        try {
            Twilio.init(accountSid, authToken);
            Message message = Message.creator(
                    new PhoneNumber("whatsapp:+521" + to),
                    new PhoneNumber("whatsapp:" + phoneNumber),
                    notification)
                .setStatusCallback(URI.create(host + "/callback"))
                .create();
            messages.put(message.getSid(), message.getTo());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getMessage(String sid) {
        return messages.get(sid);
    }
}