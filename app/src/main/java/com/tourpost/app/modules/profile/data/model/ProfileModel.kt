package com.tourpost.app.modules.profile.`data`.model

import com.tourpost.app.R
import com.tourpost.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGordonRamji: String? = MyApp.getInstance().resources.getString(R.string.lbl_gordon_ramji)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifiedlocal: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_verified_local)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewDelhiNCR: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_delhi_ncr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRepCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_550_rep)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowingCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_150_following)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPostsFortyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_posts_49)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZurich: String? = MyApp.getInstance().resources.getString(R.string.lbl_zurich)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBerlin: String? = MyApp.getInstance().resources.getString(R.string.lbl_berlin)
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
  var etFollowersCounterValue: String? = null
)
