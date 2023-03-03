package com.tourpost.app.modules.inbox.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tourpost.app.R
import com.tourpost.app.databinding.RowInboxBinding
import com.tourpost.app.modules.inbox.`data`.model.InboxRowModel
import kotlin.Int
import kotlin.collections.List

class InboxAdapter(
  var list: List<InboxRowModel>
) : RecyclerView.Adapter<InboxAdapter.RowInboxVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowInboxVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_inbox,parent,false)
    return RowInboxVH(view)
  }

  override fun onBindViewHolder(holder: RowInboxVH, position: Int) {
    val inboxRowModel = InboxRowModel()
    // TODO uncomment following line after integration with data source
    // val inboxRowModel = list[position]
    holder.binding.inboxRowModel = inboxRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<InboxRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: InboxRowModel
    ) {
    }
  }

  inner class RowInboxVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowInboxBinding = RowInboxBinding.bind(itemView)
  }
}
