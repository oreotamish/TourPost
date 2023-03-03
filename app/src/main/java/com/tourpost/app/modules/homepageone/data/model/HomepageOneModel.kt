package com.tourpost.app.modules.homepageone.`data`.model

import com.tourpost.app.R
import com.tourpost.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageOneModel(
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShare: String? = MyApp.getInstance().resources.getString(R.string.lbl_share)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInstagram: String? = MyApp.getInstance().resources.getString(R.string.lbl_instagram)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGujjarChat: String? = MyApp.getInstance().resources.getString(R.string.lbl_gujjar_chat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIMessages: String? = MyApp.getInstance().resources.getString(R.string.lbl_imessages)

)
