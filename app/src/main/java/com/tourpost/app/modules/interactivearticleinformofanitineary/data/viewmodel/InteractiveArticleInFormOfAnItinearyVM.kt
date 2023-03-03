package com.tourpost.app.modules.interactivearticleinformofanitineary.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tourpost.app.modules.interactivearticleinformofanitineary.`data`.model.InteractiveArticleInFormOfAnItinearyModel
import org.koin.core.KoinComponent

class InteractiveArticleInFormOfAnItinearyVM : ViewModel(), KoinComponent {
  val interactiveArticleInFormOfAnItinearyModel:
      MutableLiveData<InteractiveArticleInFormOfAnItinearyModel> =
      MutableLiveData(InteractiveArticleInFormOfAnItinearyModel())

  var navArguments: Bundle? = null
}
