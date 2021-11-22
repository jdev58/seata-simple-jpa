package com.example.profile.agent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description：
 *
 * @author fangliangsheng
 * @date 2019-04-04
 */


@FeignClient(name="wallet-service", url="localhost:1020")  
public interface WalletFeignClient {

    @GetMapping("/wallet/credit")
    void credit();

}
