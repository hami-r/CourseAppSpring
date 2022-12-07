package com.nest.courseapp_backend.dao;

import com.nest.courseapp_backend.model.CourseModel;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseDao extends CrudRepository<CourseModel,Integer> {
    @Query(value = "SELECT `id`,`course_date`,`course_description`,`course_duration`,`course_title`,`course_venue` FROM `courses` WHERE `course_title` = :title",nativeQuery = true)
    List<CourseModel> searchCourse(String title);
}
