package com.dao;

import com.entity.ShipinbofangqiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinbofangqiCollectionView;

/**
 * 视频收藏 Dao 接口
 *
 * @author 
 */
public interface ShipinbofangqiCollectionDao extends BaseMapper<ShipinbofangqiCollectionEntity> {

   List<ShipinbofangqiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
