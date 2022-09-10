package model.dao;

import java.util.List;

import model.entities.Departament;

public interface DepartamentDao   {

	void insert(Departament loko);
	void update(Departament loko);
	void deleteById(Integer id);
	Departament findById(Integer id);
	List<Departament> findAll();
}
