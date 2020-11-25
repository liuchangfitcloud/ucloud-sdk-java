package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 创建ACL 结果类
 * @author: codezhang
 * @date: 2018-09-21 11:35
 **/

public class CreateACLResult extends BaseResponseResult {

    /**
     * ACL资源Id
     */
    @SerializedName("AclId")
    private  String aclId;

    public String getAclId() {
        return aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }
}
