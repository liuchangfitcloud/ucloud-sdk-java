package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取ACL规则 结果类
 * @author: codezhang
 * @date: 2018-09-21 14:41
 **/

public class DescribeNetworkAclEntryResult extends BaseResponseResult {

    public static class Entry{

        @SerializedName("CidrBlock")
        private String cidrBlock;

        @SerializedName("CreateTime")
        private Integer createTime;

        @SerializedName("Description")
        private String description;

        @SerializedName("Direction")
        private String direction;

        @SerializedName("EntryAction")
        private String entryAction;

        @SerializedName("EntryId")
        private String entryId;

        @SerializedName("IpProtocol")
        private String ipProtocol;

        @SerializedName("PortRange")
        private String portRange;

        @SerializedName("Priority")
        private String priority;

        @SerializedName("TargetResourceCount")
        private String targetResourceCount;

        @SerializedName("TargetResourceList")
        private List targetResourceList;

        @SerializedName("TargetType")
        private String targetType;

        @SerializedName("UpdateTime")
        private Integer updateTime;

        public String getCidrBlock() {
            return cidrBlock;
        }

        public void setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getEntryAction() {
            return entryAction;
        }

        public void setEntryAction(String entryAction) {
            this.entryAction = entryAction;
        }

        public String getEntryId() {
            return entryId;
        }

        public void setEntryId(String entryId) {
            this.entryId = entryId;
        }

        public String getIpProtocol() {
            return ipProtocol;
        }

        public void setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
        }

        public String getPortRange() {
            return portRange;
        }

        public void setPortRange(String portRange) {
            this.portRange = portRange;
        }

        public String getPriority() {
            return priority;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }

        public String getTargetResourceCount() {
            return targetResourceCount;
        }

        public void setTargetResourceCount(String targetResourceCount) {
            this.targetResourceCount = targetResourceCount;
        }

        public List getTargetResourceList() {
            return targetResourceList;
        }

        public void setTargetResourceList(List targetResourceList) {
            this.targetResourceList = targetResourceList;
        }

        public String getTargetType() {
            return targetType;
        }

        public void setTargetType(String targetType) {
            this.targetType = targetType;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }
    }

    @SerializedName("EntryList")
    private List<Entry> EntryList;

    public List<Entry> getEntryList() {
        return EntryList;
    }

    public void setEntryList(List<Entry> entryList) {
        EntryList = entryList;
    }
}
