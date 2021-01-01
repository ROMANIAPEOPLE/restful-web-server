//package com.example.restfulwebserver.etc.controller;
//
//import com.example.restfulwebserver.etc.domain.User;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//class UserControllerTest {
//
//    @Autowired
//    MockMvc mockMvc;
//
//    @Autowired
//    ObjectMapper objectMapper;
//
//
//    @Test
//    @DisplayName("전체 조회")
//    public void findAll() throws Exception {
//        mockMvc.perform(get("/users"))
//                .andDo(print())
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    @DisplayName("회원 조회")
//    public void findOne() throws Exception {
//
//
//        mockMvc.perform(get("/users/1"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id").value(1))
//                .andExpect(jsonPath("$.name").value("kh1"));
//    }
//
//    @Test
//    @DisplayName("사용자 추가하기")
//    public void createUser() throws Exception {
//
//
//        User user = new User();
//        user.setName("kh6");
//        user.setJoinDate(new Date());
//
//        String json = objectMapper.writeValueAsString(user);
//
//        mockMvc.perform(post("/users")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(json))
//                .andDo(print())
//                .andExpect(jsonPath("name").value("kh6"));
//
//
//
//    }
//
//}