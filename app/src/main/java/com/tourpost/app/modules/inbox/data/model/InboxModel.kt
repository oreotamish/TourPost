package com.tourpost.app.modules.inbox.`data`.model

import com.tourpost.app.R
import com.tourpost.app.appcomponents.di.MyApp
import kotlin.String

data class InboxModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInbox: String? = MyApp.getInstance().resources.getString(R.string.lbl_inbox)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGuideSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_guide_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGreatyaar: String? = MyApp.getInstance().resources.getString(R.string.lbl_great_yaar)

)
