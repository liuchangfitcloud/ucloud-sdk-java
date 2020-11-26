package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取ACL信息 结果类
 * @author: codezhang
 * @date: 2018-09-21 14:41
 **/

public class DescribeNATGWResult extends BaseResponseResult {

    @SerializedName("TotalCount")
    private Integer totalCount;

    public static class NatGw{

        @SerializedName("CreateTime")
        private Integer createTime;

        @SerializedName("FirewallId")
        private String firewallId;

        @SerializedName("IPSet")
        private List<IP> ips;

        @SerializedName("IsSnatpoolEnabled")
        private String isSnatpoolEnabled;

        @SerializedName("NATGWId")
        private String natgwId;

        @SerializedName("NATGWName")
        private String natgwName;

        @SerializedName("PolicyId")
        private List policyId;

        @SerializedName("Remark")
        private String remark;

        @SerializedName("SubnetSet")
        private List<SubnetSet> subnetSet;

        @SerializedName("Tag")
        private String tag;

        @SerializedName("VPCId")
        private String vpcId;

        @SerializedName("VPCName")
        private String vpcName;

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getFirewallId() {
            return firewallId;
        }

        public void setFirewallId(String firewallId) {
            this.firewallId = firewallId;
        }

        public List<IP> getIps() {
            return ips;
        }

        public void setIps(List<IP> ips) {
            this.ips = ips;
        }

        public String getIsSnatpoolEnabled() {
            return isSnatpoolEnabled;
        }

        public void setIsSnatpoolEnabled(String isSnatpoolEnabled) {
            this.isSnatpoolEnabled = isSnatpoolEnabled;
        }

        public String getNatgwId() {
            return natgwId;
        }

        public void setNatgwId(String natgwId) {
            this.natgwId = natgwId;
        }

        public String getNatgwName() {
            return natgwName;
        }

        public void setNatgwName(String natgwName) {
            this.natgwName = natgwName;
        }

        public List getPolicyId() {
            return policyId;
        }

        public void setPolicyId(List policyId) {
            this.policyId = policyId;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public List<SubnetSet> getSubnetSet() {
            return subnetSet;
        }

        public void setSubnetSet(List<SubnetSet> subnetSet) {
            this.subnetSet = subnetSet;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getVpcId() {
            return vpcId;
        }

        public void setVpcId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getVpcName() {
            return vpcName;
        }

        public void setVpcName(String vpcName) {
            this.vpcName = vpcName;
        }
    }


    public static class SubnetSet{
        @SerializedName("SubnetSet")
        private String subnetSet;

        @SerializedName("SubnetName")
        private String subnetName;

        @SerializedName("SubnetworkId")
        private String subnetworkId;

        @SerializedName("SubnetworkUUID")
        private String subnetworkUuid;

        public String getSubnetSet() {
            return subnetSet;
        }

        public void setSubnetSet(String subnetSet) {
            this.subnetSet = subnetSet;
        }

        public String getSubnetName() {
            return subnetName;
        }

        public void setSubnetName(String subnetName) {
            this.subnetName = subnetName;
        }

        public String getSubnetworkId() {
            return subnetworkId;
        }

        public void setSubnetworkId(String subnetworkId) {
            this.subnetworkId = subnetworkId;
        }

        public String getSubnetworkUuid() {
            return subnetworkUuid;
        }

        public void setSubnetworkUuid(String subnetworkUuid) {
            this.subnetworkUuid = subnetworkUuid;
        }
    }

    public static class IP{

        @SerializedName("Bandwidth")
        private Integer bandwidth;

        @SerializedName("BandwidthType")
        private String bandwidthType;

        @SerializedName("EIPId")
        private String eipId;

        @SerializedName("EIPUUID")
        private String eipUuid;

        @SerializedName("IPResInfo")
        private List<IPResInfo> ipResInfos;

        @SerializedName("Weight")
        private Integer weight;

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getBandwidthType() {
            return bandwidthType;
        }

        public void setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
        }

        public String getEipId() {
            return eipId;
        }

        public void setEipId(String eipId) {
            this.eipId = eipId;
        }

        public String getEipUuid() {
            return eipUuid;
        }

        public void setEipUuid(String eipUuid) {
            this.eipUuid = eipUuid;
        }

        public List<IPResInfo> getIpResInfos() {
            return ipResInfos;
        }

        public void setIpResInfos(List<IPResInfo> ipResInfos) {
            this.ipResInfos = ipResInfos;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }
    }

    public static class IPResInfo{

        @SerializedName("EIP")
        private String eip;

        @SerializedName("OperatorName")
        private String operatorName;

        public String getEip() {
            return eip;
        }

        public void setEip(String eip) {
            this.eip = eip;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }
    }

    @SerializedName("DataSet")
    private List<NatGw> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<NatGw> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<NatGw> dataSet) {
        this.dataSet = dataSet;
    }
}
