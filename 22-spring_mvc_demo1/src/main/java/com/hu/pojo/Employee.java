package com.hu.pojo;

import lombok.*;
import org.springframework.stereotype.Repository;

/**
 * Date:2022/7/8
 * Author:ybc
 * Description:
 */
@Repository
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private Integer id;
    private String lastName;

    private String email;
    //1 male, 0 female
    private Integer gender;

}
