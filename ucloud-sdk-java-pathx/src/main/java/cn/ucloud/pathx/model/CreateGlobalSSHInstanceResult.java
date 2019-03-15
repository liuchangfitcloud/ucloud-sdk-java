package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 创建GlobalSSH实例 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class CreateGlobalSSHInstanceResult extends BaseResponseResult {
    /**
     * 实例ID，资源唯一标识
     */
    @SerializedName("InstanceId")
    private String instanceId;
    /**
     * 加速域名，访问该域名可就近接入
     */
    @SerializedName("AcceleratingDomain")
    private String acceleratingDomain;


    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getAcceleratingDomain() {
        return this.acceleratingDomain;
    }

    public void setAcceleratingDomain(String acceleratingDomain) {
        this.acceleratingDomain = acceleratingDomain;
    }


}