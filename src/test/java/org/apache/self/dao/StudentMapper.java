package org.apache.self.dao;

import org.apache.self.entity.Student;

public interface StudentMapper {

  Student selectStudentById(Integer id);

  int insertStudent(Student student);

}
