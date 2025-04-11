package com.entity.model;

import com.entity.ShipinbofangqiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 视频信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShipinbofangqiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 视频标题
     */
    private String shipinbofangqiName;


    /**
     * 视频类型
     */
    private Integer shipinbofangqiTypes;


    /**
     * 视频封面
     */
    private String shipinbofangqiPhoto;


    /**
     * 视频
     */
    private String shipinbofangqiVideo;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 视频详情
     */
    private String shipinbofangqiContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：视频标题
	 */
    public String getShipinbofangqiName() {
        return shipinbofangqiName;
    }


    /**
	 * 设置：视频标题
	 */
    public void setShipinbofangqiName(String shipinbofangqiName) {
        this.shipinbofangqiName = shipinbofangqiName;
    }
    /**
	 * 获取：视频类型
	 */
    public Integer getShipinbofangqiTypes() {
        return shipinbofangqiTypes;
    }


    /**
	 * 设置：视频类型
	 */
    public void setShipinbofangqiTypes(Integer shipinbofangqiTypes) {
        this.shipinbofangqiTypes = shipinbofangqiTypes;
    }
    /**
	 * 获取：视频封面
	 */
    public String getShipinbofangqiPhoto() {
        return shipinbofangqiPhoto;
    }


    /**
	 * 设置：视频封面
	 */
    public void setShipinbofangqiPhoto(String shipinbofangqiPhoto) {
        this.shipinbofangqiPhoto = shipinbofangqiPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getShipinbofangqiVideo() {
        return shipinbofangqiVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setShipinbofangqiVideo(String shipinbofangqiVideo) {
        this.shipinbofangqiVideo = shipinbofangqiVideo;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：视频详情
	 */
    public String getShipinbofangqiContent() {
        return shipinbofangqiContent;
    }


    /**
	 * 设置：视频详情
	 */
    public void setShipinbofangqiContent(String shipinbofangqiContent) {
        this.shipinbofangqiContent = shipinbofangqiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
