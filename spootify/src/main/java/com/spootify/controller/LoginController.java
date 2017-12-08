package com.spootify.controller;
@Controller
public class LoginController {
    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginService loginService;

    @RequestMapping("/")
    public String inicio(Model model, HttpServletRequest request) {
        logger.info("Inicio");
        if(request.getSession().getAttribute("userSession") == null) {
            model.addAttribute("userForm", new Usuario());
            return "user_login";
        } else {
            return "inicio";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("userForm") Usuario user,
                        BindingResult result, Model model, final RedirectAttributes redirectAttributes, HttpServletRequest request) {//(@RequestBody Usuario user) {
        logger.info("Login");
        String redirect;
        try {
            Usuario usuario = loginService.login(user.getNickname(), user.getPassword());


            request.getSession().setAttribute("userSession", usuario);

            /* Equivalente a la linea previa
            HttpSession sesion = request.getSession();
            sesion.setAttribute("userSession", usuario);
            */

            if(usuario != null) {
                redirect = "inicio";
            } else {
                redirect = "user_login";
            }
        } catch(Exception e) {
            logger.error("Error: " + e);
            redirect = "user_login";
        }
        return redirect;
    }

    @RequestMapping("/cerrarSesion")
    public String cerrarSesion(Model model, HttpServletRequest request) {
        logger.info("cerrarSesion");
        model.addAttribute("userForm", new Usuario());
        request.getSession().setAttribute("userSession", null);
        return "user_login";
    }


/*
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    Boolean login(@RequestBody Usuario user) throws Exception {
        System.out.println("guardando: *******login***"+user.getNickname()+"**********" );

        //loginService.login(user.usuario, user.password);
        loginService.login(user.getNickname(), user.getPassword());

        return Boolean.TRUE;
    }*/
}

}
