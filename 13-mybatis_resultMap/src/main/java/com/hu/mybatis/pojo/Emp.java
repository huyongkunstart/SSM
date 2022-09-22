package com.hu.mybatis.pojo;

import lombok.*;

/**
 * @author huyongkun
 * @ClassName Emp
 * @create 2022-09-05 21:09
 * @Version 1.0
 * @description: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Emp {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;
    private Dept dept;
}
