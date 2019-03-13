package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 更新内容转发规则
 * @author: codezhang
 * @date: 2018-09-19 18:37
 **/

public class UpdatePolicyResult extends BaseResponseResult {
    /**
     * 转发规则的ID
     */
    @SerializedName("PolicyId")
    private String policyId;

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

}
