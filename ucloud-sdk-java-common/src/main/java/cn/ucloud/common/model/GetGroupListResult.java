package cn.ucloud.common.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取业务分组列表  结果类
 * @author: codezhang
 * @date: 2018-11-13 15:20
 **/

public class GetGroupListResult extends BaseResponseResult {

    @SerializedName("TotalCount")
    private Long totalCount;

    public static class Group {

        @SerializedName("BusinessId")
        private String businessId;

        @SerializedName("BusinessName")
        private String businessName;

        @SerializedName("Count")
        private Integer count;

        @SerializedName("CreateTime")
        private Integer createTime;

        public String getBusinessId() {
            return businessId;
        }

        public void setBusinessId(String businessId) {
            this.businessId = businessId;
        }

        public String getBusinessName() {
            return businessName;
        }

        public void setBusinessName(String businessName) {
            this.businessName = businessName;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        @Override
        public String toString() {
            return "Group{" +
                    "businessId='" + businessId + '\'' +
                    ", businessName='" + businessName + '\'' +
                    ", count=" + count +
                    ", createTime=" + createTime +
                    '}';
        }
    }

    @SerializedName("Infos")
    private List<Group> infos;

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public List<Group> getInfos() {
        return infos;
    }

    public void setInfos(List<Group> infos) {
        this.infos = infos;
    }
}
