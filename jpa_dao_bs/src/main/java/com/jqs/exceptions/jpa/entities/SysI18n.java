package com.jqs.exceptions.jpa.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * 国际化配置表
 *
 * @author WuJinquan 2019年08月16日16:38
 * @version 1.0
 */
@Entity
@Table(name = "sys_i18n")
@org.hibernate.annotations.Table(appliesTo = "sys_i18n", comment = "国际化配置表")
@Data
public class SysI18n {

    /**
     * 主键id,自增长
     */
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, length = 1000, unique = true)
    private String key;
    @Column(nullable = false, length = 1000)
    private String zh_CN;
    @Column(nullable = false, length = 1000)
    private String en_US;
}