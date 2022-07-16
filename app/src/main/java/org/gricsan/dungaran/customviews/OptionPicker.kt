package org.gricsan.dungaran.customviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import org.gricsan.dungaran.R
import org.gricsan.dungaran.databinding.ViewOptionPickerBinding

class OptionPicker @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = ViewOptionPickerBinding.inflate(
        LayoutInflater.from(context), this, true
    )


    init {
        val attrsArray = context.theme.obtainStyledAttributes(
            attrs, R.styleable.OptionPicker, 0, 0
        )

        binding.tvOptionTitle.text = attrsArray.getString(R.styleable.OptionPicker_option_title_text)
    }

}