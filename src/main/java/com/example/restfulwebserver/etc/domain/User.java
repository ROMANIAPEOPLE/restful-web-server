package com.example.restfulwebserver.etc.domain;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@JsonFilter("UserInfo")
public class User {
    private Integer id;
    @Size(min=2, message = "2글자 이상 입력해주세요.")
    private String name;
    @Past
    private Date joinDate;

    private String password;
    private String ssn;
}
