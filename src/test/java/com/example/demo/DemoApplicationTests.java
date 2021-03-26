package com.example.demo;

import com.example.demo.comment.Discuss;
import com.example.demo.repository.DiscussRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private DiscussRepository repository;
    @Test
    public void     selectCommentByKeys() {
        List<Discuss> list =repository.findByAuthorNotNull();
        System.out.println(list);
    }



}
