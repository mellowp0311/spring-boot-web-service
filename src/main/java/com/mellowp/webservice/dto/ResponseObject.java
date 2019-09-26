package com.mellowp.webservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

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

    private Integer code;

    private String message;

    private Boolean isOk;

    private T body;

}
