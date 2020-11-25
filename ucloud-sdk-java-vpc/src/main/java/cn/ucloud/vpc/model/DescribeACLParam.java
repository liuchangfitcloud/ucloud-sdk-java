package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 获取ACL信息 参数类
 * @author: codezhang
 * @date: 2018-09-21 14:15
 **/

public class DescribeACLParam extends BaseRequestParam {

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


    public DescribeACLParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeNetworkAcl");
        this.region = region;
        this.apiVersion = "3";
        this.limit = "9999";
        this.offset = "0";
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
