package com.eltec.my_first_library

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast

class ExampleLibrary @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0,

) : LinearLayout(context, attrs, defStyle, defStyleRes){

    init {
        LayoutInflater.from(context).inflate(R.layout.component_btn, this, true)
        val btn = findViewById<ImageButton>(R.id.btn_proof)
        btn.setOnClickListener{Toast.makeText(context, "es un ajemplo", Toast.LENGTH_SHORT).show()}
    }
}