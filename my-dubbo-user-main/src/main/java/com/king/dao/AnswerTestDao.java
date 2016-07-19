package com.king.dao;

import com.king.dao.dto.AnswerTest;

import java.util.List;
import java.util.Map;

/**
 * Created by xiangfei on 16/7/19.
 */
public interface AnswerTestDao{

    public boolean insert(Map map);

    public boolean update(AnswerTest answer);

    public AnswerTest findById(Long id);

    public List<AnswerTest> list(Map map);

    public boolean delete(Long id);

}
