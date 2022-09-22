package com.hu.pojo;

import lombok.*;

/**
 * @author huyongkun
 * @ClassName User
 * @create 2022-09-13 9:53
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
}
