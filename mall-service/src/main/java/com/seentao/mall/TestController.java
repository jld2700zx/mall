package com.seentao.mall;

import com.seentao.mall.domain.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestMapper mapper;

    @RequestMapping("/mall/test")
    public List<Test> test() {
        return mapper.selectAll();
    }

}
