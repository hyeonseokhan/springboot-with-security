package com.toycode.study.security.application.port.in;

import com.toycode.study.security.application.port.dto.LoginRequest;
import com.toycode.study.security.application.port.dto.TokenInfo;

public interface LoginUseCase {

    /**
     * 사용자 로그인
     * @param request 사용자 로그인 정보
     * @return 발급된 토큰
     */
    TokenInfo login(LoginRequest request);
}