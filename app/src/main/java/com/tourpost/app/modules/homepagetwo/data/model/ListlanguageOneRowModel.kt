package com.tourpost.app.modules.homepagetwo.`data`.model

import com.tourpost.app.R
import com.tourpost.app.appcomponents.di.MyApp
import kotlin.String

data class ListlanguageOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_to_enjoy_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwenty: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)

)
