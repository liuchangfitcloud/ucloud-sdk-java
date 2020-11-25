package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 更新ACL名称，描述
 * @author: codezhang
 * @date: 2018-09-21 17:06
 **/

public class UpdateACLParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require  子网ID
     */
    @NotEmpty(message = "aclId can not be empty")
    @UcloudParam("AclId")
    private String aclId;

    /**
     * optional acl名称
     */
    @UcloudParam("AclName")
    private String aclName;

    /**
     * optional 描述
     */
    @UcloudParam("Description")
    private String description;

    public UpdateACLParam(@NotEmpty(message = "region can not be empty") String region,
                          @NotEmpty(message = "aclId can not be empty") String aclId) {
        super("UpdateNetworkAcl");
        this.region = region;
        this.aclId = aclId;
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

    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
