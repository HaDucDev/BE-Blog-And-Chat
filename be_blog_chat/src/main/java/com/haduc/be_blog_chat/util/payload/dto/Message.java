package com.haduc.be_blog_chat.util.payload.dto;

import com.haduc.be_blog_chat.util.enumeration.Status;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Message {
    private String senderName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;
}
