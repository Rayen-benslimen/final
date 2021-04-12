package com.pfe.GestionBank.security;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {
	private static final long serialVersionUID = 1L;
    private final String jwt;
    private int userid ;
    private String role ;

    public AuthenticationResponse(String jwt , int userid , String role) {
        this.jwt = jwt;
        this.userid = userid;
        this.role = role ; 
    }

    public String getJwt() {
        return jwt;
    }
    public int getUserid() {
    	return userid ; 
    }
    public String getRole() {
    	return role ; 
    }

}
