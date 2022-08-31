package org.apache.self.entity;

import java.util.List;

public class ClassRoom {

  private Integer id;
  private String className;
  private String classTeacher;
  private List<Student> students;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public String getClassTeacher() {
    return classTeacher;
  }

  public void setClassTeacher(String classTeacher) {
    this.classTeacher = classTeacher;
  }

  @Override
  public String toString() {
    return "ClassRoom{" +
      "id=" + id +
      ", className='" + className + '\'' +
      ", classTeacher='" + classTeacher + '\'' +
      ", students=" + students +
      '}';
  }
}
