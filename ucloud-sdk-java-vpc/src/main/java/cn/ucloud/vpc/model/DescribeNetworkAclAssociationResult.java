package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取ACL信息 结果类
 * @author: codezhang
 * @date: 2018-09-21 14:41
 **/

public class DescribeNetworkAclAssociationResult extends BaseResponseResult {

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

    @SerializedName("AssociationList")
    private List<Association> AssociationList;


    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<Association> getAssociationList() {
        return AssociationList;
    }

    public void setAssociationList(List<Association> associationList) {
        AssociationList = associationList;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
