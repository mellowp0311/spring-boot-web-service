package com.mellowp.spring.service.web;

import com.mellowp.spring.service.domain.AuthorityRepository;
import com.mellowp.spring.service.dto.AuthoritySaveRequestDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

/**
 *
 * @author mellowp
 * @date   2019-09-24
 */
@RestController
@AllArgsConstructor
public class AuthorityController {

    private final AuthorityRepository authorityRepository;


    @PostMapping("/v1/auth/save")
    public void saveAuthority(@RequestBody AuthoritySaveRequestDto authoritySaveRequestDto){
        authorityRepository.save(authoritySaveRequestDto.toEntity());
    }


}
