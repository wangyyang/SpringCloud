package com.example.cloud.commons.model;

import lombok.Data;

@Data
public class JsCode2SessionResponse {
    private String session_key;
    private String openid;
    private String unionid;
}
