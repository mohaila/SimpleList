package ca.qc.mtl.mohaila.simplelist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = RowAdapter(this)
    }

    companion object {
        val items = arrayOf(
            "I",
            "I am",
            "I'm",
            "You",
            "You are",
            "You're",
            "He",
            "He is",
            "He's",
            "She",
            "She is",
            "She's",
            "It",
            "It is",
            "It's",
            "I",
            "I am",
            "I'm",
            "You",
            "You are",
            "You're",
            "He",
            "He is",
            "He's",
            "She",
            "She is",
            "She's",
            "It",
            "It is",
            "It's"
        )
    }
}
