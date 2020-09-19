package com.jorge.demo.interfacesService;
import java.util.List;
import java.util.Optional;

import com.jorge.demo.modelo.Persona;

public interface IPersonaService {
	public List<Persona>listar();
	public Optional<Persona>listarId(int Id);
	public int save(Persona p);
	public void delete(int id);

}
