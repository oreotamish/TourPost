package com.tourpost.app.modules.homepage.`data`.model

import com.tourpost.app.R
import com.tourpost.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDelhi: String? = MyApp.getInstance().resources.getString(R.string.lbl_delhi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwenty: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)

)
