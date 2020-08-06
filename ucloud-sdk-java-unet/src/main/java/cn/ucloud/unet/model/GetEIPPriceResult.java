package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 获取弹性IP价格 结果类
 * @author: codezhang
 * @date: 2018-09-27 12:30
 **/

public class GetEIPPriceResult extends BaseResponseResult {

    public  static  class EIPPrice{

        /**
         * 弹性IP付费方式
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * 弹性IP价格, 单位"元"
         */
        @SerializedName("Price")
        private BigDecimal price;


        /**
         * 资源有效期, 以Unix Timestamp表示
         */
        @SerializedName("PurchaseValue")
        private Integer purchaseValue;

        @SerializedName("ListPrice")
        private BigDecimal listPrice;

        @SerializedName("OriginalPrice")
        private BigDecimal originalPrice;

        public BigDecimal getOriginalPrice() {
            return originalPrice;
        }

        public void setOriginalPrice(BigDecimal originalPrice) {
            this.originalPrice = originalPrice;
        }

        public BigDecimal getListPrice() {
            return listPrice;
        }

        public void setListPrice(BigDecimal listPrice) {
            this.listPrice = listPrice;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public Integer getPurchaseValue() {
            return purchaseValue;
        }

        public void setPurchaseValue(Integer purchaseValue) {
            this.purchaseValue = purchaseValue;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }

    /**
     * 弹性IP价格详情 详情见 EIPPriceDetailSet
     */
    @SerializedName("PriceSet")
    private List<EIPPrice> eipPrices;

    /**
     * 请求UUID
     */
    @SerializedName("Request_uuid")
    private String requestUuid;

    public String getRequestUuid() {
        return requestUuid;
    }

    public void setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
    }

    public List<EIPPrice> getEipPrices() {
        return eipPrices;
    }

    public void setEipPrices(List<EIPPrice> eipPrices) {
        this.eipPrices = eipPrices;
    }
}
