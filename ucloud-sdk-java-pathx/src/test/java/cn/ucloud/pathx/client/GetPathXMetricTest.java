package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.model.GetPathXMetricParam;
import cn.ucloud.pathx.model.GetPathXMetricResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.GetPathXMetric 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class GetPathXMetricTest {

    private PATHXClient client;

    private GetPathXMetricParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String resourceId = "cn-sh2";
        Integer beginTime = 1;
        Integer endTime = 1;
        String resourceType = "cn-sh2";
        String lineId = "cn-sh2";
        String metricNames= "";
        param = new GetPathXMetricParam(projectId, resourceId, beginTime, endTime, resourceType, lineId,metricNames);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getPathXMetric() {
        try {
            GetPathXMetricResult result = client.getPathXMetric(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void getPathXMetricCallback() {
        client.getPathXMetric(param, new UcloudHandler
                <GetPathXMetricResult>() {
            @Override
            public Object success(GetPathXMetricResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(GetPathXMetricResult result) {
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