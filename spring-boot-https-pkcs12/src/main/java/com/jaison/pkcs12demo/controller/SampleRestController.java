package com.jaison.pkcs12demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleRestController {
  @GetMapping(path = "/ping", produces = "application/json")
  public Response getBook() {
    return new Response("ping Acknowledged");
  }
}

class Response{
  String reply;

  public Response(String reply) {
    this.reply = reply;
  }

  public String getReply() {
    return reply;
  }
}
