package com.qstm.ocrdiscernment.utils;

import android.content.Context;

import java.io.File;
import java.util.Calendar;

/**
 * 作者： 周旭 on 2017年9月20日 0020.
 * 邮箱：374952705@qq.com
 * 博客：http://www.jianshu.com/u/56db5d78044d
 */

public class FileUtils {

    /**
     * @Param type 用于表示临时存储的文件
     * @Date 2018/3/14 15:12
     * @Description
     */
    public static File getSaveFile(Context context, String type) {
        File file = new File(context.getFilesDir(), "pic" + type + ".jpg");
        return file;
    }
}
