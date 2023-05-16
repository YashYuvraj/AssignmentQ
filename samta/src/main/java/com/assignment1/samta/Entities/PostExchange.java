package com.assignment1.samta.Entities;

public class PostExchange {
    public PostExchange(String correct_answer, NextQuestion next_question) {
        this.correct_answer = correct_answer;
        this.next_question = next_question;
    }

    private String correct_answer;
    private NextQuestion next_question;

  

    public NextQuestion getNext_question() {
        return next_question;
    }

    public void setNext_question(NextQuestion next_question) {
        this.next_question = next_question;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }
    
}
