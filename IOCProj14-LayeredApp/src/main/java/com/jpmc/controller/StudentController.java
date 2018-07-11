package com.jpmc.controller;

import com.jpmc.dto.StudentDTO;
import com.jpmc.service.StudentService;
import com.jpmc.vo.StudentVO;

public class StudentController {
	private StudentService service;

	public void setService(StudentService service) {
		this.service = service;
	}

	public String registerStudent(String sno, String sname, String m1, String m2, String m3) throws Exception {

		StudentVO vo = null;
		StudentDTO dto = null;
		// prepare VO object
		vo = new StudentVO();
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		// prepare DTO;
		dto = new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		// use service
		return service.generateResult(dto);
	}
}
