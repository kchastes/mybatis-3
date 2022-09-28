package org.apache.self.dao;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;
import org.apache.self.entity.Student;
public interface StudentMapper {

  Student selectStudentById(@Param("id") Integer id);

  int insertStudent(Student student);

}
