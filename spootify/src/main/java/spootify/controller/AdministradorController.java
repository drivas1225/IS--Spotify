package spootify.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Administrador;
import spootify.service.AdministradorService;

@Controller
@RequestMapping("/administrador")

public class AdministradorController {
	@Autowired
	AdministradorService admiService;

}
