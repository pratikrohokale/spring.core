package com.jpmc.service;

import com.jpmc.bo.StudentBO;
import com.jpmc.dao.StudentDAO;
import com.jpmc.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

	private StudentDAO dao;

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	public String generateResult(StudentDTO dto) throws Exception {

		int total = 0;
		float avg = 0.0f;
		String result = null;
		StudentBO bo = null;
		int count = 0;
		total = dto.getM1() + dto.getM2() + dto.getM3();
		avg = total / 3f;
		if (avg >= 40)
			result = "Pass";
		else
			result = "fail";
		// prepare BO
		bo = new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		// use dao
		count = dao.insert(bo);
		if (count > 0)
			return "Student Registration is Success...";
		else
			return "Student Registration not Succeed..";
	}

}
