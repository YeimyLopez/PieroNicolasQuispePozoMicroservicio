package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.demo.modelo.Lavadora;

import com.example.demo.servicio.LavadoraServicio;

@Controller
@RequestMapping("/lavadora/v1")
public class LavadoraController {
	@Autowired
	private LavadoraServicio service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Lavadora> listar(){
		return service.asignarLavadoraPorCliente();
	}

}
