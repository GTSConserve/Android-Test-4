package com.help.test

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import coil.size.Scale
import com.help.test.Model.GTS
import kotlinx.android.synthetic.main.item_card.view.*

class CustomAdapter(val data1: List<GTS>,val it: MainActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
        val layoutInflater = LayoutInflater.from(parent.context)

            return ViewHolder(layoutInflater.inflate(R.layout.item_card, parent, false))

    }

    override fun getItemCount(): Int {

        TODO("Not yet implemented")
        return  data1.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented" )

        (holder as ViewHolder).bind(data1.get(position));
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(get: GTS) {
            itemView.pcname.text = get.product_name
            if (get.eggless.equals("0")) {
                itemView.pcimage.load(R.drawable.veg) {
                    Scale.FIT
                }
            } else {
                itemView.pcimage.load(R.drawable.non_veg) {
                    Scale.FIT
                }
            }
            itemView.pcname.text = get.product_name
            itemView.regular.text = get.product_price.toString()
            itemView.pcimage.load(get.product_image) {
                Scale.FIT
            }

            itemView.saleprice.paintFlags =
                itemView.saleprice.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG
            itemView.saleprice.text = "₹ " + get.product_price

            itemView.cplus.setOnClickListener {
                val count: Int = itemView.ccountid.text.toString().toInt()
                itemView.ccountid.text = (count + 1).toString();

            }
            itemView.cmin.setOnClickListener {
                //    totalamount=(count-1)*(model.product_price.toFloat())
                val count: Int = itemView.ccountid.text.toString().toInt()
                if (count > 1) {
                    itemView.ccountid.text = (count - 1).toString();

                }
            }




        }

    }



}








