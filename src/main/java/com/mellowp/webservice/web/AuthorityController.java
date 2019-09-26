package com.mellowp.webservice.web;

import com.mellowp.webservice.domain.Authority;
import com.mellowp.webservice.domain.AuthorityRepository;
import com.mellowp.webservice.dto.AuthoritySaveRequestDto;
import com.mellowp.webservice.dto.ResponseObject;
import com.mellowp.webservice.util.ResponseConverter;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthorityController {

    private final AuthorityRepository authorityRepository;

    @GetMapping("/v1/auth/list")
    public ResponseObject<List<Authority>> readAuthorityList(){
        return ResponseConverter.toResponseObject(authorityRepository.findAll());
    }


    @GetMapping("/v1/auth/info/{id}")
    public ResponseObject<Authority> readAuthority(@PathVariable Long id){
        return ResponseConverter.toResponseObject(authorityRepository.findById(id).orElseGet(Authority::new));
    }


    @PostMapping("/v1/auth/save")
    public void saveAuthority(@RequestBody AuthoritySaveRequestDto authoritySaveRequestDto){
        authorityRepository.save(authoritySaveRequestDto.toEntity());
    }


}
