package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 实例白名单规则 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class InstanceWhitelist {
    /**
     * 实例ID
     */
    @SerializedName("InstanceId")
    private String instanceId;
    /**
     * 白名单规则列表
     */
    @SerializedName("RuleSet")
    private List<Whitelist> ruleSet;


    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    public List<Whitelist> getRuleSet() {
        return this.ruleSet;
    }

    public void setRuleSet(List<Whitelist> ruleSet) {
        this.ruleSet = ruleSet;
    }


}