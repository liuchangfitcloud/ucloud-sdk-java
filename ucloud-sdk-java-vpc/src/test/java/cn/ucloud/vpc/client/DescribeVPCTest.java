package cn.ucloud.vpc.client;

import cn.ucloud.vpc.client.DefaultVPCClient;
import cn.ucloud.vpc.client.VPCClient;
import cn.ucloud.vpc.model.DescribeVPCParam;
import cn.ucloud.vpc.model.DescribeVPCResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 14:50
 **/
public class DescribeVPCTest {

    private VPCClient client;

    private DescribeVPCParam param;


    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new DescribeVPCParam("cn-bj2");
    }
    @Test
    public void describeVPC() {
        try {
            DescribeVPCResult describeVPCResult = client.describeVPC(param);
            JSONComparator.jsonComparator(describeVPCResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}