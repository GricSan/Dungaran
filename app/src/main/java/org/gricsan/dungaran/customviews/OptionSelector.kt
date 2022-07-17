package org.gricsan.dungaran.customviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import org.gricsan.dungaran.databinding.ViewOptionSelectorBinding

class OptionSelector @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = ViewOptionSelectorBinding.inflate(
        LayoutInflater.from(context), this, true
    )

}