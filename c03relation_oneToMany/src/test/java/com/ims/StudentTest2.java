package com.ims;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java1234.mappers.StudentMapper;
import com.java1234.model.Student;
import com.java1234.util.SqlSessionFactoryUtil;

public class StudentTest2 {

	private static Logger logger=Logger.getLogger(StudentTest.class);
	private SqlSession sqlSession=null;
	private StudentMapper studentMapper=null;
	
	/**
	 * ���Է���ǰ����
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		sqlSession=SqlSessionFactoryUtil.openSession();
		studentMapper=sqlSession.getMapper(StudentMapper.class);
	}

	/**
	 * ���Է��������
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	@Test
	public void testAdd() {
		logger.info("���ѧ��");
		Student student=new Student("����",12);
		studentMapper.add(student);
		sqlSession.commit();
	}
	
	@Test
	public void testUpdate(){
		logger.info("�޸�ѧ��");
		Student student=new Student(8,"����2",13);
		studentMapper.update(student);
		sqlSession.commit();
	}
	
	@Test
	public void testDelete(){
		logger.info("ɾ��ѧ��");
		studentMapper.delete(8);
		sqlSession.commit();
	}
	
	@Test
	public void testFindById(){
		logger.info("ͨ��ID����ѧ��");
		Student student=studentMapper.findById(1);
		System.out.println(student);
	}

	@Test
	public void testFind(){
		logger.info("��������ѧ��");
		List<Student> studentList=studentMapper.find();
		for(Student s:studentList){
			System.out.println(s);
		}
	}
}
