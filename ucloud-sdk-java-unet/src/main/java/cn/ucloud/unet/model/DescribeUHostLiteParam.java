package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 获取可以绑定的主机列表 参数对象
 * @author: codezhang
 * @date: 2018-09-25 14:16
 **/

public class DescribeUHostLiteParam extends BaseRequestParam {

    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 数据分页值, 默认为20
     */
    @UcloudParam("Limit")
    private Integer limit;

    public DescribeUHostLiteParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeUHostLite");
        this.region = region;
        this.limit = 10000000;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
