package cn.ucloud.udpn.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.udpn.model.AllocateUDPNParam;
import cn.ucloud.udpn.model.AllocateUDPNResult;
import cn.ucloud.udpn.pojo.UdpnConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-04 16:52
 */
public class AllocateUDPNTest {
    private UDPNClient client;

    private AllocateUDPNParam param;

    @Before
    public void initData() {
        client = new DefaultUDPNClient(new UdpnConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new AllocateUDPNParam("cn-bj2", "cn-sh2", 2);
    }

    @Test
    public void allocateUDPN() {
        try {
            AllocateUDPNResult allocateUDPNResult = client.allocateUDPN(param);
            JSONComparator.jsonComparator(allocateUDPNResult);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}
