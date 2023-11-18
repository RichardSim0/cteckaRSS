package com.engeto.cteckaRSS.controller;

import com.engeto.cteckaRSS.filesReader.FilesReader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RSSController {

    FilesReader filesReader = new FilesReader();

    @GetMapping("/scifi")
    public String scifi(){
        return filesReader.readFiles("scifi.txt");
    }

    @GetMapping("/romantic")
        public String romantic(){
        return filesReader.readFiles("romantic.txt");
    }

    @GetMapping("/historic")
    public String historic(){
        return filesReader.readFiles("historic.txt");
    }
}
