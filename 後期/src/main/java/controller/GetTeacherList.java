package controller;

import java.util.List;

import dao.TeachersDAO;
import model.Teacher;

public class GetTeacherList {
	
	public List<Teacher> execute() {
		TeachersDAO dao = new TeachersDAO();
		List<Teacher> techList = dao.findAll();
		return techList;
	}
}
