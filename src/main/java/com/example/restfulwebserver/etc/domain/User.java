package com.example.restfulwebserver.etc.domain;

import lombok.*;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    @Size(min=2, message = "2글자 이상 입력해주세요.")
    private String name;
    @Past
    private Date joinDate;
}
