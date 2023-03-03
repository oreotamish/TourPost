package com.tourpost.app.modules.inbox.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.tourpost.app.R
import com.tourpost.app.appcomponents.base.BaseActivity
import com.tourpost.app.appcomponents.views.ImagePickerFragmentDialog
import com.tourpost.app.databinding.ActivityInboxBinding
import com.tourpost.app.modules.inbox.`data`.model.InboxRowModel
import com.tourpost.app.modules.inbox.`data`.viewmodel.InboxVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InboxActivity : BaseActivity<ActivityInboxBinding>(R.layout.activity_inbox) {
  private val viewModel: InboxVM by viewModels<InboxVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val inboxAdapter = InboxAdapter(viewModel.inboxList.value?:mutableListOf())
    binding.recyclerInbox.adapter = inboxAdapter
    inboxAdapter.setOnItemClickListener(
    object : InboxAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : InboxRowModel) {
        onClickRecyclerInbox(view, position, item)
      }
    }
    )
    viewModel.inboxList.observe(this) {
      inboxAdapter.updateData(it)
    }
    binding.inboxVM = viewModel
    setUpSearchViewSearchbarListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageCameraFive.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerInbox(
    view: View,
    position: Int,
    item: InboxRowModel
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
      const val TAG: String = "INBOX_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, InboxActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
