package com.tourpost.app.modules.homepagetwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tourpost.app.R
import com.tourpost.app.databinding.RowListphoto160564948Binding
import com.tourpost.app.modules.homepagetwo.`data`.model.Listphoto160564948RowModel
import kotlin.Int
import kotlin.collections.List

class Listphoto160564948Adapter(
  var list: List<Listphoto160564948RowModel>
) : RecyclerView.Adapter<Listphoto160564948Adapter.RowListphoto160564948VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListphoto160564948VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listphoto160564948,parent,false)
    return RowListphoto160564948VH(view)
  }

  override fun onBindViewHolder(holder: RowListphoto160564948VH, position: Int) {
    val listphoto160564948RowModel = Listphoto160564948RowModel()
    // TODO uncomment following line after integration with data source
    // val listphoto160564948RowModel = list[position]
    holder.binding.listphoto160564948RowModel = listphoto160564948RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listphoto160564948RowModel>) {
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
      item: Listphoto160564948RowModel
    ) {
    }
  }

  inner class RowListphoto160564948VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListphoto160564948Binding = RowListphoto160564948Binding.bind(itemView)
  }
}
