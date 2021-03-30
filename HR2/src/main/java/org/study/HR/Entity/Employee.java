package org.study.HR.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "employee_jpa")
@NamedQuery(name = "find_all_employees", query = "select e from Employee e")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="emp_id")
	private int empNo;
	
	
	@Column(name="emp_name")
	private String empName;
	@Column(name="emp_lastname")
	private String empLastName;
	@Email
	@Column(name="emp_email")
	private String email;
	@Column(name="emp_adress")
	private String address;
	@Column(name="emp_salary")
	private double salary;
	@Column(name="emp_HiringDate")
	private String hiringDate;
	@Column(name="emp_BirthDate")
	private String birthDate;
	@Column(name="emp_DeptNo")
	private int deptNo;
	
	
	
	public Employee() {
	}

	public Employee(String empName, String empLastName, @Email String email, String address, double salary,
			String hiringDate, String birthDate, int deptNo) {
		super();
		this.empName = empName;
		this.empLastName = empLastName;
		this.email = email;
		this.address = address;
		this.salary = salary;
		this.hiringDate = hiringDate;
		this.birthDate = birthDate;
		this.deptNo = deptNo;
	}

	public Employee(int empNo, String empName, String empLastName, @Email String email, String address, double salary,
			String hiringDate, String birthDate, int deptNo) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empLastName = empLastName;
		this.email = email;
		this.address = address;
		this.salary = salary;
		this.hiringDate = hiringDate;
		this.birthDate = birthDate;
		this.deptNo = deptNo;
	}



	public int getEmpNo() {
		return empNo;
	}



	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getEmpLastName() {
		return empLastName;
	}



	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getHiringDate() {
		return hiringDate;
	}



	public void setHiringDate(String hiringDate) {
		this.hiringDate = hiringDate;
	}



	public String getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}



	public int getDeptNo() {
		return deptNo;
	}



	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}



	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empLastName=" + empLastName + ", email=" + email
				+ ", address=" + address + ", salary=" + salary + ", hiringDate=" + hiringDate + ", birthDate="
				+ birthDate + ", deptNo=" + deptNo + "]";
	}




}
