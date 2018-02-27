package com.green.repository;

import com.green.item.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Gosha on 030 30.01.18.
 */
public interface QuestionnaireRepository extends JpaRepository<Questionnaire, Integer> {
/*
    @Query(value = "select id_questionnaire from questionnaires where id_questionnaire=?1", nativeQuery = true)
    List<Questionnaire> SelectSmth(int id);*/

}
