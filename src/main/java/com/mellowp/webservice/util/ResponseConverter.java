package com.mellowp.webservice.util;

import com.mellowp.webservice.dto.ResponseObject;

/**
 *
 * @author mellowp
 * @date   2019-09-24
 */
public class ResponseConverter {

    /**
     * T data 를 입력하면 응답할 ResponseObject 객체를 반환 한다.
     *
     * @param data - ResponseObject 에 입력할 data 객체
     * @return ResponseObject<T> - 입력된 data 를 data 로 가지는 ResponseObject
     */
    public static <T> ResponseObject<T> toResponseObject(T data){
        ResponseObject<T> responseObject = new ResponseObject<>();
        responseObject.setBody(data);
        return responseObject;
    }

}
