package com.pfe.GestionBank.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.pfe.GestionBank.entity.User;


public class UserDetailsImpl implements UserDetails {
	private static final long serialVersionUID = 1L;
    // email is user's username
    private int id;
    private String email;
    private String password;
    private String role ; 

    public UserDetailsImpl(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.role = user.getRole() ; 
    }

    @Override
    public String getPassword() {
        return password;
    }
   
    public String getRole() {
    	return role ; 
    }

    @Override
    public String getUsername() {
        return email;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}
