package org.apache.self.entity;

import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;

public class Student {

  private Integer id;
  private String userName;
  private Integer age;
  private LocalDateTime birthday;
  private Integer classId;
  private ClassRoom classRoom;

  public Student() {
  }

  public Student(Integer id,String userName, Integer age) {
    this.id = id;
    this.userName = userName;
    this.age = age;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public LocalDateTime getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDateTime birthday) {
    this.birthday = birthday;
  }

  public Integer getClassId() {
    return classId;
  }

  public void setClassId(Integer classId) {
    this.classId = classId;
  }

  public ClassRoom getClassRoom() {
    return classRoom;
  }

  public void setClassRoom(ClassRoom classRoom) {
    this.classRoom = classRoom;
  }

  @Override
  public String toString() {
    return "Student{" +
      "id=" + id +
      ", userName='" + userName + '\'' +
      ", age=" + age +
      ", birthday=" + birthday +
      ", classId=" + classId +
      ", classRoom=" + classRoom +
      '}';
  }
}
