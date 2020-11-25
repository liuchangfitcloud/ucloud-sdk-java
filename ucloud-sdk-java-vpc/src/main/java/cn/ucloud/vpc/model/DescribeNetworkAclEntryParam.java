package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取ACL规则 参数类
 * @author: codezhang
 * @date: 2018-09-21 14:15
 **/

public class DescribeNetworkAclEntryParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    @UcloudParam("Offset")
    private String offset;

    @UcloudParam("Limit")
    private String limit;

    @UcloudParam("ApiVersion")
    private String apiVersion;

    @NotEmpty(message = "AclId can not be empty")
    @UcloudParam("AclId")
    private String aclId;


    public DescribeNetworkAclEntryParam(@NotEmpty(message = "region can not be empty") String region,
                                        @NotEmpty(message = "aclId can not be empty") String aclId) {
        super("DescribeNetworkAclEntry");
        this.region = region;
        this.aclId = aclId;
        this.apiVersion = "3";
        this.limit = "9999";
        this.offset = "0";
    }

    public String getAclId() {
        return aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
