package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取苹果加速通道信息 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DescribeCommonUGAInstanceResult extends BaseResponseResult {
    /**
     * 全球加速实例信息列表
     */
    @SerializedName("UGAAList")
    private List<AppleUGAAInfo> uGAAList;


    public List<AppleUGAAInfo> getuGAAList() {
        return this.uGAAList;
    }

    public void setuGAAList(List<AppleUGAAInfo> uGAAList) {
        this.uGAAList = uGAAList;
    }


}