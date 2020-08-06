package cn.ucloud.vpc.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.vpc.model.*;
import cn.ucloud.vpc.pojo.VPCConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 11:22
 **/

public class DefaultVPCClient extends DefaultUcloudClient implements VPCClient {

    public DefaultVPCClient(VPCConfig config) {
        super(config);
    }

    @Override
    public CreateVPCResult createVPC(CreateVPCParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateVPCResult.class);
        return (CreateVPCResult) http.doPost(param, config, null);
    }

    @Override
    public void createVPC(CreateVPCParam param, UcloudHandler<CreateVPCResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateVPCResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteVPCResult deleteVPC(DeleteVPCParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteVPCResult.class);
        return (DeleteVPCResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteVPC(DeleteVPCParam param, UcloudHandler<DeleteVPCResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteVPCResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeVPCResult describeVPC(DescribeVPCParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeVPCResult.class);
        return (DescribeVPCResult) http.doPost(param, config, null);
    }

    @Override
    public void describeVPC(DescribeVPCParam param, UcloudHandler<DescribeVPCResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeVPCResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AddVPCNetworkResult addVPCNetwork(AddVPCNetworkParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AddVPCNetworkResult.class);
        return (AddVPCNetworkResult) http.doPost(param, config, null);
    }

    @Override
    public void addVPCNetwork(AddVPCNetworkParam param, UcloudHandler<AddVPCNetworkResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AddVPCNetworkResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateSubnetResult createSubnet(CreateSubnetParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateSubnetResult.class);
        return (CreateSubnetResult) http.doPost(param, config, null);
    }

    @Override
    public void createSubnet(CreateSubnetParam param, UcloudHandler<CreateSubnetResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateSubnetResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteSubnetResult deleteSubnet(DeleteSubnetParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteSubnetResult.class);
        return (DeleteSubnetResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteSubnet(DeleteSubnetParam param, UcloudHandler<DeleteSubnetResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteSubnetResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeSubnetResult describeSubnet(DescribeSubnetParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeSubnetResult.class);
        return (DescribeSubnetResult) http.doPost(param, config, null);
    }

    @Override
    public void describeSubnet(DescribeSubnetParam param, UcloudHandler<DescribeSubnetResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeSubnetResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeSubnetResourceResult describeSubnetResource(DescribeSubnetResourceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeSubnetResourceResult.class);
        return (DescribeSubnetResourceResult) http.doPost(param, config, null);
    }

    @Override
    public void describeSubnetResource(DescribeSubnetResourceParam param, UcloudHandler<DescribeSubnetResourceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeSubnetResourceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateSubnetAttributeResult updateSubnetAttribute(UpdateSubnetAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateSubnetAttributeResult.class);
        return (UpdateSubnetAttributeResult) http.doPost(param, config, null);
    }

    @Override
    public void updateSubnetAttribute(UpdateSubnetAttributeParam param, UcloudHandler<UpdateSubnetAttributeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateSubnetAttributeResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateVPCIntercomResult createVPCIntercom(CreateVPCIntercomParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateVPCIntercomResult.class);
        return (CreateVPCIntercomResult) http.doPost(param, config, null);
    }

    @Override
    public void createVPCIntercom(CreateVPCIntercomParam param, UcloudHandler<CreateVPCIntercomResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateVPCIntercomResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeVPCIntercomResult describeVPCIntercom(DescribeVPCIntercomParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeVPCIntercomResult.class);
        return (DescribeVPCIntercomResult) http.doPost(param, config, null);
    }

    @Override
    public void describeVPCIntercom(DescribeVPCIntercomParam param, UcloudHandler<DescribeVPCIntercomResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeVPCIntercomResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteVPCIntercomResult deleteVPCIntercom(DeleteVPCIntercomParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteVPCIntercomResult.class);
        return (DeleteVPCIntercomResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteVPCIntercom(DeleteVPCIntercomParam param, UcloudHandler<DeleteVPCIntercomResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteVPCIntercomResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateRouteTableResult createRouteTable(CreateRouteTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateRouteTableResult.class);
        return (CreateRouteTableResult) http.doPost(param, config, null);
    }

    @Override
    public void createRouteTable(CreateRouteTableParam param, UcloudHandler<CreateRouteTableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateRouteTableResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AssociateRouteTableResult associateRouteTable(AssociateRouteTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AssociateRouteTableResult.class);
        return (AssociateRouteTableResult) http.doPost(param, config, null);
    }

    @Override
    public void associateRouteTable(AssociateRouteTableParam param, UcloudHandler<AssociateRouteTableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AssociateRouteTableResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CloneRouteTableResult cloneRouteTable(CloneRouteTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CloneRouteTableResult.class);
        return (CloneRouteTableResult) http.doPost(param, config, null);
    }

    @Override
    public void cloneRouteTable(CloneRouteTableParam param, UcloudHandler<CloneRouteTableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CloneRouteTableResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteRouteTableResult deleteRouteTable(DeleteRouteTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteRouteTableResult.class);
        return (DeleteRouteTableResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteRouteTable(DeleteRouteTableParam param, UcloudHandler<DeleteRouteTableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteRouteTableResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeRouteTableResult describeRouteTable(DescribeRouteTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeRouteTableResult.class);
        return (DescribeRouteTableResult) http.doPost(param, config, null);
    }

    @Override
    public void describeRouteTable(DescribeRouteTableParam param, UcloudHandler<DescribeRouteTableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeRouteTableResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public ModifyRouteRuleResult modifyRouteRule(ModifyRouteRuleParam param) throws Exception {
        // 未上线
        UcloudHttp http = new UcloudHttpImpl(ModifyRouteRuleResult.class);
        return (ModifyRouteRuleResult) http.doPost(param, config, null);
    }

    @Override
    public void modifyRouteRule(ModifyRouteRuleParam param, UcloudHandler<ModifyRouteRuleResult> handler, Boolean... asyncFlag) {
        // 未上线
        UcloudHttp http = new UcloudHttpImpl(ModifyRouteRuleResult.class);
        try {
           http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateRouteTableAttributeResult updateRouteTableAttribute(UpdateRouteTableAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateRouteTableAttributeResult.class);
        return (UpdateRouteTableAttributeResult) http.doPost(param, config, null);
    }

    @Override
    public void updateRouteTableAttribute(UpdateRouteTableAttributeParam param, UcloudHandler<UpdateRouteTableAttributeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateRouteTableAttributeResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
