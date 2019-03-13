package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DeleteUGATaskParam;
import cn.ucloud.pathx.model.DeleteUGATaskResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DeleteUGATask 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DeleteUGATaskTest {

    private PATHXClient client;

    private DeleteUGATaskParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String uGAId = "cn-sh2";
        param = new DeleteUGATaskParam(projectId, uGAId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void deleteUGATask() {
        try {
            DeleteUGATaskResult result = client.deleteUGATask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}