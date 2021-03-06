package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeURedisUpgradePriceParam;
import cn.ucloud.umem.model.DescribeURedisUpgradePriceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeURedisUpgradePrice 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisUpgradePriceTest {

    private UMEMClient client;

    private DescribeURedisUpgradePriceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        Integer size = 2;
        String groupId = "uredis-pgouk5n1";
        param = new DescribeURedisUpgradePriceParam(region, size, groupId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeURedisUpgradePrice() {
        try {
            DescribeURedisUpgradePriceResult result = client.describeURedisUpgradePrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}