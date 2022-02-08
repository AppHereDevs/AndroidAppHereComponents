package com.example.examplelibrary

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

// Created by Emre UYGUN on 8.02.2022
// Copyriht © Demiroren Teknoloji. All rights reserved.

class AppHereEditText(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0
) : AppCompatEditText(context, attributeSet, defStyle) {

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    init {
        this.setBackgroundColor(Color.BLACK)
        this.hint = "yusuf"
    }

//    init {
//        LayoutInflater.from(context).inflate(R.layout.app_here_edit_text, this, false)
//    }

}