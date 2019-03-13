package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 删除云主机实例 结果对象
 * @author: codezhang
 * @date: 2018-09-17 18:51
 **/

public class TerminateUHostInstanceResult extends BaseResponseResult {

    /**
     * UHost 实例 Id
     */
    @SerializedName("UHostId")
    private String uhostId;


    /**
     * 放入回收站:"Yes", 彻底删除：“No”
     */
    @SerializedName("InRecycle")
    private String inRecycle;


    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
        this.uhostId = uhostId;
    }

    public String getInRecycle() {
        return inRecycle;
    }

    public void setInRecycle(String inRecycle) {
        this.inRecycle = inRecycle;
    }


}
