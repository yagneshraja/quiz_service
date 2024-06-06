package com.quiz.QuizService.controllers;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping()
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    @GetMapping
    public List<Quiz> get(){
        return quizService.get();
    }

    @GetMapping("{id}")
    public Quiz getOne(@PathVariable("id") Long id){
        return quizService.getOne(id);
    }


}

