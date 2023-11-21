package com.example.School.Repositories;
import com.example.School.Entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

}
