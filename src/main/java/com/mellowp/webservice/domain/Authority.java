package com.mellowp.webservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Entity
@NoArgsConstructor
public class Authority extends BaseTimeEntity {

    // TODO : 실제 DB 테이블과 매칭될 클래스
    // TODO : - DB 데이터 작업의 경우 쿼리를 작성하여 실행하기 보다는, 해당 Entity 클래스의 수정을 통해서 작업

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "유니크 키 값")
    private Long id;

    @Column(length = 500, nullable = false)
    @ApiModelProperty(value = "권한명")
    private String name;

    @ApiModelProperty(value = "권한코드")
    private String code;

    @Column(columnDefinition = "TEXT", nullable = false)
    @ApiModelProperty(value = "권한설명")
    private String description;

    @Builder
    public Authority(String name, String code, String description) {
        this.name = name;
        this.code = code;
        this.description = description;
    }

}
