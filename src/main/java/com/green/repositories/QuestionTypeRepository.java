package com.green.repositories;

import com.green.items.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Gosha on 030 30.01.18.
 */
public interface QuestionTypeRepository extends JpaRepository<QuestionType, Integer> {
}
