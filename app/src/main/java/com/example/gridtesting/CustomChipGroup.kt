package com.example.gridtesting

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class CustomChipGroup : ChipGroup {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
    @SelectionType
    public var selectionType: Int = SINGLE
        set(value) {
            if (value != SINGLE && value != MULTIPLE) {
                throw IllegalArgumentException("Invalid selection type")
            }
            field = value
        }

    fun setChips(chipList: List<String>) {
        removeAllViews()
        for (chip in chipList) {
            val chipView = Chip(context)
            chipView.text = chip
            addView(chipView)
        }
    }
}