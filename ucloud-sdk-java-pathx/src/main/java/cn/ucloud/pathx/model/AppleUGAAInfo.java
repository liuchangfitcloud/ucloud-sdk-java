package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 苹果审核加速通道信息 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class AppleUGAAInfo {
    /**
     * 全球加速ID
     */
    @SerializedName("UGAId")
    private String uGAId;
    /**
     * 全球加速cname
     */
    @SerializedName("CName")
    private String cName;
    /**
     * 加速源IP列表
     */
    @SerializedName("IPList")
    private List<String> iPList;
    /**
     * 加速实例名称
     */
    @SerializedName("UGAName")
    private String uGAName;
    /**
     * 加速源域名
     */
    @SerializedName("Domain")
    private String domain;
    /**
     * 该UGAA对应的多端口任务配置
     */
    @SerializedName("TaskSet")
    private List<UGAATask> taskSet;
    /**
     * 支付类型
     */
    @SerializedName("ChargeType")
    private String chargeType;
    /**
     * 创建时间
     */
    @SerializedName("CreateTime")
    private String createTime;
    /**
     * 过期时间
     */
    @SerializedName("ExpireTime")
    private String expireTime;


    public String getuGAId() {
        return this.uGAId;
    }

    public void setuGAId(String uGAId) {
        this.uGAId = uGAId;
    }

    public String getcName() {
        return this.cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public List<String> getiPList() {
        return this.iPList;
    }

    public void setiPList(List<String> iPList) {
        this.iPList = iPList;
    }

    public String getuGAName() {
        return this.uGAName;
    }

    public void setuGAName(String uGAName) {
        this.uGAName = uGAName;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }


    public List<UGAATask> getTaskSet() {
        return this.taskSet;
    }

    public void setTaskSet(List<UGAATask> taskSet) {
        this.taskSet = taskSet;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }


}