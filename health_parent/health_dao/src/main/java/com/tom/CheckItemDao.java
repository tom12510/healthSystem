package com.tom;

import com.github.pagehelper.Page;
import com.tom.pojo.CheckItem;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckItemDao {
    Page<CheckItem> selectByCondition(String queryString);

    void add(CheckItem checkItem);

    long findCountByCheckItemId(Integer id);

    void deleteById(Integer id);

    CheckItem findCheckItemById(Integer id);

    void edit(CheckItem checkItem);
}
