package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.GetGlobalSSHPriceParam;
import cn.ucloud.pathx.model.GetGlobalSSHPriceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.GetGlobalSSHPrice 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetGlobalSSHPriceTest {

    private PATHXClient client;

    private GetGlobalSSHPriceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        Integer quantity = 1;
        String chargeType = "Dynamic";
        param = new GetGlobalSSHPriceParam(quantity, chargeType);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getGlobalSSHPrice() {
        try {
            GetGlobalSSHPriceResult result = client.getGlobalSSHPrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}