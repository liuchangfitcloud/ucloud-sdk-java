package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除ACL规则 参数类
 * @author: codezhang
 * @date: 2018-09-21 14:04
 **/

public class DeleteNetworkAclEntryParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require AcLID
     */
    @NotEmpty(message = "aclId can not be empty")
    @UcloudParam("AclId")
    private String aclId;

    @NotEmpty(message = "entryId can not be empty")
    @UcloudParam("EntryId")
    private String entryId;


    @UcloudParam("ApiVersion")
    private String apiVersion;


    public DeleteNetworkAclEntryParam(@NotEmpty(message = "region can not be empty") String region,
                                      @NotEmpty(message = "aclId can not be empty") String aclId,
                                      @NotEmpty(message = "entryId can not be empty") String entryId) {
        super("DeleteNetworkAclEntry");
        this.region = region;
        this.aclId = aclId;
        this.entryId = entryId;
        this.apiVersion = "3";
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


}
