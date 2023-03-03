package com.tourpost.app.modules.homepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.tourpost.app.R
import com.tourpost.app.appcomponents.base.BaseActivity
import com.tourpost.app.databinding.ActivityHomepageBinding
import com.tourpost.app.modules.homepage.`data`.model.Homepage1RowModel
import com.tourpost.app.modules.homepage.`data`.model.HomepageRowModel
import com.tourpost.app.modules.homepage.`data`.viewmodel.HomepageVM
import com.tourpost.app.modules.homepagetwo.ui.HomepageTwoActivity
import com.tourpost.app.modules.inbox.ui.InboxActivity
import com.tourpost.app.modules.interactivearticleinformofanitineary.ui.InteractiveArticleInFormOfAnItinearyActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomepageActivity : BaseActivity<ActivityHomepageBinding>(R.layout.activity_homepage) {
  private val viewModel: HomepageVM by viewModels<HomepageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val homepageAdapter = HomepageAdapter(viewModel.homepageList.value?:mutableListOf())
    binding.recyclerHomepage.adapter = homepageAdapter
    homepageAdapter.setOnItemClickListener(
    object : HomepageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomepageRowModel) {
        onClickRecyclerHomepage(view, position, item)
      }
    }
    )
    viewModel.homepageList.observe(this) {
      homepageAdapter.updateData(it)
    }
    val homepage1Adapter = Homepage1Adapter(viewModel.homepage1List.value?:mutableListOf())
    binding.recyclerHomepage1.adapter = homepage1Adapter
    homepage1Adapter.setOnItemClickListener(
    object : Homepage1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Homepage1RowModel) {
        onClickRecyclerHomepage1(view, position, item)
      }
    }
    )
    viewModel.homepage1List.observe(this) {
      homepage1Adapter.updateData(it)
    }
    binding.homepageVM = viewModel
    setUpSearchViewSearchbarListener()
  }

  override fun setUpClicks(): Unit {
    binding.frameStackellipse192.setOnClickListener {
      val destIntent = InteractiveArticleInFormOfAnItinearyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImageOne.setOnClickListener {
      val destIntent = InteractiveArticleInFormOfAnItinearyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSend.setOnClickListener {
      val destIntent = InboxActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtPopular.setOnClickListener {
      val destIntent = HomepageTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerHomepage(
    view: View,
    position: Int,
    item: HomepageRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerHomepage1(
    view: View,
    position: Int,
    item: Homepage1RowModel
  ): Unit {
    when(view.id) {
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
      const val TAG: String = "HOMEPAGE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomepageActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
