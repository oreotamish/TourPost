package com.tourpost.app.modules.homepageone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tourpost.app.modules.homepageone.`data`.model.HomepageOneModel
import com.tourpost.app.modules.homepageone.`data`.model.ListlanguageOne1RowModel
import com.tourpost.app.modules.homepageone.`data`.model.Listphoto160564949RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomepageOneVM : ViewModel(), KoinComponent {
  val homepageOneModel: MutableLiveData<HomepageOneModel> = MutableLiveData(HomepageOneModel())

  var navArguments: Bundle? = null

  val listphoto160564948List: MutableLiveData<MutableList<Listphoto160564949RowModel>> =
      MutableLiveData(mutableListOf())

  val listlanguageOneList: MutableLiveData<MutableList<ListlanguageOne1RowModel>> =
      MutableLiveData(mutableListOf())
}
