package com.springcloud.order;

import com.springcloud.order.feign.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class orderController {


    /*@Autowired
    RestTemplate restTemplate;*/
    @Autowired
    StockService stockService;
    @Value("${server.port}")
    String port;

    @RequestMapping("/add")
    public String add() {
        System.out.println("添加");

        String msg = stockService.vim();

      /* String msg = restTemplate.getForObject("http://stock-service/stock/vim",String.class);*/

        return port + "添加"+msg;
    }
}
