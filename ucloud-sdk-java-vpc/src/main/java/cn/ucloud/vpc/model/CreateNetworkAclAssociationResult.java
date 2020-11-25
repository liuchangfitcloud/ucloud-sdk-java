package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 创建ACL绑定 结果类
 * @author: codezhang
 * @date: 2018-09-21 11:35
 **/

public class CreateNetworkAclAssociationResult extends BaseResponseResult {

    public static class PrevAssociation{

        @SerializedName("AclId")
        private String aclId;

        @SerializedName("AssociationId")
        private String associationId;

        @SerializedName("CreateTime")
        private Integer createTime;

        @SerializedName("SubnetworkId")
        private String subnetworkId;

        public String getAclId() {
            return aclId;
        }

        public void setAclId(String aclId) {
            this.aclId = aclId;
        }

        public String getAssociationId() {
            return associationId;
        }

        public void setAssociationId(String associationId) {
            this.associationId = associationId;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getSubnetworkId() {
            return subnetworkId;
        }

        public void setSubnetworkId(String subnetworkId) {
            this.subnetworkId = subnetworkId;
        }
    }

    @SerializedName("PrevAssociation")
    private List<PrevAssociation> prevAssociation;

    /**
     * 绑定资源Id
     */
    @SerializedName("AssociationId")
    private  String associationId;

    public List<PrevAssociation> getPrevAssociation() {
        return prevAssociation;
    }

    public void setPrevAssociation(List<PrevAssociation> prevAssociation) {
        this.prevAssociation = prevAssociation;
    }

    public String getAssociationId() {
        return associationId;
    }

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }
}
