package com.tom;

import com.tom.entity.PageResult;
import com.tom.pojo.CheckItem;

/**
 * @ClassName CheckItemService
 * @Description
 * @Author miaomiaole
 * @Date 2019/8/5 11:05
 * Version 1.0
 **/
public interface CheckItemService {
    void add(CheckItem checkItem);

    PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);

    void delete(Integer id);

    CheckItem findById(Integer id);

    void edit(CheckItem checkItem);
}
