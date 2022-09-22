package com.hu.pojo;

import lombok.*;

/**
 * @author huyongkun
 * @ClassName User
 * @create 2022-09-15 19:57
 * @Version 1.0
 * @description: TODO
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String gender;
}
