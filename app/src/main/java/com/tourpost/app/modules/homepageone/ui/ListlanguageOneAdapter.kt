package com.tourpost.app.modules.homepageone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tourpost.app.R
import com.tourpost.app.databinding.RowListlanguageOne1Binding
import com.tourpost.app.modules.homepageone.`data`.model.ListlanguageOne1RowModel
import kotlin.Int
import kotlin.collections.List

class ListlanguageOneAdapter(
  var list: List<ListlanguageOne1RowModel>
) : RecyclerView.Adapter<ListlanguageOneAdapter.RowListlanguageOne1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlanguageOne1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlanguage_one1,parent,false)
    return RowListlanguageOne1VH(view)
  }

  override fun onBindViewHolder(holder: RowListlanguageOne1VH, position: Int) {
    val listlanguageOne1RowModel = ListlanguageOne1RowModel()
    // TODO uncomment following line after integration with data source
    // val listlanguageOne1RowModel = list[position]
    holder.binding.listlanguageOne1RowModel = listlanguageOne1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlanguageOne1RowModel>) {
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
      item: ListlanguageOne1RowModel
    ) {
    }
  }

  inner class RowListlanguageOne1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlanguageOne1Binding = RowListlanguageOne1Binding.bind(itemView)
  }
}
