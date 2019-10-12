package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.model.SampleModel;

@RestController
@RequestMapping("/webapi/sample")
public class SampleController {
    @PostMapping
    public ResponseEntity<SampleModel> index() {
        // lombokのbuilderを用いて初期値を設定したインスタンスの生成
        SampleModel sample = SampleModel.builder().code("123").value("sample").build();
        return new ResponseEntity<>(sample, HttpStatus.OK);
    }
}
