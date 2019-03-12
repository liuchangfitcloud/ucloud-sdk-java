package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.model.GetGlobalSSHMetricParam;
import cn.ucloud.pathx.model.GetGlobalSSHMetricResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.GetGlobalSSHMetric 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class GetGlobalSSHMetricTest {

    private PATHXClient client;

    private GetGlobalSSHMetricParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String instanceId = "cn-sh2";
        Integer beginTime = 1;
        Integer endTime = 1;
        param = new GetGlobalSSHMetricParam(instanceId, beginTime, endTime);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getGlobalSSHMetric() {
        try {
            GetGlobalSSHMetricResult result = client.getGlobalSSHMetric(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void getGlobalSSHMetricCallback() {
        client.getGlobalSSHMetric(param, new UcloudHandler
                <GetGlobalSSHMetricResult>() {
            @Override
            public Object success(GetGlobalSSHMetricResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(GetGlobalSSHMetricResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        }, false);
    }
}