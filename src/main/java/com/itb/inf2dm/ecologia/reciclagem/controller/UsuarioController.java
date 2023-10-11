package com.itb.inf2dm.ecologia.reciclagem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.ecologia.reciclagem.model.Reciclador;
import com.itb.inf2dm.ecologia.reciclagem.repository.UsuarioRepository;

@Controller
@RequestMapping("/reciclagem")
public class UsuarioController {
		
		@Autowired
		UsuarioRepository usuarioRepository;
		
		//páginas html
		@GetMapping("/cadastroIntra")
		  public String carrinho(Reciclador reciclador,Model model) {
			model.addAttribute("reciclador",reciclador);
			return "intra";
		}
		
		@GetMapping("/adm")
		  public String adm(Reciclador reciclador,Model model) {
			List<Reciclador> listaDeUser = usuarioRepository.findAll();
			model.addAttribute("listaDeUser", listaDeUser);
			return "adm";
		}
		
		@PostMapping("/addUsuario")
		String addNovoReciglador(Reciclador reciclador, Model model) {
		    usuarioRepository.save(reciclador);
		    return "redirect:/reciclagem/adm";
		}
	    
		@PutMapping("/desativar-usuario/{id}")
		public ResponseEntity<String> desativarUsuario(@PathVariable Long id) {
		    usuarioRepository.findById(id).ifPresent(usuario -> {
		        usuario.setStatuscode(false);
		        usuarioRepository.save(usuario);
		    });

		    return ResponseEntity.ok("Usuário desativado com sucesso");
		}
		
		@PutMapping("/ativar-usuario/{id}")
		public ResponseEntity<String> ativarUsuario(@PathVariable Long id) {
		    usuarioRepository.findById(id).ifPresent(usuario -> {
		        usuario.setStatuscode(true);
		        usuarioRepository.save(usuario);
		    });

		    return ResponseEntity.ok("Usuário ativado com sucesso");
		}

}
