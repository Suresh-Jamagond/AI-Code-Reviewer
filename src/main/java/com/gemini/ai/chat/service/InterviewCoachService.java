package com.gemini.ai.chat.service;

import com.gemini.ai.chat.Model.CodeReview;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class InterviewCoachService {
    private final ChatClient chatClient;

    public InterviewCoachService(ChatClient.Builder builder) {
        this.chatClient = builder.defaultSystem("You are a Senior Java Technical Interviewer in a product based company, Be concise and focus on Spring Boot and DSA").build();
    }

    public CodeReview getFeedBack(String userCurrentCode) {
        return chatClient.prompt().user("Review this code for me " + userCurrentCode)
                .call()
                .entity(CodeReview.class); // This MAGIC line converts AI text to your Record!
    }
}
