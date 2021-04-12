package com.pfe.GestionBank.controller;

import com.pfe.GestionBank.security.AuthenticationRequest;
import com.pfe.GestionBank.security.AuthenticationResponse;
import com.pfe.GestionBank.security.JwtUtil;
import com.pfe.GestionBank.security.UserDetailsImpl;
import com.pfe.GestionBank.security.UserDetailsServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class JwtAuthenticationController {
	@Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @Autowired
    private UserDetailsServiceImpl userDetailsServiceImpl;
    
    Logger logger = LoggerFactory.getLogger(JwtAuthenticationController.class);

    @PostMapping("/authenticate")
    @ResponseBody
    public ResponseEntity<AuthenticationResponse> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest){

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("wrong password or email");
        }

        final UserDetailsImpl userDetails = userDetailsServiceImpl
                .loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt,userDetails.getId(),userDetails.getRole()));
    }
	
}
