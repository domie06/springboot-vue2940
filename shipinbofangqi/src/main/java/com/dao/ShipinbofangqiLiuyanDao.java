package com.dao;

import com.entity.ShipinbofangqiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinbofangqiLiuyanView;

/**
 * 视频留言 Dao 接口
 *
 * @author 
 */
public interface ShipinbofangqiLiuyanDao extends BaseMapper<ShipinbofangqiLiuyanEntity> {

   List<ShipinbofangqiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
