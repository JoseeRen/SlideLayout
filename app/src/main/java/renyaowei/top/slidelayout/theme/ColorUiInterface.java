/*
 * Create on 2017-7-27 下午9:22
 * FileName: ColorUiInterface.java
 * Author: Ren Yaowei
 * Blog: http://www.renyaowei.top
 * Email renyaowei@foxmail.com
 */

package renyaowei.top.slidelayout.theme;

import android.content.res.Resources;
import android.view.View;

/**
 * 换肤接口
 * Created by chengli on 15/6/8.
 */
public interface ColorUiInterface {


    View getView();

    void setTheme(Resources.Theme themeId);
}
