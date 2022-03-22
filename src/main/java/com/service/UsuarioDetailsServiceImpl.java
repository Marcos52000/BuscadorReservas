package com.service;
import static java.util.Collections.emptyList;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dao.IUsuarioDao;
import com.dto.Usuario;

@Service
public class UsuarioDetailsServiceImpl implements UserDetailsService {
	private IUsuarioDao iUsuarioDao;

	public UsuarioDetailsServiceImpl(IUsuarioDao iUsuarioDao) {
		this.iUsuarioDao = iUsuarioDao;
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuario usuario = iUsuarioDao.findByEmail(email);
		if (usuario == null) {
			throw new UsernameNotFoundException(email);
		}
		return new User(usuario.getEmail(), usuario.getPassword(), emptyList());
	}

}
