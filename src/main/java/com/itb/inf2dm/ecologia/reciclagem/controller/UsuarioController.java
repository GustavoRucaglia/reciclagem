package com.itb.inf2dm.ecologia.reciclagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.ecologia.reciclagem.model.Reciclador;
import com.itb.inf2dm.ecologia.reciclagem.repository.UsuarioRepository;

@Controller
@RequestMapping("/reciclagem")
public class UsuarioController {
		
		@Autowired
		UsuarioRepository usuarioRepository;
		
		//páginas html
		@GetMapping("/cadastro")
		  public String carrinho(Reciclador reciclador,Model model) {
			
			model.addAttribute("reciclador",reciclador);
			return "cadastro";
		}
		
		@PostMapping("/add-reciclador")
		String addNovoReciglador(Reciclador reciclador, Model model) {
			
			reciclador.setCodStatusReciclador(true);
			usuarioRepository.save(reciclador);
			
			return "redirect:/reciclagem/cadastro";
		
		}	
	    

}
