package org.apache.self.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.self.dao.StudentMapper;
import org.apache.self.entity.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * lazyLoadingEnabled
 */
public class MyBatisTestApplication {

  private SqlSession sqlSession;

  public static void main(String[] args) {
    System.out.println(BigDecimal.valueOf(23).compareTo(BigDecimal.ZERO));
  }

  @Before
  public void init() throws IOException {
    InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    sqlSession = sqlSessionFactory.openSession();
  }

  @Test
  public void firstTest() {
      StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
      Student student = studentMapper.selectStudentById(1);
      //student = studentMapper.selectStudentById(1);
      System.out.println(student);
  }

  @Test
  public void testInsert(){
    Student addStudent = new Student();
    addStudent.setAge(99);
    addStudent.setUserName("");
    addStudent.setBirthday(LocalDateTime.now());
    addStudent.setClassId(3);

    StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
    System.out.println(studentMapper.insertStudent(addStudent));
    System.out.println("提交前:"+addStudent);
    sqlSession.commit();
    System.out.println("提交后:"+addStudent);
  }

  @After
  public void close(){
    if (Objects.nonNull(sqlSession)){
      sqlSession.close();
    }
  }

}
