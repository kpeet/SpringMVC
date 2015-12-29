package com.kpeet.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/* Este es un controller que va a resolver las solicitudes .html*/
@Controller	
public class HolaController {
	
	@RequestMapping("irHola")
	public ModelAndView redireccion(){
		ModelAndView MV = new ModelAndView();
		
		MV.setViewName("hola");
		
		return MV;
		
	}

}
