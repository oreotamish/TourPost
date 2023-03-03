package com.tourpost.app.modules.inbox.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tourpost.app.modules.inbox.`data`.model.InboxModel
import com.tourpost.app.modules.inbox.`data`.model.InboxRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class InboxVM : ViewModel(), KoinComponent {
  val inboxModel: MutableLiveData<InboxModel> = MutableLiveData(InboxModel())

  var navArguments: Bundle? = null

  val inboxList: MutableLiveData<MutableList<InboxRowModel>> = MutableLiveData(mutableListOf())
}
