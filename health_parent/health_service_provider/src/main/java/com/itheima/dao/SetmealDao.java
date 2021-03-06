package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.Setmeal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SetmealDao {
    void add(Setmeal setmeal);

    void setSetmealAndCheckGroup(HashMap<String, Integer> map);

    Page<Setmeal> selectByCondition(String queryString);

    Setmeal findById(Integer id);

    List<Integer> findCheckGroupIdsBySetMealId(Integer id);

    void deleteAssoication(Integer id);

    void edit(Setmeal setmeal);

    void deleteById(Integer id);

    Setmeal findSetMealAndItemById(int id);

    List<Setmeal> getAllSetmeal();

    List<Map<String,Object>> findSetmealCount();
}
