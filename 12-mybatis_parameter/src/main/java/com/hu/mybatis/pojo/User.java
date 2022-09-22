package com.hu.mybatis.pojo;

import lombok.*;

/**
 * @author huyongkun
 * @ClassName User
 * @create 2022-09-01 21:19
 * @Version 1.0
 * @description: TODO
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private char gender;
    private String email;
}
