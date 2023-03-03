package com.tourpost.app.modules.homepage.`data`.model

import com.tourpost.app.R
import com.tourpost.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_destination)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrending: String? = MyApp.getInstance().resources.getString(R.string.lbl_following)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeZone: String? = MyApp.getInstance().resources.getString(R.string.lbl_must_visit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThanhPham: String? = MyApp.getInstance().resources.getString(R.string.lbl_thanh_pham)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_hour_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabs: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZurich: String? = MyApp.getInstance().resources.getString(R.string.lbl_zurich)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCzech: String? = MyApp.getInstance().resources.getString(R.string.lbl_czech)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoida: String? = MyApp.getInstance().resources.getString(R.string.lbl_noida)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBerlin: String? = MyApp.getInstance().resources.getString(R.string.lbl_berlin)

)
