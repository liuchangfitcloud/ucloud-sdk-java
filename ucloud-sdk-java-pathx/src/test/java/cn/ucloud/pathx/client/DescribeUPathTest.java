package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DescribeUPathParam;
import cn.ucloud.pathx.model.DescribeUPathResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DescribeUPath 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DescribeUPathTest {

    private PATHXClient client;

    private DescribeUPathParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = "org-izug1m";
        param = new DescribeUPathParam(projectId);
    }


    @Test
    public void describeUPath() {
        try {
            DescribeUPathResult result = client.describeUPath(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}