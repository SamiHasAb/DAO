package org.study.HR.Jpa.springData;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.study.HR.Entity.Employee;

@Repository
public interface EmpSpringDataRepository extends JpaRepository<Employee, Integer> {

	 List<Employee>  findByEmpNameOrderByDeptNo(String ename); 
	
	 //ordered by deptNo descending
	 List<Employee>  findByEmpNameOrderByDeptNoDesc(String ename);

	// List<Employee>  findByDeptNoOrderByEmpNameDesc(String ename);

	 // custom query
	// @Query("from employee where emp_BD = :date")
	 //List<Employee>  findEmp(@Param("date") String birthDate);
	 //:date  means use the parameter named date 
	 //employee table name in database
	 //String birthDate in the entity Employee
	 
	 
}
