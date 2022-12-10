package com.gswxxn.restoresplashscreen.ui.configapps

import com.gswxxn.restoresplashscreen.R
import com.gswxxn.restoresplashscreen.data.DataConst
import com.gswxxn.restoresplashscreen.ui.`interface`.IConfigApps
import com.highcapable.yukihookapi.hook.xposed.prefs.data.PrefsData

object ForceShowSplashScreen :IConfigApps {
    override val titleID: Int
        get() = R.string.force_show_splash_screen_title
    override val checkedListPrefs: PrefsData<MutableSet<String>>
        get() = DataConst.FORCE_SHOW_SPLASH_SCREEN_LIST
}