package cn.ucloud.censor.client;

import cn.ucloud.censor.model.CreateUAICensorResourceParam;
import cn.ucloud.censor.model.CreateUAICensorResourceResult;
import cn.ucloud.censor.model.DeleteUAICensorResourceParam;
import cn.ucloud.censor.model.DeleteUAICensorResourceResult;
import cn.ucloud.censor.model.GetUAICensorAvailResourceTypeParam;
import cn.ucloud.censor.model.GetUAICensorAvailResourceTypeResult;
import cn.ucloud.censor.model.GetUAICensorResourceListParam;
import cn.ucloud.censor.model.GetUAICensorResourceListResult;
import cn.ucloud.censor.model.ModifyUAICensorResourceMemoParam;
import cn.ucloud.censor.model.ModifyUAICensorResourceMemoResult;
import cn.ucloud.censor.model.ModifyUAICensorResourceNameParam;
import cn.ucloud.censor.model.ModifyUAICensorResourceNameResult;
import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.common.pojo.UcloudConfig;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 10:49
 **/
public class DefaultCensorClient extends DefaultUcloudClient implements CensorClient {

    public DefaultCensorClient(UcloudConfig config) {
        super(config);
    }

    @Override
    public DeleteUAICensorResourceResult
    deleteUAICensorResource(DeleteUAICensorResourceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUAICensorResourceResult.class);
        return (DeleteUAICensorResourceResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteUAICensorResource(DeleteUAICensorResourceParam param,
                                        UcloudHandler<DeleteUAICensorResourceResult> handler,
                                        Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUAICensorResourceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUAICensorResourceNameResult
    modifyUAICensorResourceName(ModifyUAICensorResourceNameParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAICensorResourceNameResult.class);
        return (ModifyUAICensorResourceNameResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyUAICensorResourceName(ModifyUAICensorResourceNameParam param,
                                            UcloudHandler<ModifyUAICensorResourceNameResult> handler,
                                            Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAICensorResourceNameResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUAICensorResourceMemoResult
    modifyUAICensorResourceMemo(ModifyUAICensorResourceMemoParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAICensorResourceMemoResult.class);
        return (ModifyUAICensorResourceMemoResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyUAICensorResourceMemo(ModifyUAICensorResourceMemoParam param,
                                            UcloudHandler<ModifyUAICensorResourceMemoResult> handler,
                                            Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAICensorResourceMemoResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUAICensorResourceListResult
    getUAICensorResourceList(GetUAICensorResourceListParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorResourceListResult.class);
        return (GetUAICensorResourceListResult) http.doGet(param, config, null);
    }

    @Override
    public void getUAICensorResourceList(GetUAICensorResourceListParam param,
                                         UcloudHandler<GetUAICensorResourceListResult> handler,
                                         Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorResourceListResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUAICensorResourceResult
    createUAICensorResource(CreateUAICensorResourceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUAICensorResourceResult.class);
        return (CreateUAICensorResourceResult) http.doGet(param, config, null);
    }

    @Override
    public void createUAICensorResource(CreateUAICensorResourceParam param,
                                        UcloudHandler<CreateUAICensorResourceResult> handler,
                                        Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorAvailResourceTypeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUAICensorAvailResourceTypeResult
    getUAICensorAvailResourceType(GetUAICensorAvailResourceTypeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorAvailResourceTypeResult.class);
        return (GetUAICensorAvailResourceTypeResult) http.doGet(param, config, null);
    }

    @Override
    public void getUAICensorAvailResourceType(GetUAICensorAvailResourceTypeParam param,
                                              UcloudHandler<GetUAICensorAvailResourceTypeResult> handler,
                                              Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorAvailResourceTypeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
