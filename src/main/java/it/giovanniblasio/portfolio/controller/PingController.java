package it.giovanniblasio.portfolio.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.giovanniblasio.portfolio.model.dto.response.BaseResponseDto;
import it.giovanniblasio.portfolio.model.dto.response.PingResponseDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


@Validated
@RestController
@RequestMapping("/api/v1")
public class PingController {
    
    public PingController() {
    }

    @GetMapping("/ping")
    @ResponseStatus (HttpStatus.OK)
    public ResponseEntity<BaseResponseDto<PingResponseDto>> getPing() {
        PingResponseDto pingResponse = new PingResponseDto("UP", System.currentTimeMillis());

        return ResponseEntity.status(HttpStatus.OK).body(new BaseResponseDto<>(pingResponse, "Pong!"));
    }
}
