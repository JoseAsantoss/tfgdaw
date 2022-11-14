package edix.tfg.consumoCombustiblebk.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edix.tfg.consumoCombustiblebk.dao.IMarcaCocheDao;
import edix.tfg.consumoCombustiblebk.models.entity.MarcaCoche;
import edix.tfg.consumoCombustiblebk.services.IMarcaCocheService;

/**
 * Clase que implementea los metodos de la interfaz IVersionCocheService
 * @author Luis Cifuentes
 * @author Jose A. Santos
 * @version 1.0
 * @since 13/11/2022
 *
 */
@Service
public class MarcaCocheServiceImpl implements IMarcaCocheService {

	@Autowired
	IMarcaCocheDao iMarcaCocheDao;
	
	@Override
	public MarcaCoche showByMarcaId(Long marcaId) {
		return iMarcaCocheDao.findById(marcaId).orElse(null);
	}

	@Override
	public List<MarcaCoche> listAllMarcas() {
		return iMarcaCocheDao.findAll();
	}


}