package io.lhp.checkinout0516.controller;

import io.lhp.checkinout0516.dto.TextResMsg;
import io.lhp.checkinout0516.dto.WechatMPReqMsg;
import io.lhp.checkinout0516.dto.WechatMPResMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wechatmptest")
public class WechatMPTestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Integer count = 0;

    @GetMapping("/receive")
    public String receive(@RequestParam(required = false) String signature,
                          @RequestParam(required = false) Integer timestamp,
                          @RequestParam(required = false) String nonce,
                          @RequestParam String echostr){
        logger.info("GET Request!!!");
        logger.info("signature: {}", signature);
        logger.info("timestamp: {}", timestamp);
        logger.info("nonce: {}", nonce);
        logger.info("echostr: {}", echostr);
        //todo verify with token
        return echostr;
    }

    @PostMapping(value = "/receive", produces = MediaType.APPLICATION_XML_VALUE)
    public WechatMPResMsg receive(@RequestParam(required = false) String signature,
                                  @RequestParam(required = false) Integer timestamp,
                                  @RequestParam(required = false) String nonce,
                                  @RequestBody(required = false) WechatMPReqMsg reqMsg){
        logger.info("POST Request!!!");
        logger.info("signature: {}", signature);
        logger.info("timestamp: {}", timestamp);
        logger.info("nonce: {}", nonce);
        logger.info("reqMsg: {}", reqMsg);

        //todo verify with token

        count++;
        TextResMsg textResMsg = new TextResMsg("oUwXe58JsPM6MBFsI3YvnbFIpg-8",count.toString());
        return textResMsg;
    }
}
