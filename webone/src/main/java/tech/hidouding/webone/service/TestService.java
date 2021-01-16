package tech.hidouding.webone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.hidouding.webone.dao.TestMapper;
import tech.hidouding.webone.entity.Test;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {


    @Autowired
    private TestMapper testMapper;

    public String getTests(){

        List<Test> lt= testMapper.getAllTests();
        //Test t= testMapper.getOneTest();
        String r="";
        r=lt.toString();

        return r;
    }
}
