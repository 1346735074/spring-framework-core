package com.purge.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author purgeyao
 * @since 1.0
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    /**
     * 公司人数
     */
    private String name;

    /**
     * 员工人数
     */
    private Integer employeesNum;
}
