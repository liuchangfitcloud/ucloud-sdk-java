package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.ModifyGlobalSSHRemarkParam;
import cn.ucloud.pathx.model.ModifyGlobalSSHRemarkResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.ModifyGlobalSSHRemark 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class ModifyGlobalSSHRemarkTest {

    private PATHXClient client;

    private ModifyGlobalSSHRemarkParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String instanceId = "cn-sh2";
        param = new ModifyGlobalSSHRemarkParam(projectId, instanceId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void modifyGlobalSSHRemark() {
        try {
            ModifyGlobalSSHRemarkResult result = client.modifyGlobalSSHRemark(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}