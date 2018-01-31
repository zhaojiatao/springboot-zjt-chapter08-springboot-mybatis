package com.zjt.mapper;

import com.zjt.entity.TClass;
import com.zjt.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface TClassMapper extends MyMapper<TClass> {
    public List<TClass> queryTClassList(Map<String,Object> map);
}