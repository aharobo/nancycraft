package tech.hidouding.webone.dao;

import org.apache.ibatis.annotations.Mapper;
import tech.hidouding.webone.entity.Test;

import javax.annotation.Resource;
import java.util.List;

@Mapper
public interface TestMapper {
    public List<Test> getAllTests();
    public Test getOneTest();
}
