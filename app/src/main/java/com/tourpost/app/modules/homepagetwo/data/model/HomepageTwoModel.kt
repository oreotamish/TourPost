package com.tourpost.app.modules.homepagetwo.`data`.model

import com.tourpost.app.R
import com.tourpost.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTrending: String? = MyApp.getInstance().resources.getString(R.string.lbl_following)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrendingOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_community)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuggested: String? = MyApp.getInstance().resources.getString(R.string.lbl_suggested)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForyou: String? = MyApp.getInstance().resources.getString(R.string.lbl_for_you)
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
  var txtThanhPhamOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_thanh_pham)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_hour_ago)

)
