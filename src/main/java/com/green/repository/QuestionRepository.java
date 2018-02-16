package com.green.repository;

import com.green.item.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Gosha on 030 30.01.18.
 */
public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
