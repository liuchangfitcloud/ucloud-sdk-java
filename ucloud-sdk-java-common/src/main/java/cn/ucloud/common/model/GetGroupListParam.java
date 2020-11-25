package cn.ucloud.common.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取项目列表 参数类
 * @author: codezhang
 * @date: 2018-11-13 15:19
 **/

public class GetGroupListParam extends BaseRequestParam {

    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;

    @UcloudParam("Limit")
    private String limit;

    @UcloudParam("Offset")
    private String offset;



    public GetGroupListParam(@NotEmpty(message = "projectId can not be empty") String projectId) {
        super("ListBusinessGroup");
        this.projectId = projectId;
        this.limit = "100";
        this.offset = "0";
    }
}
