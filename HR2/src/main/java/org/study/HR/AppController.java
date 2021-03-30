package org.study.HR;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.study.HR.Entity.Employee;
import org.study.HR.Jpa.springData.EmpSpringDataRepository;

@Controller
public class AppController {

	@Autowired
	EmpSpringDataRepository repository;

	@RequestMapping("/")
	public String home(Model model) {
		Employee emp = new Employee(); 
		model.addAttribute("empData", emp);
		return "index";
	}

	@RequestMapping("/viewemp")
	public ModelAndView viewEmp() {
		ModelAndView model = new ModelAndView("viewemp");

		List<Employee> empsList = repository.findAll();
		model.addObject("empList", empsList);
		return model;
	}

	@RequestMapping("getOneEmp")
	public ModelAndView getOneEmp(@RequestParam int id) {
		ModelAndView model = new ModelAndView("viewoneemp");

		model.addObject("emp", repository.getOne(id));
		return model;
	}

	@RequestMapping("getEmpByName")
	public ModelAndView getEmpByName(@RequestParam String ename) {
		ModelAndView model = new ModelAndView("viewemp");
	
		model.addObject("empList", repository.findByEmpNameOrderByDeptNo(ename));
		return model;
	}
	
	@RequestMapping(value="addUser", method = RequestMethod.POST)
	public ModelAndView addUser( Employee empData) {
		ModelAndView model = new ModelAndView("viewemp");

		repository.save(empData);
		model.addObject("empList",  repository.findAll());
		return model;
	}
	
	@RequestMapping("deleteEmp")
	public ModelAndView deleteEmp(@RequestParam int id ) {
    System.out.println(id);
		//repository.deleteById(id);
		ModelAndView model = new ModelAndView("viewemp");

		List<Employee> empsList = repository.findAll();
		model.addObject("empList", empsList);
		return model;
	}  
//	@RequestMapping("addEmp")
//	public ModelAndView addEmp(@RequestParam Employee emp) {
//		ModelAndView model = new ModelAndView("index");
//		repository.save(emp);
//		return model;
//	}

//	@RequestMapping("deleteEmp")
//	public ModelAndView deleteEmp(@RequestParam int id) {
//		ModelAndView model = new ModelAndView("index");
//		repository.deleteById(id);
//		return model;
//	}

}
