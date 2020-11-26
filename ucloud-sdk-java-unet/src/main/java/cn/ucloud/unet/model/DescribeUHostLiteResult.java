package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取可以绑定的主机信息 结果类
 * @author: codezhang
 * @date: 2018-09-27 14:42
 **/

public class DescribeUHostLiteResult extends BaseResponseResult {

    @SerializedName("TotalCount")
    private Integer totalCount;

    public static class UHost{

        @SerializedName("HotplugFeature")
        private Boolean hotplugFeature;

        @SerializedName("Name")
        private String name;

        @SerializedName("Remark")
        private String remark;

        @SerializedName("State")
        private String state;

        @SerializedName("SubnetType")
        private String subnetType;

        @SerializedName("Tag")
        private String tag;

        @SerializedName("UHostId")
        private String uHostId;

        @SerializedName("UHostType")
        private String uHostType;

        @SerializedName("Zone")
        private String zone;

        @SerializedName("IPSet")
        private List<IP> ips;

        public Boolean getHotplugFeature() {
            return hotplugFeature;
        }

        public void setHotplugFeature(Boolean hotplugFeature) {
            this.hotplugFeature = hotplugFeature;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getSubnetType() {
            return subnetType;
        }

        public void setSubnetType(String subnetType) {
            this.subnetType = subnetType;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getuHostId() {
            return uHostId;
        }

        public void setuHostId(String uHostId) {
            this.uHostId = uHostId;
        }

        public String getuHostType() {
            return uHostType;
        }

        public void setuHostType(String uHostType) {
            this.uHostType = uHostType;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public List<IP> getIps() {
            return ips;
        }

        public void setIps(List<IP> ips) {
            this.ips = ips;
        }
    }

    public static class IP{

        @SerializedName("Default")
        private Boolean Default;

        @SerializedName("IP")
        private String ip;

        @SerializedName("Mac")
        private String mac;

        @SerializedName("SubnetId")
        private String subnetId;

        @SerializedName("Type")
        private String type;

        @SerializedName("VPCId")
        private String vpcId;

        public Boolean getDefault() {
            return Default;
        }

        public void setDefault(Boolean aDefault) {
            Default = aDefault;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getMac() {
            return mac;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getVpcId() {
            return vpcId;
        }

        public void setVpcId(String vpcId) {
            this.vpcId = vpcId;
        }
    }

    @SerializedName("UHostSet")
    private List<UHost> hosts;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UHost> getHosts() {
        return hosts;
    }

    public void setHosts(List<UHost> hosts) {
        this.hosts = hosts;
    }
}
