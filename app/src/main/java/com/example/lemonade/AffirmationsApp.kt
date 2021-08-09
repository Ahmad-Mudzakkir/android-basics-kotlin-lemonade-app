package com.example.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lemonade.adapter.ItemAdapter
import com.example.lemonade.data.Datasource
import com.example.lemonade.databinding.ActivityAffirmationsAppBinding

class AffirmationsApp : AppCompatActivity() {

    private lateinit var binding: ActivityAffirmationsAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAffirmationsAppBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        val textView: TextView = binding.textView

//        textView.text = Datasource().loadAffirmations().size.toString()

        // Initialize data.
        // Create an instance of Datasource, and call the loadAffirmations() method on it.
        // Store the returned list of affirmations in a val named myDataset
        val myDataset = Datasource().loadAffirmations()

        // Create a variable called recyclerView and use findViewById()
        // to find a reference to the RecyclerView within the layout.
        // val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val recyclerView = binding.recyclerView

        //To tell the recyclerView to use the ItemAdapter class you created, create a new ItemAdapter instance.
        // ItemAdapter expects two parameters: the context (this) of this activity, and the affirmations in myDataset.
        recyclerView.adapter = ItemAdapter(this, myDataset)


        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)



    }

}