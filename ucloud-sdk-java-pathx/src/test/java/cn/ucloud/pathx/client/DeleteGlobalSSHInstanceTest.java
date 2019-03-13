package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DeleteGlobalSSHInstanceParam;
import cn.ucloud.pathx.model.DeleteGlobalSSHInstanceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DeleteGlobalSSHInstance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DeleteGlobalSSHInstanceTest {

    private PATHXClient client;

    private DeleteGlobalSSHInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String instanceId = "cn-sh2";
        param = new DeleteGlobalSSHInstanceParam(projectId, instanceId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void deleteGlobalSSHInstance() {
        try {
            DeleteGlobalSSHInstanceResult result = client.deleteGlobalSSHInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}