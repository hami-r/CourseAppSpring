package com.nest.courseapp_backend.dao;

import com.nest.courseapp_backend.model.CourseModel;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<CourseModel,Integer> {

}
