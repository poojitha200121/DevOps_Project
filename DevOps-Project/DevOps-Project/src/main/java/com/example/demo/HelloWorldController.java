package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public Message helloWorld() {
        return new Message("Hello World");
    }

    @GetMapping("/hello-v2")
    public Message helloWorldv2() {
        return new Message("Hello World Version 2");
    }

    public static class Message {
        private String content;

        public Message(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
