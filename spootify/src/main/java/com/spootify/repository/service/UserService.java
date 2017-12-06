package spootify.service;
@Component
public class UserService {

	@Autowired
	UserRepository userRepository;


	public Boolean configuracion(Usuario usuario) throws Exception {
		
		String nickname=usuario.getNickname();
		String password=usuario.getPassword();
		System.out.println("mbbbbbbbbbbbbbbbbbbbbb");
		String email=usuario.getemail();
		Long id=userRepository.findByNickname(nickname).getid();
		System.out.println(Long.toString(id));

		System.out.println(nickname);

		
			if(usuario!=null){
				System.out.println(nickname+"mnknn");

				UserRepository.configuracion(nickname,password ,email,id);
			return true;
				
		} else {
			throw new Exception("No esta registrado");}
	}
	
		

	
	public Boolean registro(Usuario usuario) throws Exception {
		
		if (usuario != null ){
			
			userRepository.save(usuario);
			return true;
			
		} else {
			throw new Exception("Error");
		}
		
	}
	
	};
	
	
	


/*
<<<<<<< HEAD
	@Autowired
	UserRepository userRepository;


	public Boolean login(String usuario, String password) throws Exception {
		System.out.println("guardando: " );
		
		
		if ((usuario != "" )&& (password !="") ){
			
			Usuario user= userRepository.validarLogin(usuario,password);
			if(user!=null){
			return true;
				}else { return false;}
			
		} else {
			throw new Exception("No esta registrado");
		}
	}
	
	public Boolean registro(Usuario usuario) throws Exception {
		
		if (usuario != null ){
			
			userRepository.save(usuario);
			return true;
			
		} else {
			throw new Exception("Error");
		}
		
	}
	
	};
	
	
	
=======
>>>>>>> ebcdafdc285a91ba6766435d0a1c241a9d06e35c

*/