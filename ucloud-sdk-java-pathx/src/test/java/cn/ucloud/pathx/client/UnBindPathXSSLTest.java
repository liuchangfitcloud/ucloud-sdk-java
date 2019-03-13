package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.model.UnBindPathXSSLParam;
import cn.ucloud.pathx.model.UnBindPathXSSLResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.UnBindPathXSSL 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class UnBindPathXSSLTest {

    private PATHXClient client;

    private UnBindPathXSSLParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String uGAId = "cn-sh2";
        String sSLId = "cn-sh2";
        List<Integer> ports = new ArrayList<>();
        param = new UnBindPathXSSLParam(uGAId, sSLId,ports);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void unBindPathXSSL() {
        try {
            UnBindPathXSSLResult result = client.unBindPathXSSL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void unBindPathXSSLCallback() {
        client.unBindPathXSSL(param, new UcloudHandler
                <UnBindPathXSSLResult>() {
            @Override
            public Object success(UnBindPathXSSLResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(UnBindPathXSSLResult result) {
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