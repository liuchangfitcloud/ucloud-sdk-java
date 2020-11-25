package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 创建ACL规则 结果类
 * @author: codezhang
 * @date: 2018-09-21 14:09
 **/

public class CreateNetworkAclEntryResult extends BaseResponseResult {

    @SerializedName("EntryId")
    private String entryId;

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }
}
