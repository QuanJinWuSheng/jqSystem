package com.jqs.exceptions.jpa.repositories;

import com.jqs.exceptions.jpa.entities.SysI18n;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * com.jq.bs.jpa.repositories
 *
 * @author WuJinquan 2019年08月16日16:53
 * @version 1.0
 */
public interface SysI18nRepository extends JpaRepository<SysI18n,String> {

    List<SysI18n> findByKey(String name);
}
