package com.tourpost.app.modules.homepageone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.tourpost.app.R
import com.tourpost.app.appcomponents.base.BaseActivity
import com.tourpost.app.appcomponents.views.ImagePickerFragmentDialog
import com.tourpost.app.databinding.ActivityHomepageOneBinding
import com.tourpost.app.modules.homepage.ui.HomepageActivity
import com.tourpost.app.modules.homepageone.`data`.model.ListlanguageOne1RowModel
import com.tourpost.app.modules.homepageone.`data`.model.Listphoto160564949RowModel
import com.tourpost.app.modules.homepageone.`data`.viewmodel.HomepageOneVM
import com.tourpost.app.modules.homepagetwo.ui.HomepageTwoActivity
import com.tourpost.app.modules.inbox.ui.InboxActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomepageOneActivity : BaseActivity<ActivityHomepageOneBinding>(R.layout.activity_homepage_one)
    {
  private val viewModel: HomepageOneVM by viewModels<HomepageOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listphoto160564948Adapter =
    Listphoto160564948Adapter(viewModel.listphoto160564948List.value?:mutableListOf())
    binding.recyclerListphoto160564948.adapter = listphoto160564948Adapter
    listphoto160564948Adapter.setOnItemClickListener(
    object : Listphoto160564948Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listphoto160564949RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : ListlanguageOne1RowModel) {
        onClickRecyclerListlanguageOne(view, position, item)
      }
    }
    )
    viewModel.listlanguageOneList.observe(this) {
      listlanguageOneAdapter.updateData(it)
    }
    binding.homepageOneVM = viewModel
    setUpSearchViewSearchbarListener()
  }

  override fun setUpClicks(): Unit {


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.linearTabsbar.setOnClickListener {
      val destIntent = HomepageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSendOne.setOnClickListener {
      val destIntent = HomepageTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSend.setOnClickListener {
      val destIntent = InboxActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListphoto160564948(
    view: View,
    position: Int,
    item: Listphoto160564949RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListlanguageOne(
    view: View,
    position: Int,
    item: ListlanguageOne1RowModel
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
      const val TAG: String = "HOMEPAGE_ONE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomepageOneActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
