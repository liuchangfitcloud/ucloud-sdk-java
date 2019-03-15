package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取加速线路信息 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DescribeUPathResult extends BaseResponseResult {
    /**
     * 线路信息数组
     */
    @SerializedName("UPathSet")
    private List<UPathInfo> uPathSet;


    public List<UPathInfo> getuPathSet() {
        return this.uPathSet;
    }

    public void setuPathSet(List<UPathInfo> uPathSet) {
        this.uPathSet = uPathSet;
    }


}