package com.tourpost.app.modules.homepageone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tourpost.app.R
import com.tourpost.app.databinding.RowListphoto160564949Binding
import com.tourpost.app.modules.homepageone.`data`.model.Listphoto160564949RowModel
import kotlin.Int
import kotlin.collections.List

class Listphoto160564948Adapter(
  var list: List<Listphoto160564949RowModel>
) : RecyclerView.Adapter<Listphoto160564948Adapter.RowListphoto160564949VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListphoto160564949VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listphoto160564949,parent,false)
    return RowListphoto160564949VH(view)
  }

  override fun onBindViewHolder(holder: RowListphoto160564949VH, position: Int) {
    val listphoto160564949RowModel = Listphoto160564949RowModel()
    // TODO uncomment following line after integration with data source
    // val listphoto160564949RowModel = list[position]
    holder.binding.listphoto160564949RowModel = listphoto160564949RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listphoto160564949RowModel>) {
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
      item: Listphoto160564949RowModel
    ) {
    }
  }

  inner class RowListphoto160564949VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListphoto160564949Binding = RowListphoto160564949Binding.bind(itemView)
  }
}
