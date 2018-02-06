package com.green.repositories;

import com.green.items.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Gosha on 030 30.01.18.
 */
public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
