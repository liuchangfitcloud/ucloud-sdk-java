package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 添加后端实例 结果类
 * @author: codezhang
 * @date: 2018-09-19 15:01
 **/

public class AllocateBackendResult extends BaseResponseResult {

    /**
     * 所添加的后端资源在ULB中的对象ID，（为ULB系统中使用，与资源自身ID无关），
     * 可用于 UpdateBackendAttribute/UpdateBackendAttributeBatch/ReleaseBackend
     */
    @SerializedName("BackendId")
    private String backendId;

    public String getBackendId() {
        return backendId;
    }

    public void setBackendId(String backendId) {
        this.backendId = backendId;
    }

}
