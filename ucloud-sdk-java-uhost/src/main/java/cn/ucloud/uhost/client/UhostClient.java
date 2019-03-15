package cn.ucloud.uhost.client;


import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.uhost.model.*;

/**
 * @description: 云主机的client接口
 * @author: codezhang
 * @date: 2018-09-13 10:48
 **/

public interface UhostClient extends UcloudClient {


    /**
     * 获取VNC登录信息（同步）
     *
     * @param param GetUhostInstanceVncInfoParam参数对象
     * @return GetUhostInstanceVncInfoResult结果对象
     * @throws Exception 出错则抛出异常
     */
    GetUhostInstanceVncInfoResult getUHostInstanceVncInfo(GetUhostInstanceVncInfoParam param) throws Exception;

    /**
     * 获取VNC登录信息(回调)；出错则在回调中的error(e)处理
     *
     * @param param     GetUhostInstanceVncInfoParam参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void getUHostInstanceVncInfo(GetUhostInstanceVncInfoParam param, UcloudHandler<GetUhostInstanceVncInfoResult> handler, Boolean... asyncFlag);

    /**
     * 启动主机实例
     *
     * @param param 启动主机实例参数对象
     * @return 启动主机实例结果对象
     * @throws Exception 出错则抛出异常
     */
    StartUHostInstanceResult startUHostInstance(StartUHostInstanceParam param) throws Exception;

    /**
     * 启动主机实例；出错则在回调中的error(e)处理
     *
     * @param param     启动主机实例参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void startUHostInstance(StartUHostInstanceParam param, UcloudHandler<StartUHostInstanceResult> handler, Boolean... asyncFlag);

    /**
     * 重启主机实例
     *
     * @param param 重启主机实例参数对象
     * @return 重启主机实例的结果对象
     * @throws Exception 出错则抛出异常
     */
    RebootUHostInstanceResult rebootUHostInstance(RebootUHostInstanceParam param) throws Exception;

    /**
     * 重启主机实例
     *
     * @param param     重启主机实例参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void rebootUHostInstance(RebootUHostInstanceParam param, UcloudHandler<RebootUHostInstanceResult> handler, Boolean... asyncFlag);


    /**
     * 关闭主机实例
     *
     * @param param 关机参数对象
     * @return 关闭主机结果对象
     * @throws Exception 关机出错则抛出异常
     */
    StopUHostInstanceResult stopUHostInstance(StopUHostInstanceParam param) throws Exception;

    /**
     * 关闭主机实例
     *
     * @param param     关闭主机实例参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void stopUHostInstance(StopUHostInstanceParam param, UcloudHandler<StopUHostInstanceResult> handler, Boolean... asyncFlag);


    /**
     * 获取主机业务组列表
     *
     * @param param 获取主机业务列表参数对象
     * @return 获取主机业务列表结果对象
     * @throws Exception 获取出错则抛出异常
     */
    DescribeUHostTagsResult describeUHostTags(DescribeUHostTagsParam param) throws Exception;

    /**
     * 获取主机业务组列表
     *
     * @param param     获取主机业务组列表参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void describeUHostTags(StopUHostInstanceParam param, UcloudHandler<DescribeUHostTagsResult> handler, Boolean... asyncFlag);

    /**
     * 创建云主机
     *
     * @param param 创建云主机参数对象
     * @return 创建云主机结果对象
     * @throws Exception 创建出错就抛出异常
     */
    CreateUHostInstanceResult createUHostInstance(CreateUHostInstanceParam param) throws Exception;

    /**
     * 创建云主机
     *
     * @param param     创建云主机参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void createUHostInstance(CreateUHostInstanceParam param, UcloudHandler<CreateUHostInstanceResult> handler, Boolean... asyncFlag);


    /**
     * 修改主机业务组名称
     *
     * @param param 修改主机业务组名称参数对象
     * @return 修改主机业务组结果对象
     * @throws Exception 修改出错则抛出异常
     */
    ModifyUHostInstanceTagResult modifyUHostInstanceTag(ModifyUHostInstanceTagParam param) throws Exception;

    /**
     * 修改主机业务组名称
     *
     * @param param     修改主机业务组名称参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void modifyUHostInstanceTag(ModifyUHostInstanceTagParam param, UcloudHandler<ModifyUHostInstanceTagResult> handler, Boolean... asyncFlag);


    /**
     * 删除主机实例 非试用的过期资源不可删除； 关机状态下才能执行删除操作
     *
     * @param param 删除主机实例的 参数对象
     * @return 删除主机实例的结果对象
     * @throws Exception 删除出错则抛出异常
     */
    TerminateUHostInstanceResult terminateUHostInstance(TerminateUHostInstanceParam param) throws Exception;

    /**
     * 删除主机实例  非试用的过期资源不可删除； 关机状态下才能执行删除操作
     *
     * @param param     删除主机实例 参数对象
     * @param handler   删除主机实例 结果对象
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void terminateUHostInstance(TerminateUHostInstanceParam param, UcloudHandler<TerminateUHostInstanceResult> handler, Boolean... asyncFlag);

    /**
     * 获取主机信息
     *
     * @param param 获取主机信息参数对象
     * @return 获取主机信息结果对象
     * @throws Exception 获取出错则抛出异常
     */
    DescribeUHostInstanceResult describeUHostInstance(DescribeUHostInstanceParam param) throws Exception;

    /**
     * 获取主机信息
     *
     * @param param     获取主机信息参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void describeUHostInstance(DescribeUHostInstanceParam param, UcloudHandler<DescribeUHostInstanceResult> handler, Boolean... asyncFlag);

    /**
     * 获取主机价格
     *
     * @param param 获取主机价格参数对象
     * @return 获取主机价格结果对象
     * @throws Exception 获取失败则抛出异常
     */
    GetUHostInstancePriceResult getUHostInstancePrice(GetUHostInstancePriceParam param) throws Exception;

    /**
     * 获取主机价格
     *
     * @param param     获取主机价格参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void getUHostInstancePrice(GetUHostInstancePriceParam param, UcloudHandler<GetUHostInstancePriceResult> handler, Boolean... asyncFlag);


    /**
     * 修改主机配置
     *
     * @param param 修改主机配置参数对象
     * @return 修改主机参数结果对象
     * @throws Exception 修改异常则抛出异常
     */
    ResizeUHostInstanceResult resizeUHostInstance(ResizeUHostInstanceParam param) throws Exception;

    /**
     * 修改主机配置
     *
     * @param param     修改主机配置参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void resizeUHostInstance(ResizeUHostInstanceParam param, UcloudHandler<ResizeUHostInstanceResult> handler, Boolean... asyncFlag);

    /**
     * 修改主机名称
     *
     * @param param 修改主机名称参数对象
     * @return 修改主机结果对象
     * @throws Exception 修改出错则抛出异常
     */
    ModifyUHostInstanceNameResult modifyUHostInstanceName(ModifyUHostInstanceNameParam param) throws Exception;

    /**
     * 修改主机名称
     *
     * @param param     修改主机名称参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void modifyUHostInstanceName(ModifyUHostInstanceNameParam param, UcloudHandler<ModifyUHostInstanceNameResult> handler, Boolean... asyncFlag);

    /**
     * 修改主机密码
     *
     * @param param 修改主机密码参数
     * @return 修改主机密码结果
     * @throws Exception 修改出错则抛出异常
     */
    ResetUHostInstancePasswordResult resetUHostInstancePassword(ResetUHostInstancePasswordParam param) throws Exception;

    /**
     * 修改主机密码
     *
     * @param param     修改主机密码参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void resetUHostInstancePassword(ResetUHostInstancePasswordParam param, UcloudHandler<ResetUHostInstancePasswordResult> handler, Boolean... asyncFlag);

    /**
     * 模拟主机掉电
     *
     * @param param 模拟主机掉电参数对象
     * @return 模拟主机掉电结果对象
     * @throws Exception 模拟出错则抛出异常
     */
    PoweroffUHostInstanceResult poweroffUHostInstance(PoweroffUHostInstanceParam param) throws Exception;

    /**
     * 模拟主机掉电
     *
     * @param param     模拟主机掉电参数
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void poweroffUHostInstance(PoweroffUHostInstanceParam param, UcloudHandler<PoweroffUHostInstanceResult> handler, Boolean... asyncFlag);

    /**
     * 导入用户镜像
     *
     * @param param 导入用户镜像参数对象
     * @return 导入用户镜像结果对象
     * @throws Exception 导入错误则抛出异常
     */
    ImportCustomImageResult importCustomImage(ImportCustomImageParam param) throws Exception;

    /**
     * 导入用户镜像
     *
     * @param param     导入用户镜像参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void importCustomImage(ImportCustomImageParam param, UcloudHandler<ImportCustomImageResult> handler, Boolean... asyncFlag);

    /**
     * 复制用户镜像
     *
     * @param param 复制用户镜像参数
     * @return 复制用户镜像结果
     * @throws Exception 复制出错则抛出异常
     */
    CopyCustomImageResult copyCustomImage(CopyCustomImageParam param) throws Exception;

    /**
     * 复制用户镜像
     *
     * @param param     复制用户镜像参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void copyCustomImage(CopyCustomImageParam param, UcloudHandler<CopyCustomImageResult> handler, Boolean... asyncFlag);

    /**
     * 获取镜像
     *
     * @param param 获取镜像参数对象
     * @return 获取镜像结果对象
     * @throws Exception 获取出错则抛出异常
     */
    DescribeImageResult describeImage(DescribeImageParam param) throws Exception;

    /**
     * 获取镜像
     *
     * @param param     获取镜像参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void describeImage(DescribeImageParam param, UcloudHandler<DescribeImageResult> handler, Boolean... asyncFlag);

    /**
     * 删除用户镜像
     *
     * @param param 删除用户镜像参数对象
     * @return 删除用户镜像结果对象
     * @throws Exception 删除出错则抛出异常
     */
    TerminateCustomImageResult terminateCustomImage(TerminateCustomImageParam param) throws Exception;

    /**
     * 删除用户镜像
     *
     * @param param     删除用户镜像参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void terminateCustomImage(TerminateCustomImageParam param, UcloudHandler<TerminateCustomImageResult> handler, Boolean... asyncFlag);

    /**
     * 重装系统
     *
     * @param param 重装系统参数对象
     * @return 重装系统结果对象
     * @throws Exception 重装失败则抛出异常
     */
    ReinstallUHostInstanceResult reinstallUHostInstance(ReinstallUHostInstanceParam param) throws Exception;

    /**
     * 重装系统
     *
     * @param param     重装系统参数
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void reinstallUHostInstance(ReinstallUHostInstanceParam param, UcloudHandler<ReinstallUHostInstanceResult> handler, Boolean... asyncFlag);

    /**
     * 获取主机升级价格
     *
     * @param param 获取主机升级价格参数
     * @return 升级价格
     * @throws Exception 获取出错则抛出异常
     */
    GetUHostUpgradePriceResult getUHostUpgradePrice(GetUHostUpgradePriceParam param) throws Exception;

    /**
     * 获取主机升级价格
     *
     * @param param     获取主机升级价格参数
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void getUHostUpgradePrice(GetUHostUpgradePriceParam param, UcloudHandler<GetUHostUpgradePriceResult> handler, Boolean... asyncFlag);

    /**
     * 修改主机备注信息
     *
     * @param param 修改主机备注信息参数对象
     * @return 修改结果
     * @throws Exception 修改出错则抛出异常
     */
    ModifyUHostInstanceRemarkResult modifyUHostInstanceRemark(ModifyUHostInstanceRemarkParam param) throws Exception;

    /**
     * 修改主机备注信息
     *
     * @param param     修改主机备注信息参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void modifyUHostInstanceRemark(ModifyUHostInstanceRemarkParam param, UcloudHandler<ModifyUHostInstanceRemarkResult> handler, Boolean... asyncFlag);

    /**
     * 创建用户镜像
     *
     * @param param 创建用户镜像参数对象
     * @return 创建结果
     * @throws Exception 创建出错则抛出异常
     */
    CreateCustomImageResult createCustomImage(CreateCustomImageParam param) throws Exception;

    /**
     * 创建用户镜像
     *
     * @param param     创建用户镜像参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void createCustomeImage(CreateCustomImageParam param, UcloudHandler<CreateCustomImageResult> handler, Boolean... asyncFlag);

    /**
     * 普通升级为方舟机型
     *
     * @param param 普通升级为方舟机型参数对象
     * @return 普通升级为方舟机型结果对象
     * @throws Exception 升级出错则抛出异常
     */
    UpgradeToArkUHostInstanceResult upgradeToArkUHostInstance(UpgradeToArkUHostInstanceParam param) throws Exception;

    /**
     * 普通升级为方舟机型
     *
     * @param param     普通升级为方舟机型参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void upgradeToArkUHostInstance(UpgradeToArkUHostInstanceParam param, UcloudHandler<UpgradeToArkUHostInstanceResult> handler, Boolean... asyncFlag);


    /**
     * 获取监控信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 升级出错则抛出异常
     */
    GetMetricResult getMetric(GetMetricParam param) throws Exception;

    /**
     * 获取监控信息
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void getMetric(GetMetricParam param, UcloudHandler<GetMetricResult> handler, Boolean... asyncFlag);

}
