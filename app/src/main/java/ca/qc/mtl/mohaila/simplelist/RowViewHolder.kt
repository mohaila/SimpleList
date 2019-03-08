package ca.qc.mtl.mohaila.simplelist

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class RowViewHolder(row: View) : RecyclerView.ViewHolder(row), View.OnClickListener {
    override fun onClick(view: View?) {
        Toast.makeText(view!!.context,"Row Clicked", Toast.LENGTH_SHORT).show()
    }

    init {
        row.setOnClickListener(this)
    }

    val title by lazy {
        row.findViewById<TextView>(R.id.title)
    }

    val label by lazy {
        row.findViewById<TextView>(R.id.label)
    }

    val icon by lazy {
        row.findViewById<ImageView>(R.id.icon)
    }

    fun bind(text: String) {
        title.text = text
        label.setText(R.string.label_text)

        if (text.count() % 2 == 0)
            icon.setImageResource(R.drawable.applegreen)
        else
            icon.setImageResource(R.drawable.applered)
    }
}