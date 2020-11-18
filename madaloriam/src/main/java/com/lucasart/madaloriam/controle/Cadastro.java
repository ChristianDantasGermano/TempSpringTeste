package com.lucasart.madaloriam.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lucasart.madaloriam.modelo.LadoForca;
import com.lucasart.madaloriam.modelo.LadoForcaRepository;

@Controller
public class Cadastro {
	
	@Autowired
	private LadoForcaRepository lfr;
	
	@RequestMapping(value="/cadastrar",method = RequestMethod.POST)
	public String cadastrar(LadoForca lf) {
		lfr.save(lf);
		return "redirect:/";
	}
	
	@RequestMapping(value="/deletar/{id}",method = RequestMethod.GET)
	public String remover(@PathVariable long id) {
		LadoForca lf = lfr.findById(id);
		lfr.delete(lf);
		return "redirect:/";
	}
}
