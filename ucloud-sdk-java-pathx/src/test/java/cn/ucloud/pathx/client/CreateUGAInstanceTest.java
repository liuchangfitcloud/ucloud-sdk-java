package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.CreateUGAInstanceParam;
import cn.ucloud.pathx.model.CreateUGAInstanceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.CreateUGAInstance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class CreateUGAInstanceTest {

    private PATHXClient client;

    private CreateUGAInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = "org-izug1m";
        String name = "sdk-java-test";
        String location = "中国";
        param = new CreateUGAInstanceParam(projectId, name,location);
        param.setDomain("codezhang.cn");
        List<Integer> tcpPorts = new ArrayList<>();
        tcpPorts.add(80);
        param.setTcpPorts(tcpPorts);
    }

    @Test
    public void createUGAInstance() {
        try {
            CreateUGAInstanceResult result = client.createUGAInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}