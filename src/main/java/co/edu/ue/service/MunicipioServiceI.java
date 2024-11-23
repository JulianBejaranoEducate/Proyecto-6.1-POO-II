package co.edu.ue.service;

import java.util.List;

import co.edu.ue.client.Municipio;

public interface MunicipioServiceI {
	List<Municipio> listMunicipios();
	List<Municipio> searchDepartamento(String name);
}
