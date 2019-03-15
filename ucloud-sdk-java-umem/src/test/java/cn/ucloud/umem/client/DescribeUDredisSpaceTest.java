package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeUDredisSpaceParam;
import cn.ucloud.umem.model.DescribeUDredisSpaceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeUDredisSpace 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeUDredisSpaceTest {

    private UMEMClient client;

    private DescribeUDredisSpaceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        param = new DescribeUDredisSpaceParam(region);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeUDredisSpace() {
        try {
            DescribeUDredisSpaceResult result = client.describeUDredisSpace(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}