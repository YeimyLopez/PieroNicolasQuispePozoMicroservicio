package com.example.demo.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.client.OpenFeignClient;
import com.example.demo.modelo.Lavadora;
import com.example.demo.modelo.Ropa;
import com.example.demo.repository.RopaRepository;

@Service
public class RopaServiceImpl implements RopaServicio {

	@Autowired
	private OpenFeignClient clienteRest;
	
	@Override
	public List<Ropa> listar() {
		List<Ropa> listar = new ArrayList<>();

		Ropa ropa = new Ropa();
		ropa.setIdRopa(1);
		ropa.setDescripcion("vestido");
		ropa.setTipoRopa("Ropa de bebe");
		ropa.setListarCliente(clienteRest.listarCliente());
		
		listar.add(ropa);
		
		return listar;
	}

}
