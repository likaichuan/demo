package com.demo.controller;

import com.demo.entity.Person;
import com.demo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping("/index")
    public String simple1() {
        Person person = new Person();
        person.setpAge(18);
        person.setpIdNum("23010319950804571x");
        person.setpName("李凯");
        personMapper.insertSelective(person);
        return "nihao";
    }
}
