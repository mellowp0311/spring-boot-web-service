package com.mellowp.webservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 * @author mellowp
 * @date   2019-09-24
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseObject<T> {

    // TODO: API SPEC 을 공통화하여 제공하도록 구현.
    // TODO: 목록/상세 조회 및 기타 가변적인 데이터가 필요할 경우 Body 를 이용해서 진행.

    @ApiModelProperty(value = "결과 코드")
    private Integer code;

    @ApiModelProperty(value = "결과 여부")
    private Boolean isOk;

    @ApiModelProperty(value = "결과 메시지")
    private String message;

    @ApiModelProperty(value = "결과 데이터")
    private T body;

}
