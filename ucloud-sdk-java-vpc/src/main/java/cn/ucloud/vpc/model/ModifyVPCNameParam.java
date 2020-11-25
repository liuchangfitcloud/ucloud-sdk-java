package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 修改vpc名称
 * @author: codezhang
 * @date: 2018-09-21 14:56
 **/

public class ModifyVPCNameParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;


    /**
     * require 源VPC短ID
     */
    @NotEmpty(message = "vpcId can not be empty")
    @UcloudParam("ResourceId")
    private String resourceId;

    @UcloudParam("KeyId")
    private String keyId;

    @UcloudParam("Value")
    private String value;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ModifyVPCNameParam(@NotEmpty(message = "region can not be empty") String region,
                              @NotEmpty(message = "vpcId can not be empty") String vpcId,
                              @NotEmpty(message = "vpcName can not be empty") String vpcName) {
        super("SetResourceExtendInfo");
        this.region = region;
        this.resourceId = vpcId;
        this.keyId = "name";
        this.value = vpcName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
