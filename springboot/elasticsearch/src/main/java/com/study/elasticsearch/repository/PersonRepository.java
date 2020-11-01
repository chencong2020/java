package com.study.elasticsearch.repository;

import com.study.elasticsearch.model.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author chencong
 * @date 2020/10/29
 */
@Repository
public interface PersonRepository extends ElasticsearchRepository<Person, Long> {
    /**
     * 根据年龄区间查询
     *
     * @param min 最小值
     * @param max 最大值
     * @return 满足条件的用户列表
     */
    List<Person> findByAgeBetween(Integer min, Integer max);

    /**
     * 根据名称查询
     *
     * @param name 名称
     * @return 满足条件的用户列表
     */
    List<Person> findByName(String name);

    List<Person> findByCountry(String country);

    List<Person> findByBirthday(Date birthday);

    List<Person> findByRemark(String remark);
}

