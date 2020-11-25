package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 创建ACL规则参数类
 * @author: codezhang
 * @date: 2018-09-21 11:24
 **/

public class CreateNetworkAclEntryParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require acl名称
     */
    @NotEmpty(message = "AclId can not be empty")
    @UcloudParam("AclId")
    private String aclId;

    /**
     * 优先级
     */
    @UcloudParam("Priority")
    private String priority;

    /**
     * 来源或者目标IP
     */
    @UcloudParam("CidrBlock")
    private String cidrBlock;

    /**
     * 端口范围
     */
    @UcloudParam("PortRange")
    private String portRange;

    @UcloudParam("Description")
    private String description;

    /**
     * 协议
     */
    @UcloudParam("IpProtocol")
    private String ipProtocol;

    /**
     * 动作 接受、拒绝 Reject
     */
    @UcloudParam("EntryAction")
    private String entryAction;

    /**
     * 出入站
     */
    @UcloudParam("Direction")
    private String direction;

    /**
     * 应用目标 0代表所有的目标都生效 估计这个地方还有问题 因为目前下面没有资源 不知道怎么设置
     */
    @UcloudParam("TargetType")
    private String targetType;

    @UcloudParam("ApiVersion")
    private String apiVersion;


    public CreateNetworkAclEntryParam(@NotEmpty(message = "region can not be empty") String region,
                                      @NotEmpty(message = "aclId can not be empty") String aclId) {
        super("CreateNetworkAcl");
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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCidrBlock() {
        return cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getPortRange() {
        return portRange;
    }

    public void setPortRange(String portRange) {
        this.portRange = portRange;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIpProtocol() {
        return ipProtocol;
    }

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    public String getEntryAction() {
        return entryAction;
    }

    public void setEntryAction(String entryAction) {
        this.entryAction = entryAction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
}
