package com.ad.service;

import com.ad.domain.Question;

public interface QuestionService {
    Question createQuestion(Question question);
    Question updateQuestion(Question question);

}
