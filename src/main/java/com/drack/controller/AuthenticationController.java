package com.drack.controller;

import com.drack.dto.AuthenticationRequest;
import com.drack.dto.AuthenticationResponse;
import com.drack.services.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PreAuthorize("permitAll()")
    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody @Valid AuthenticationRequest authenticationRequest) {

        AuthenticationResponse jwtDto = authenticationService.login(authenticationRequest);

        return ResponseEntity.ok(jwtDto);
    }

}
