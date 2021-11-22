package com.example.wallet.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wallet.domain.Account;
import com.example.wallet.repository.AccountRepository;

/**
 * Description：
 *
 * @author fangliangsheng
 * @date 2019/3/28
 */
@RestController
@RequestMapping("/wallet")
public class WalletRestEndPoint {

    @Autowired
    private AccountRepository accountRepo;

    @GetMapping(path = "/credit")
    public ResponseEntity<String> credit() {
    	Account account = new Account();
    	account.setCredit("10000");
    	accountRepo.save(account);
    	return new ResponseEntity<String>("true",HttpStatus.OK);
    }
}
