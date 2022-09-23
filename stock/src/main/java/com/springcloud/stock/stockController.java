package com.springcloud.stock;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class stockController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/vim")
    public String vim(){

        return "查看成功"+port;
    }

}
