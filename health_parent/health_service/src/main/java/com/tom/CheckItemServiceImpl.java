package com.tom;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.StringUtil;
import com.tom.entity.PageResult;
import com.tom.pojo.CheckItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassName CheckItemServiceImpl
 * @Description
 * @Author miaomiaole
 * @Date 2019/8/5 11:06
 * Version 1.0
 **/
@Service(interfaceClass = CheckItemService.class)
@Transactional
public class CheckItemServiceImpl implements CheckItemService {
    @Autowired
    private CheckItemDao checkItemDao;

    @Override
    public void add(CheckItem checkItem) {
        checkItemDao.add(checkItem);
    }

    @Override
    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage, pageSize);
        Page<CheckItem> page = checkItemDao.selectByCondition(queryString);
        return new PageResult(page.getTotal(), page.getResult());

    }

    @Override
    public void delete(Integer id) {

        long count = checkItemDao.findCountByCheckItemId(id);
        if(count > 0){
            //当前检查项被引用，不能删除
            throw new RuntimeException("当前检查项被检查组引用，不能删除");
        }
        checkItemDao.deleteById(id);

    }

    @Override
    public CheckItem findById(Integer id) {
        CheckItem checkItem = checkItemDao.findCheckItemById(id);
        return checkItem;

    }

    @Override
    public void edit(CheckItem checkItem) {
        checkItemDao.edit(checkItem);
    }

}
