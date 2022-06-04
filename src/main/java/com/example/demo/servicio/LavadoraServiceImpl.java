package com.example.demo.servicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.client.OpenFeignClient;
import com.example.demo.modelo.Lavadora;
import com.example.demo.repository.LavadoraRepository;

@Service
public class LavadoraServiceImpl implements LavadoraServicio {

	@Autowired
	private OpenFeignClient clienteRest;
	
	@Override
	public List<Lavadora> asignarLavadoraPorCliente() {
		List<Lavadora> listar = new ArrayList<>();
		
		Lavadora lavadora = new Lavadora();
		lavadora.setIdLavadora(1);
		lavadora.setDescripcion("Lavadora y secadora");
		lavadora.setMarca("LG");
		lavadora.setVoltaje("18W");
		lavadora.setListarCliente(clienteRest.listarCliente());
		listar.add(lavadora);
		return listar;
	}  
}
