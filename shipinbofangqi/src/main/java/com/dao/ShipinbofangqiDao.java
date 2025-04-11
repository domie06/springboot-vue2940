package com.dao;

import com.entity.ShipinbofangqiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinbofangqiView;

/**
 * 视频信息 Dao 接口
 *
 * @author 
 */
public interface ShipinbofangqiDao extends BaseMapper<ShipinbofangqiEntity> {

   List<ShipinbofangqiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
