package com.spootify.controller;

import com.spootify.domain.Usuario;

@Controller
public class UserControler {

	@Autowired
	UserService userService;
	
	
	@RequestMapping(value = "/configuracion_upd", method = RequestMethod.POST)
	@ResponseBody
	Boolean configuracion(@RequesBody Usuario usar throws Exception) {
		System.out.println("guardando: *********************************" );

		userService.configuracion(user);
 		return Boolean.TRUE;
	}
	
}
