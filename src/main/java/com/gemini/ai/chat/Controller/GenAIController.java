package com.gemini.ai.chat.Controller;

import com.gemini.ai.chat.Model.CodeReview;
import com.gemini.ai.chat.service.InterviewCoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/genai")
public class GenAIController {

    @Autowired
    private InterviewCoachService interviewCoachService;

    public GenAIController()
    {
    }
    @PostMapping(value = "/review", consumes = MediaType.TEXT_PLAIN_VALUE) // Explicitly allow plain text
    public ResponseEntity<CodeReview> review(@RequestBody String input)
    {
        CodeReview feedback = interviewCoachService.getFeedBack(input);
        return ResponseEntity.ok(feedback); // Spring converts the Record to JSON
    }

}

