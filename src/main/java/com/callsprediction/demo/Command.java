package com.callsprediction.demo;

import org.springframework.http.ResponseEntity;

public interface Command <I, T>{
    ResponseEntity<T> execute(I input);
}
