package com.quiz.QuizService.services;

import com.quiz.QuizService.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url ="http://localhost:8082" ,value = "question-client")
@FeignClient(name="QUESTION-SERVICE")
public interface QuestionClient {
    @GetMapping("/question/{quizId}/questions")
    List<Question> getQuestionsOfQuiz(@PathVariable("quizId") Long quizId);
}
