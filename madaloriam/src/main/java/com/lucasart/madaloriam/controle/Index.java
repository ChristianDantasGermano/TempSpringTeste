package com.lucasart.madaloriam.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lucasart.madaloriam.modelo.LadoForca;
import com.lucasart.madaloriam.modelo.LadoForcaRepository;

@Controller
public class Index {
	
	@Autowired
	private LadoForcaRepository lfr;
	
	@RequestMapping("/")
	public ModelAndView home() {
		Iterable<LadoForca> elementos = lfr.findAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("elementos",elementos);
		return mv;
	}
}
