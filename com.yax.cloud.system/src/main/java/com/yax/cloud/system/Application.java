/**
 * Copyright © 2019 国网信通亿力科技有限责任公司. All rights reserved.
 *
 * @Title: Application.java
 * @Prject: com.ylkj.cloud.example
 * @Package: com.ylkj.cloud
 * @author: Jianbin
 * @date: 2019年7月31日 下午2:27:58
 * @version: V1.0
 */
package com.yax.cloud.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 *
 * @ClassName: Application
 * @Description: 启动入口
 * @author: Jianbin
 * @date: 2019年7月31日 下午2:27:58
 */
@SpringBootApplication
@MapperScan(basePackages = { "com.yax.cloud.**.mapper" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}
