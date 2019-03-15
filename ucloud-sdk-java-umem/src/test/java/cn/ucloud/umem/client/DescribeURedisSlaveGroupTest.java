package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeURedisSlaveGroupParam;
import cn.ucloud.umem.model.DescribeURedisSlaveGroupResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeURedisSlaveGroup 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisSlaveGroupTest {

    private UMEMClient client;

    private DescribeURedisSlaveGroupParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String masterGroupId = "cn-sh2-02";
        param = new DescribeURedisSlaveGroupParam(region, masterGroupId);
        param.setProjectId("org-izug1m");
    }

    // todo 服务不可用
    @Test
    public void describeURedisSlaveGroup() {
        try {
            DescribeURedisSlaveGroupResult result = client.describeURedisSlaveGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}