package com.entity.vo;

import com.entity.ShipinbofangqiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 视频信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shipinbofangqi")
public class ShipinbofangqiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
