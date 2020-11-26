package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取NAT网关信息 参数类
 * @author: codezhang
 * @date: 2018-09-21 14:15
 **/

public class DescribeNATGWParam extends BaseRequestParam {

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


    public DescribeNATGWParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeNATGW");
        this.region = region;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
