package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 视频信息
 *
 * @author 
 * @email
 */
@TableName("shipinbofangqi")
public class ShipinbofangqiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShipinbofangqiEntity() {

	}

	public ShipinbofangqiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 视频标题
     */
    @TableField(value = "shipinbofangqi_name")

    private String shipinbofangqiName;


    /**
     * 视频类型
     */
    @TableField(value = "shipinbofangqi_types")

    private Integer shipinbofangqiTypes;


    /**
     * 视频封面
     */
    @TableField(value = "shipinbofangqi_photo")

    private String shipinbofangqiPhoto;


    /**
     * 视频
     */
    @TableField(value = "shipinbofangqi_video")

    private String shipinbofangqiVideo;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 视频详情
     */
    @TableField(value = "shipinbofangqi_content")

    private String shipinbofangqiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：视频标题
	 */
    public String getShipinbofangqiName() {
        return shipinbofangqiName;
    }
    /**
	 * 获取：视频标题
	 */

    public void setShipinbofangqiName(String shipinbofangqiName) {
        this.shipinbofangqiName = shipinbofangqiName;
    }
    /**
	 * 设置：视频类型
	 */
    public Integer getShipinbofangqiTypes() {
        return shipinbofangqiTypes;
    }
    /**
	 * 获取：视频类型
	 */

    public void setShipinbofangqiTypes(Integer shipinbofangqiTypes) {
        this.shipinbofangqiTypes = shipinbofangqiTypes;
    }
    /**
	 * 设置：视频封面
	 */
    public String getShipinbofangqiPhoto() {
        return shipinbofangqiPhoto;
    }
    /**
	 * 获取：视频封面
	 */

    public void setShipinbofangqiPhoto(String shipinbofangqiPhoto) {
        this.shipinbofangqiPhoto = shipinbofangqiPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getShipinbofangqiVideo() {
        return shipinbofangqiVideo;
    }
    /**
	 * 获取：视频
	 */

    public void setShipinbofangqiVideo(String shipinbofangqiVideo) {
        this.shipinbofangqiVideo = shipinbofangqiVideo;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：视频详情
	 */
    public String getShipinbofangqiContent() {
        return shipinbofangqiContent;
    }
    /**
	 * 获取：视频详情
	 */

    public void setShipinbofangqiContent(String shipinbofangqiContent) {
        this.shipinbofangqiContent = shipinbofangqiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shipinbofangqi{" +
            "id=" + id +
            ", shipinbofangqiName=" + shipinbofangqiName +
            ", shipinbofangqiTypes=" + shipinbofangqiTypes +
            ", shipinbofangqiPhoto=" + shipinbofangqiPhoto +
            ", shipinbofangqiVideo=" + shipinbofangqiVideo +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", shipinbofangqiContent=" + shipinbofangqiContent +
            ", createTime=" + createTime +
        "}";
    }
}
