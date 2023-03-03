package com.tourpost.app.modules.interactivearticleinformofanitineary.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.tourpost.app.R
import com.tourpost.app.appcomponents.base.BaseActivity
import com.tourpost.app.databinding.ActivityInteractiveArticleInFormOfAnItinearyBinding
import com.tourpost.app.modules.homepagetwo.ui.HomepageTwoActivity
import com.tourpost.app.modules.inbox.ui.InboxActivity
import com.tourpost.app.modules.interactivearticleinformofanitineary.`data`.viewmodel.InteractiveArticleInFormOfAnItinearyVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class InteractiveArticleInFormOfAnItinearyActivity :
    BaseActivity<ActivityInteractiveArticleInFormOfAnItinearyBinding>(R.layout.activity_interactive_article_in_form_of_an_itineary)
    {
  private val viewModel: InteractiveArticleInFormOfAnItinearyVM by
      viewModels<InteractiveArticleInFormOfAnItinearyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.interactiveArticleInFormOfAnItinearyVM = viewModel
    setUpSearchViewSearchbarListener()
  }

  override fun setUpClicks(): Unit {
    binding.txtPopular.setOnClickListener {
      val destIntent = HomepageTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSend.setOnClickListener {
      val destIntent = InboxActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun setUpSearchViewSearchbarListener(): Unit {
    binding.searchViewSearchbar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "INTERACTIVE_ARTICLE_IN_FORM_OF_AN_ITINEARY_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, InteractiveArticleInFormOfAnItinearyActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
