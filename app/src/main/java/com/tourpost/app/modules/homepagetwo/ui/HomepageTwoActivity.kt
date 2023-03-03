package com.tourpost.app.modules.homepagetwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.tourpost.app.R
import com.tourpost.app.appcomponents.base.BaseActivity
import com.tourpost.app.databinding.ActivityHomepageTwoBinding
import com.tourpost.app.modules.homepage.ui.HomepageActivity
import com.tourpost.app.modules.homepageone.ui.HomepageOneActivity
import com.tourpost.app.modules.homepagetwo.`data`.model.ListlanguageOneRowModel
import com.tourpost.app.modules.homepagetwo.`data`.model.Listphoto160564948RowModel
import com.tourpost.app.modules.homepagetwo.`data`.viewmodel.HomepageTwoVM
import com.tourpost.app.modules.inbox.ui.InboxActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomepageTwoActivity : BaseActivity<ActivityHomepageTwoBinding>(R.layout.activity_homepage_two)
    {
  private val viewModel: HomepageTwoVM by viewModels<HomepageTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listphoto160564948Adapter =
    Listphoto160564948Adapter(viewModel.listphoto160564948List.value?:mutableListOf())
    binding.recyclerListphoto160564948.adapter = listphoto160564948Adapter
    listphoto160564948Adapter.setOnItemClickListener(
    object : Listphoto160564948Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listphoto160564948RowModel) {
        onClickRecyclerListphoto160564948(view, position, item)
      }
    }
    )
    viewModel.listphoto160564948List.observe(this) {
      listphoto160564948Adapter.updateData(it)
    }
    val listlanguageOneAdapter =
    ListlanguageOneAdapter(viewModel.listlanguageOneList.value?:mutableListOf())
    binding.recyclerListlanguageOne.adapter = listlanguageOneAdapter
    listlanguageOneAdapter.setOnItemClickListener(
    object : ListlanguageOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlanguageOneRowModel) {
        onClickRecyclerListlanguageOne(view, position, item)
      }
    }
    )
    viewModel.listlanguageOneList.observe(this) {
      listlanguageOneAdapter.updateData(it)
    }
    binding.homepageTwoVM = viewModel
    setUpSearchViewSearchbarListener()
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = HomepageActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnSendOne.setOnClickListener {
        val destIntent = HomepageOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnSend.setOnClickListener {
        val destIntent = InboxActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.linearColumnsendOne.setOnClickListener {
        val destIntent = HomepageOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.linearColumnsendTwo.setOnClickListener {
        val destIntent = HomepageOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.linearTabsbar.setOnClickListener {
        val destIntent = HomepageActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnSendTwo.setOnClickListener {
        val destIntent = HomepageOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    fun onClickRecyclerListphoto160564948(
      view: View,
      position: Int,
      item: Listphoto160564948RowModel
    ): Unit {
      when(view.id) {
      }
    }

    fun onClickRecyclerListlanguageOne(
      view: View,
      position: Int,
      item: ListlanguageOneRowModel
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
        const val TAG: String = "HOMEPAGE_TWO_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, HomepageTwoActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
