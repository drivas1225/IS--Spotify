package com.spootify.repository.service;

import java.util.Collection;

@Component
public class CancionService {

	private final Logger logger = LoggerFactory.getLogger(CancionService.class);
	
	@Autowired
	CancionRepository cancionRepository;
	
	@Autowired
	PlayListRepository playListRepository;
	
	public Boolean crearCancion( Cancion cancion) throws Exception {
		System.out.println("cancion: " );
		
		cancionRepository.save(cancion);
		return true;
		
	}

	public Boolean deletedPlayList( Cancion cancion) throws Exception {
		System.out.println("playlist: " );
	
		//cancionRepository.delete(cancion.getId());
		return true;
		
	}
	public List<Cancion> listarCancionesPorUsuario(long usuario)
	{
		Usuario user = new Usuario();
		user.setId(usuario);
		logger.info("Id de usuaio: " + usuario);
		List<Cancion> canciones = new LinkedList<>();
		//return cancionRepository.findAll();
		List<PlayList> playlists = playListRepository.findAllsongs(user);
	
		
		logger.debug("Cantidad de playlists del usuario: " + playlists.size());
		for(PlayList item : playlists) {
			logger.debug("Playlist " + item.getNombre());
			List<Cancion> cancionesPlaylist = cancionRepository.findAllsongs(item);
			for(Cancion c : cancionesPlaylist) {
				logger.debug("Cancion " + c.getNombre());
			}
			logger.debug("Cantidad de canciones de la playlist : " + item.getId() + ", = " + playlists.size());
			canciones.addAll(cancionesPlaylist);
		}
		return canciones;
		
	}
	
}
