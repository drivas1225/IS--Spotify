
package com.spootify.controller;
import com.spootify.domain.Cancion;
@Controller
public class CancionController {
    private final Logger logger = LoggerFactory.getLogger(CancionController.class);

    @Autowired
    private CancionService cancionService;

    @RequestMapping("/canciones")
    public String getListaCanciones(Model model, HttpServletRequest request) {
        logger.info("getListaCanciones");
        Usuario usuario = (Usuario) request.getSession().getAttribute("userSession");
        logger.debug("ID DE USUARIO " + usuario.getId());
        List<Cancion> canciones = cancionService.listarCancionesPorUsuario(usuario.getId());
        model.addAttribute("listaCanciones", canciones);

        return "canciones";
    }
}
