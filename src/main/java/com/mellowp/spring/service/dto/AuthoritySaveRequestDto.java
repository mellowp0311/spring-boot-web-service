package com.mellowp.spring.service.dto;


import com.mellowp.spring.service.domain.Authority;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthoritySaveRequestDto {

    private String name;

    private String code;

    private String description;

    public Authority toEntity(){

        // TODO: Entity 클래스와 유사한 형태인 클래스라도, 절대로 테이블과 매핑되는 Entity 클래스를
        // TODO: Request/Response 클래스로 사용해서는 안됨.
        // TODO: Entity 클래스와 Controller 에서 사용할 DTO 는 분리하여 사용
        return Authority.builder().name(name).code(code).description(description).build();
    }

}