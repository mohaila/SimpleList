package ca.qc.mtl.mohaila.simplelist

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class RowAdapter(private val activity: AppCompatActivity) : RecyclerView.Adapter<RowViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowViewHolder {
        return RowViewHolder(activity.layoutInflater.inflate(R.layout.row, parent, false))
    }

    override fun getItemCount(): Int {
        return MainActivity.items.count()
    }

    override fun onBindViewHolder(holder: RowViewHolder, position: Int) {
        holder.bind(MainActivity.items[position])
    }

}