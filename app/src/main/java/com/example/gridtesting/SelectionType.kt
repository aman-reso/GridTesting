package com.example.gridtesting

import androidx.annotation.IntDef


const val SINGLE = 0
const val MULTIPLE = 1

@IntDef(SINGLE, MULTIPLE)
@Retention(AnnotationRetention.SOURCE)
annotation class SelectionType