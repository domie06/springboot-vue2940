package com.entity.view;

import com.entity.ShipinbofangqiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 视频信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shipinbofangqi")
public class ShipinbofangqiView extends ShipinbofangqiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 视频类型的值
		*/
		private String shipinbofangqiValue;



	public ShipinbofangqiView() {

	}

	public ShipinbofangqiView(ShipinbofangqiEntity shipinbofangqiEntity) {
		try {
			BeanUtils.copyProperties(this, shipinbofangqiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 视频类型的值
			*/
			public String getShipinbofangqiValue() {
				return shipinbofangqiValue;
			}
			/**
			* 设置： 视频类型的值
			*/
			public void setShipinbofangqiValue(String shipinbofangqiValue) {
				this.shipinbofangqiValue = shipinbofangqiValue;
			}










}
