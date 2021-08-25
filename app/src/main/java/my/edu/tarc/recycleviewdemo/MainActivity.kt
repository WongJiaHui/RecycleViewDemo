package my.edu.tarc.recycleviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import my.edu.tarc.recycleviewdemo.data.MyAdapter
import my.edu.tarc.recycleviewdemo.data.Product

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = listOf<Product>(
            Product("Pen", 2.50, R.drawable.ic_baseline_email_24),
            Product("Book", 12.50, R.drawable.ic_baseline_email_24),
            Product("Laptop", 12.50, R.drawable.ic_baseline_dvr_24),
            Product("Computer", 1999.00, R.drawable.ic_baseline_email_24),
            Product("Bag", 90.50,  R.drawable.ic_baseline_dvr_24),
            Product("Smartphone", 700.00, R.drawable.ic_baseline_dvr_24)

        )

        // Put List into Adapter
        val recycleView: RecyclerView = findViewById(R.id.productRecycleView)
        recycleView.adapter = MyAdapter(productList)
        recycleView.setHasFixedSize(true)


    }
}