package cn.ucloud.ucdn.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.ucdn.model.*;
import cn.ucloud.ucdn.pojo.UcdnConfig;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 14:28
 */
public class DefaultUcdnClient extends DefaultUcloudClient implements UcdnClient {

    public DefaultUcdnClient(UcdnConfig config) {
        super(config);
    }

    @Override
    public BatchDescribeNewUcdnDomainResult batchDescribeNewUcdnDomain(BatchDescribeNewUcdnDomainParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(BatchDescribeNewUcdnDomainResult.class);
        return (BatchDescribeNewUcdnDomainResult) http.doGet(param, config, null);
    }

    @Override
    public void batchDescribeNewUcdnDomain(BatchDescribeNewUcdnDomainParam param, UcloudHandler<BatchDescribeNewUcdnDomainResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(BatchDescribeNewUcdnDomainResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public BatchRefreshNewUcdnDomainCacheResult batchRefreshNewUcdnDomainCache(BatchRefreshNewUcdnDomainCacheParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(BatchRefreshNewUcdnDomainCacheResult.class);
        return (BatchRefreshNewUcdnDomainCacheResult) http.doGet(param, config, null);
    }

    @Override
    public void batchRefreshNewUcdnDomainCache(BatchRefreshNewUcdnDomainCacheParam param, UcloudHandler<BatchRefreshNewUcdnDomainCacheResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(BatchRefreshNewUcdnDomainCacheResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeNewUcdnPrefetchCacheTaskResult describeNewUcdnPrefetchCacheTask(DescribeNewUcdnPrefetchCacheTaskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeNewUcdnPrefetchCacheTaskResult.class);
        return (DescribeNewUcdnPrefetchCacheTaskResult) http.doGet(param, config, null);
    }

    @Override
    public void describeNewUcdnPrefetchCacheTask(DescribeNewUcdnPrefetchCacheTaskParam param, UcloudHandler<DescribeNewUcdnPrefetchCacheTaskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeNewUcdnPrefetchCacheTaskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeNewUcdnRefreshCacheTaskResult describeNewUcdnRefreshCacheTask(DescribeNewUcdnRefreshCacheTaskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeNewUcdnRefreshCacheTaskResult.class);
        return (DescribeNewUcdnRefreshCacheTaskResult) http.doGet(param, config, null);
    }

    @Override
    public void describeNewUcdnRefreshCacheTask(DescribeNewUcdnRefreshCacheTaskParam param, UcloudHandler<DescribeNewUcdnRefreshCacheTaskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeNewUcdnPrefetchCacheTaskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetNewUcdnDomainBandwidthResult getNewUcdnDomainBandwidth(GetNewUcdnDomainBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainBandwidthResult.class);
        return (GetNewUcdnDomainBandwidthResult) http.doGet(param, config, null);
    }

    @Override
    public void getNewUcdnDomainBandwidth(GetNewUcdnDomainBandwidthParam param, UcloudHandler<GetNewUcdnDomainBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainBandwidthResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetNewUcdnDomainHitRateResult getNewUcdnDomainHitRate(GetNewUcdnDomainHitRateParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainHitRateResult.class);
        return (GetNewUcdnDomainHitRateResult) http.doGet(param, config, null);
    }

    @Override
    public void getNewUcdnDomainHitRate(GetNewUcdnDomainHitRateParam param, UcloudHandler<GetNewUcdnDomainHitRateResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainHitRateResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetNewUcdnDomainHttpCodeResult getNewUcdnDomainHttpCode(GetNewUcdnDomainHttpCodeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainHttpCodeResult.class);
        return (GetNewUcdnDomainHttpCodeResult) http.doGet(param, config, null);
    }

    @Override
    public void getNewUcdnDomainHttpCode(GetNewUcdnDomainHttpCodeParam param, UcloudHandler<GetNewUcdnDomainHttpCodeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainHttpCodeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetNewUcdnDomainHttpCodeV2Result getNewUcdnDomainHttpCodeV2(GetNewUcdnDomainHttpCodeV2Param param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainHttpCodeV2Result.class);
        return (GetNewUcdnDomainHttpCodeV2Result) http.doGet(param, config, null);
    }

    @Override
    public void getNewUcdnDomainHttpCodeV2(GetNewUcdnDomainHttpCodeV2Param param, UcloudHandler<GetNewUcdnDomainHttpCodeV2Result> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainHttpCodeV2Result.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetNewUcdnDomainRequestNumResult getNewUcdnDomainRequestNum(GetNewUcdnDomainRequestNumParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainRequestNumResult.class);
        return (GetNewUcdnDomainRequestNumResult) http.doGet(param, config, null);
    }

    @Override
    public void getNewUcdnDomainRequestNum(GetNewUcdnDomainRequestNumParam param, UcloudHandler<GetNewUcdnDomainRequestNumResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainRequestNumResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
