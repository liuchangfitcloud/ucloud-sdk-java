package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除ACL 参数类
 * @author: codezhang
 * @date: 2018-09-21 14:04
 **/

public class DeleteACLParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require VPC资源Id
     */
    @UcloudParam("AclId")
    @NotEmpty(message = "aclId can not be empty")
    private String aclId;

    @UcloudParam("ApiVersion")
    private String apiVersion;

    public DeleteACLParam(@NotEmpty(message = "region can not be empty") String region,
                          @NotEmpty(message = "aAclId can not be empty") String aclId) {
        super("DeleteNetworkAcl");
        this.region = region;
        this.aclId = aclId;
        this.apiVersion = "3";
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAclId() {
        return aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
}
