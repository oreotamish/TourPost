package com.tourpost.app.modules.interactivearticleinformofanitineary.`data`.model

import com.tourpost.app.R
import com.tourpost.app.appcomponents.di.MyApp
import kotlin.String

data class InteractiveArticleInFormOfAnItinearyModel(
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
  var txtDelhi: String? = MyApp.getInstance().resources.getString(R.string.lbl_delhi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_sooraj_aggarwa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLajpatNagar: String? = MyApp.getInstance().resources.getString(R.string.lbl_lajpat_nagar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThislistwould: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_list_would)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGurgaon: String? = MyApp.getInstance().resources.getString(R.string.lbl_gurgaon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThislistwouldOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_list_would)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShaheenBagh: String? = MyApp.getInstance().resources.getString(R.string.lbl_shaheen_bagh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThislistwouldTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_list_would)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoida: String? = MyApp.getInstance().resources.getString(R.string.lbl_noida2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThislistwouldThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_list_would)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFaridabad: String? = MyApp.getInstance().resources.getString(R.string.lbl_faridabad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThislistwouldFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_list_would)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonTwoValue: String? = null
)
