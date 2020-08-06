package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 获取UDB实例升降级价格信息 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 15:10
 **/
public class DescribeUDBInstanceUpgradePriceResult extends BaseResponseResult {

    /**
     * 价格，单位分
     */
    @SerializedName("Price")
    private Double price;

    @SerializedName("OriginalPrice")
    private Double originalPrice;

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
