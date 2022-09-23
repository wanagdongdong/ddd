package com.springcloud.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-service", path = "/stock")
public interface StockService {
    @RequestMapping("/vim")
    String vim();
}

/*@RequestMapping("/stock")
public class stockController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/vim")
    public String vim(){

        return "查看成功"+port;
    }*/
