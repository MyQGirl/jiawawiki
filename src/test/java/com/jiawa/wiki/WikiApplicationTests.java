package com.jiawa.wiki;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

// package com.jiawa.wiki;
//
// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;
//
// @SpringBootTest
 public  class WikiApplicationTests {


     @Test
     void contextLoads() {
         String test = new String();
         Map<String, JsonNode> map  = new HashMap<>();
        Boolean flag =  ObjectUtils.isEmpty(map);
         System.out.println(flag);


     }

 }
