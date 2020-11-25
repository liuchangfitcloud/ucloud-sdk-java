package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 解绑ACL子网参数类
 * @author: codezhang
 * @date: 2018-09-21 11:24
 **/

public class DeleteNetworkAclAssociationParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    @NotEmpty(message = "AclId can not be empty")
    @UcloudParam("AclId")
    private String aclId;

    @NotEmpty(message = "SubnetworkId can not be empty")
    @UcloudParam("SubnetworkId")
    private String subnetworkId;

    @UcloudParam("ApiVersion")
    private String apiVersion;


    public DeleteNetworkAclAssociationParam(@NotEmpty(message = "region can not be empty") String region,
                                            @NotEmpty(message = "AclId can not be empty") String aclId,
                                            @NotEmpty(message = "SubnetworkId can not be empty") String subnetworkId) {
        super("DeleteNetworkAclAssociation");
        this.region = region;
        this.aclId = aclId;
        this.subnetworkId = subnetworkId;
        this.apiVersion = "3";
    }

    public String getAclId() {
        return aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }

    public String getSubnetworkId() {
        return subnetworkId;
    }

    public void setSubnetworkId(String subnetworkId) {
        this.subnetworkId = subnetworkId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
}
