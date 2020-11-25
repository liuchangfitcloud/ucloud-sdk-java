package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 创建ACL 参数类
 * @author: codezhang
 * @date: 2018-09-21 11:24
 **/

public class CreateACLParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require acl名称
     */
    @NotEmpty(message = "aclName can not be empty")
    @UcloudParam("AclName")
    private String aclName;

    @NotEmpty(message = "VpcId can not be empty")
    @UcloudParam("VpcId")
    private String vpcId;

    @UcloudParam("Description")
    private String description;

    @UcloudParam("ApiVersion")
    private String apiVersion;


    public CreateACLParam(@NotEmpty(message = "region can not be empty") String region,
                          @NotEmpty(message = "aclName can not be empty") String aclName) {
        super("CreateNetworkAcl");
        this.region = region;
        this.aclName = aclName;
        this.apiVersion = "3";
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
}
