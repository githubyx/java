package com.yax.cloud.system.code.service.impl;

import com.yax.cloud.system.code.mapper.CodeMapper;
import com.yax.cloud.system.code.model.CodeDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class CodeServiceImplTest {

    @Autowired
    CodeMapper codeMapper;

    @Test
    public void test(){
        CodeDO codeDO = codeMapper.selectById("1233");
        System.out.println(codeDO);
    }



}
