package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取ACL信息 结果类
 * @author: codezhang
 * @date: 2018-09-21 14:41
 **/

public class DescribeACLResult extends BaseResponseResult {

    public static class ACL{

        @SerializedName("VpcId")
        private String vpcId;

        @SerializedName("AclId")
        private String aclId;

        @SerializedName("AclName")
        private String aclName;

        @SerializedName("Description")
        private String description;

        @SerializedName("CreateTime")
        private Integer createTime;

        @SerializedName("UpdateTime")
        private Integer updateTime;

        @SerializedName("Entries")
        private List entries;

        @SerializedName("Associations")
        private List<Association> associations;

        public String getVpcId() {
            return vpcId;
        }

        public void setVpcId(String vpcId) {
            this.vpcId = vpcId;
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

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public List getEntries() {
            return entries;
        }

        public void setEntries(List entries) {
            this.entries = entries;
        }

        public List<Association> getAssociations() {
            return associations;
        }

        public void setAssociations(List<Association> associations) {
            this.associations = associations;
        }
    }

    public static class Association {

        @SerializedName("AssociationId")
        private String associationId;

        @SerializedName("AclId")
        private String aclId;

        @SerializedName("SubnetworkId")
        private String subnetworkId;

        @SerializedName("CreateTime")
        private Integer createTime;

        public String getAssociationId() {
            return associationId;
        }

        public void setAssociationId(String associationId) {
            this.associationId = associationId;
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

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }
    }

    @SerializedName("AclList")
    private List<ACL> aclList;


    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<ACL> getAclList() {
        return aclList;
    }

    public void setAclList(List<ACL> aclList) {
        this.aclList = aclList;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
