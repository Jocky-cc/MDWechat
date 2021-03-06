package com.blanke.mdwechat

import android.app.Activity
import android.view.View
import com.flyco.tablayout.CommonTabLayout
import java.lang.ref.WeakReference

object Objects {
    object Main {
        var LauncherUI = WeakReference<Activity>(null)
        var LauncherUI_mViewPager = WeakReference<View>(null)
        var LauncherUI_mTabLayout = WeakReference<CommonTabLayout>(null)
        var LauncherUI_mActionBarContainer = WeakReference<View>(null)
    }

    fun clear() {
        Main.LauncherUI.clear()
        Main.LauncherUI_mViewPager.clear()
        Main.LauncherUI_mTabLayout.clear()
        Main.LauncherUI_mActionBarContainer.clear()
    }
}