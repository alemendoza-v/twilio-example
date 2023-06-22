package com.goldie.example.model;

public class WhatsAppResponse {
    private String AccountSid;
    private String From; 
    private String MessageSid;
    private String MessageStatus;
    private String SmsSid;
    private String SmsStatus;
    
    public WhatsAppResponse() {
    }

    public WhatsAppResponse(String accountSid, String from, String messageSid, String messageStatus, String smsSid,
            String smsStatus) {
        AccountSid = accountSid;
        From = from;
        MessageSid = messageSid;
        MessageStatus = messageStatus;
        SmsSid = smsSid;
        SmsStatus = smsStatus;
    }
    
    public String getAccountSid() {
        return AccountSid;
    }
    public void setAccountSid(String accountSid) {
        AccountSid = accountSid;
    }
    public String getFrom() {
        return From;
    }
    public void setFrom(String from) {
        From = from;
    }
    public String getMessageSid() {
        return MessageSid;
    }
    public void setMessageSid(String messageSid) {
        MessageSid = messageSid;
    }
    public String getMessageStatus() {
        return MessageStatus;
    }
    public void setMessageStatus(String messageStatus) {
        MessageStatus = messageStatus;
    }
    public String getSmsSid() {
        return SmsSid;
    }
    public void setSmsSid(String smsSid) {
        SmsSid = smsSid;
    }
    public String getSmsStatus() {
        return SmsStatus;
    }
    public void setSmsStatus(String smsStatus) {
        SmsStatus = smsStatus;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((AccountSid == null) ? 0 : AccountSid.hashCode());
        result = prime * result + ((From == null) ? 0 : From.hashCode());
        result = prime * result + ((MessageSid == null) ? 0 : MessageSid.hashCode());
        result = prime * result + ((MessageStatus == null) ? 0 : MessageStatus.hashCode());
        result = prime * result + ((SmsSid == null) ? 0 : SmsSid.hashCode());
        result = prime * result + ((SmsStatus == null) ? 0 : SmsStatus.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WhatsAppResponse other = (WhatsAppResponse) obj;
        if (AccountSid == null) {
            if (other.AccountSid != null)
                return false;
        } else if (!AccountSid.equals(other.AccountSid))
            return false;
        if (From == null) {
            if (other.From != null)
                return false;
        } else if (!From.equals(other.From))
            return false;
        if (MessageSid == null) {
            if (other.MessageSid != null)
                return false;
        } else if (!MessageSid.equals(other.MessageSid))
            return false;
        if (MessageStatus == null) {
            if (other.MessageStatus != null)
                return false;
        } else if (!MessageStatus.equals(other.MessageStatus))
            return false;
        if (SmsSid == null) {
            if (other.SmsSid != null)
                return false;
        } else if (!SmsSid.equals(other.SmsSid))
            return false;
        if (SmsStatus == null) {
            if (other.SmsStatus != null)
                return false;
        } else if (!SmsStatus.equals(other.SmsStatus))
            return false;
        return true;
    }
    
}
