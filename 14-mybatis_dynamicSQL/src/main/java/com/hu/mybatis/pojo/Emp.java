package com.hu.mybatis.pojo;

import lombok.*;

/**
 * @author huyongkun
 * @ClassName Emp
 * @create 2022-09-06 14:30
 * @Version 1.0
 * @description: TODO
 */
@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;
}
