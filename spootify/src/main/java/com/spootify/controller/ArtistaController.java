package com.spootify.controller;

import com.example.controller.ArtistaController;

@Controller
public class ArtistaController {
	private final Logger logger = LoggerFactory.getLogger(ArtistaController.class);
	
	@RequestMapping("/artistas")
	public String getListaArtista(Model model) {
		 logger.info("getListaArtistas");
	        

	        return "artistas";
	}
}
