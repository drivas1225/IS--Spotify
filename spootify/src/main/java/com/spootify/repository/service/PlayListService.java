package com.spootify.repository.service;

import java.util.Collection;
@Component
public class PlayListService {

	@Autowired
	public Boolean crearPlayList( PlayList playlist) throws Exception {
		System.out.println("playlist: " );
		
		playlistRepository.save(playlist);
		return true;
		
	}

	public Boolean deletedPlayList( PlayList playlist) throws Exception {
		System.out.println("playlist: " );
	
		playlistRepository.delete(playlist.getId());
		return true;
		
	}
	public List<PlayList> listarPlayLists(Usuario usuario)
	{
		return playlistRepository.findAllsongs(usuario);
	}
}
