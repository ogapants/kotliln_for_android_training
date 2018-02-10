package com.example.shou.kotlin_training

import android.view.View

open class NextViewModel(private val presenter: NextPresenter) {
    val textString = "viewModel text"
    val buttonString = "back"

    open fun onClick(view: View) {
        presenter.onFinish()
    }
}
