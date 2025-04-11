package com.entity.view;

import com.entity.ShipinbofangqiCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 视频收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shipinbofangqi_collection")
public class ShipinbofangqiCollectionView extends ShipinbofangqiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String shipinbofangqiCollectionValue;



		//级联表 shipinbofangqi
			/**
			* 视频标题
			*/
			private String shipinbofangqiName;
			/**
			* 视频类型
			*/
			private Integer shipinbofangqiTypes;
				/**
				* 视频类型的值
				*/
				private String shipinbofangqiValue;
			/**
			* 视频封面
			*/
			private String shipinbofangqiPhoto;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;

	public ShipinbofangqiCollectionView() {

	}

	public ShipinbofangqiCollectionView(ShipinbofangqiCollectionEntity shipinbofangqiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, shipinbofangqiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getShipinbofangqiCollectionValue() {
				return shipinbofangqiCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setShipinbofangqiCollectionValue(String shipinbofangqiCollectionValue) {
				this.shipinbofangqiCollectionValue = shipinbofangqiCollectionValue;
			}













				//级联表的get和set shipinbofangqi

					/**
					* 获取： 视频标题
					*/
					public String getShipinbofangqiName() {
						return shipinbofangqiName;
					}
					/**
					* 设置： 视频标题
					*/
					public void setShipinbofangqiName(String shipinbofangqiName) {
						this.shipinbofangqiName = shipinbofangqiName;
					}

					/**
					* 获取： 视频类型
					*/
					public Integer getShipinbofangqiTypes() {
						return shipinbofangqiTypes;
					}
					/**
					* 设置： 视频类型
					*/
					public void setShipinbofangqiTypes(Integer shipinbofangqiTypes) {
						this.shipinbofangqiTypes = shipinbofangqiTypes;
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

					/**
					* 获取： 视频封面
					*/
					public String getShipinbofangqiPhoto() {
						return shipinbofangqiPhoto;
					}
					/**
					* 设置： 视频封面
					*/
					public void setShipinbofangqiPhoto(String shipinbofangqiPhoto) {
						this.shipinbofangqiPhoto = shipinbofangqiPhoto;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}



}
