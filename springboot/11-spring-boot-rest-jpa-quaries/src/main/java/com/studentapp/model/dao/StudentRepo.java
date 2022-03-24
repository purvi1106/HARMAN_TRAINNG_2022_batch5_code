package com.studentapp.model.dao;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
/*
 * studentId    firstName     lastName email;
 */
	
	//----------approach 2-------------------
	//Query can be used to tell spring data what u want to do : HQL vs SQL both :)
	@Query("select s from Student s where s.email =?1")
	Student getStudentByEmailName(String email);
	
	//Native Sql student_table student_id | email  | first_name | last_name
	
	@Query(value = "select * from student_table s where s.email =?1", nativeQuery = true)
	Student getStudentByEmailNameNativeQuery(String email);
	
	@Query(value = "select * from student_table s where s.email =:emailId", nativeQuery = true)
	Student getStudentByEmailNameNativeQueryV2(@Param("emailId") String email);
	
	
	@Transactional
	@Modifying
	@Query(value = "update student_table set email=?1 where first_name=?2", nativeQuery = true)
	void updateEmail(String email, String firstName);
	
	
	
	//----------approach 1-------------------
	List<Student> findByLastNameNotNull();
	
	List<Student> findByFirstName(String firstName);
	
	List<Student> findByFirstNameContaining(String firstName);
	
	List<Student> findByFirstNameOrLastName(String firstName, String lastName);
	
	List<Student> findByFirstNameAndLastName(String firstName, String lastName);
	
	
}
