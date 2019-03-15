package cn.ucloud.ufs.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 获取文件系统价格 结果类
 * @author: codezhang
 * @date: 2018-10-08 16:19
 **/

public class DescribeUFSVolumePriceResult extends BaseResponseResult {

    public static class UFSPrice {
        /**
         * Year， Month， Dynamic，Trial
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * 价格 (单位: 分)
         */
        @SerializedName("Price")
        private BigDecimal price;

        /**
         * “UFS”
         */
        @SerializedName("ChargeName")
        private String chargeName;

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String changeType) {
            this.chargeType = changeType;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public String getChargeName() {
            return chargeName;
        }

        public void setChargeName(String chargeName) {
            this.chargeName = chargeName;
        }
    }


    /**
     * ufs 价格信息
     */
    @SerializedName("DataSet")
    private List<UFSPrice> ufsPrices;

    public List<UFSPrice> getUfsPrices() {
        return ufsPrices;
    }

    public void setUfsPrices(List<UFSPrice> ufsPrices) {
        this.ufsPrices = ufsPrices;
    }
}
