package com.fastcampus.spring.dmaker.controller;


/* 사용자 입력을 최초로 받아들이는 곳 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;



@Slf4j  // 로그를 손쉽게 쓰게
@RestController
public class DMakerController {

    @GetMapping("/developers")
    public List<String> getAllDeveloeprs(){
        log.info("// GET /developers HTTP/1.1");

        return Arrays.asList("snow", "Elsa", "0laf");
    }

}
// bean, restcontroller, component 차이
// h2 - 메모리 DB 용으로 주로 사용. (파일에다가도 쓸 수는 잇음) 
// h2를 임베디드로, 똑같이 8080으로 같이 실행되니 별도로 실행하지 X
// 어플리케이션 올라갈 때 같이 생성됐다가, 내려가면 싸그리 삭제 (그러니까 간단한 용도, 테스트 용이다)