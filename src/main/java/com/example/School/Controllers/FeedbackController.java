package com.example.School.Controllers;
import com.example.School.Entities.Feedback;
import com.example.School.Services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/feedback")
public class FeedbackController {
    private final FeedbackService feedbackService;
    @Autowired
    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }
    @PostMapping("/made")
    public ResponseEntity<Object> saveFeedback( @RequestBody Feedback feedback){
        feedbackService.saveFeedback(feedback);
        return new ResponseEntity<>("Thank you for your feedback", HttpStatus.CREATED);
    }
}
