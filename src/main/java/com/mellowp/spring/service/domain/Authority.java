package com.mellowp.spring.service.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Authority extends BaseTimeEntity {

    // TODO : 실제 DB 테이블과 매칭될 클래스
    // TODO : - DB 데이터 작업의 경우 쿼리를 작성하여 실행하기 보다는, 해당 Entity 클래스의 수정을 통해서 작업

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 500, nullable = false)
    private String name;

    private String code;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @Builder
    public Authority(String name, String code, String description) {
        this.name = name;
        this.code = code;
        this.description = description;
    }

}
