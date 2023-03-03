package com.tourpost.app.modules.inbox.`data`.model

import com.tourpost.app.R
import com.tourpost.app.appcomponents.di.MyApp
import kotlin.String

data class InboxRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGuideOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_guide_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHellofromme: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello_from_me)

)
