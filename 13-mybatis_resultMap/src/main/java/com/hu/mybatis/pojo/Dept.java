package com.hu.mybatis.pojo;

import lombok.*;

import java.util.List;

/**
 * @author huyongkun
 * @ClassName Dept
 * @create 2022-09-05 21:11
 * @Version 1.0
 * @description: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Dept {
    private Integer deptId;
    private String deptName;
    private List<Emp> emps;
}
