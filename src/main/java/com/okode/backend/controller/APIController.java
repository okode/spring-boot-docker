package com.okode.backend.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class APIController {

    @GetMapping("/memory")
    void memory() throws Exception {
        final var size = 1024 * 1024 * 100;
        var src = new byte[size];
        var dst = new byte[size];
        for(int i=0; i < size; ++i) {
            src[i] = (byte) (i % 255);
        }
        System.arraycopy(src, 0, dst, 0, size);
        for(int i=0; i < size; ++i) {
            if (src[i] != dst[i]) throw new Exception("Error while comparing memory");
        }
    }

    @GetMapping("/cpu")
    void cpu() {

    }

}
