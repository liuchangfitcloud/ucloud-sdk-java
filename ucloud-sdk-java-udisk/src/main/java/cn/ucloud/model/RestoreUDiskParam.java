package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 15:55
 */
public class RestoreUDiskParam extends BaseRequestParam {
    /**
     * region 地域，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * zone 可用区，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * uDiskId 需要恢复的盘id
     */
    @NotEmpty(message = "uDiskId can not be empty")
    @UcloudParam("UDiskId")
    private String uDiskId;

    /**
     * SnapshotId 从指定的快照恢复
     */
    @UcloudParam("SnapshotId")
    private String snapshotId;

    /**
     * snapshotTime 指定从方舟恢复的备份时间点
     */
    @UcloudParam("SnapshotTime")
    private int snapshotTime;

    public RestoreUDiskParam(@NotEmpty(message = "region can not be empty") String region,
                             @NotEmpty(message = "zone can not be empty") String zone,
                             @NotEmpty(message = "uDiskId can not be empty") String uDiskId) {
        super("RestoreUDisk");
        this.region = region;
        this.zone = zone;
        this.uDiskId = uDiskId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getuDiskId() {
        return uDiskId;
    }

    public void setuDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public int getSnapshotTime() {
        return snapshotTime;
    }

    public void setSnapshotTime(int snapshotTime) {
        this.snapshotTime = snapshotTime;
    }
}
