package com.tourpost.app.modules.homepagetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tourpost.app.modules.homepagetwo.`data`.model.HomepageTwoModel
import com.tourpost.app.modules.homepagetwo.`data`.model.ListlanguageOneRowModel
import com.tourpost.app.modules.homepagetwo.`data`.model.Listphoto160564948RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomepageTwoVM : ViewModel(), KoinComponent {
  val homepageTwoModel: MutableLiveData<HomepageTwoModel> = MutableLiveData(HomepageTwoModel())

  var navArguments: Bundle? = null

  val listphoto160564948List: MutableLiveData<MutableList<Listphoto160564948RowModel>> =
      MutableLiveData(mutableListOf())

  val listlanguageOneList: MutableLiveData<MutableList<ListlanguageOneRowModel>> =
      MutableLiveData(mutableListOf())
}
