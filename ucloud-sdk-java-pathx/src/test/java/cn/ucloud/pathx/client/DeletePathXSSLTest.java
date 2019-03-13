package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DeletePathXSSLParam;
import cn.ucloud.pathx.model.DeletePathXSSLResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DeletePathXSSL 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DeletePathXSSLTest {

    private PATHXClient client;

    private DeletePathXSSLParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String sSLId = "cn-sh2";
        param = new DeletePathXSSLParam(projectId, sSLId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void deletePathXSSL() {
        try {
            DeletePathXSSLResult result = client.deletePathXSSL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}