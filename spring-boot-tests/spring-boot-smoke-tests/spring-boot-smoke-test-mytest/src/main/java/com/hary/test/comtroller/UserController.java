package com.hary.test.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ankoye@qq.com
 * @date 2021/03/16
 */
@RestController
public class UserController {

	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
