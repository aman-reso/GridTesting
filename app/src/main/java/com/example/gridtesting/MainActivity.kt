package com.example.gridtesting

import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.flexbox.*
import com.google.android.flexbox.JustifyContent.CENTER


class MainActivity : AppCompatActivity() {
    private var customChipGroup: CustomChipGroup? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        customChipGroup = findViewById(R.id.customChipGroup)
        customChipGroup?.setChips(arrayListOf("aman", "kumar"))
    }


}