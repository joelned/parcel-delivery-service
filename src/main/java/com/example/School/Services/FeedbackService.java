package com.example.School.Services;

import com.example.School.Entities.Feedback;
import com.example.School.Repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {
    private final FeedbackRepository feedBackRepository;
    @Autowired
    public FeedbackService(FeedbackRepository feedBackRepository) {
        this.feedBackRepository = feedBackRepository;
    }
    public void saveFeedback(Feedback feedback){
        feedBackRepository.save(feedback);
    }
}
