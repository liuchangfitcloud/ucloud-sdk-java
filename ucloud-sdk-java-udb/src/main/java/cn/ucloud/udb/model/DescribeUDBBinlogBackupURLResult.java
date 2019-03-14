package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 获取UDB的Binlog备份地址 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 10:30
 **/
public class DescribeUDBBinlogBackupURLResult extends BaseResponseResult {

    /**
     * DB实例备份文件的地址
     */
    @SerializedName("BackupPath")
    private String backupPath;

    /**
     * 内部地址
     */
    @SerializedName("InnerBackupPath")
    private String innerBackupPath;


    public String getBackupPath() {
        return backupPath;
    }

    public void setBackupPath(String backupPath) {
        this.backupPath = backupPath;
    }

    public String getInnerBackupPath() {
        return innerBackupPath;
    }

    public void setInnerBackupPath(String innerBackupPath) {
        this.innerBackupPath = innerBackupPath;
    }
}
