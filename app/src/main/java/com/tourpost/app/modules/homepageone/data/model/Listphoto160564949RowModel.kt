package com.tourpost.app.modules.homepageone.`data`.model

import com.tourpost.app.R
import com.tourpost.app.appcomponents.di.MyApp
import kotlin.String

data class Listphoto160564949RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlanningaMana: String? =
      MyApp.getInstance().resources.getString(R.string.msg_planning_a_mana)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManaliisarus: String? =
      MyApp.getInstance().resources.getString(R.string.msg_manali_is_a_rus)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_sooraj_aggarwa)

)
