package pl.patrykgoworowski.liftchart_common.extension

import android.graphics.RectF

fun RectF.updateBounds(
    left: Float = this.left,
    top: Float = this.top,
    right: Float = this.right,
    bottom: Float = this.bottom
) {
    set(left, top, right, bottom)
}

fun RectF.set(
    left: Number,
    top: Number,
    right: Number,
    bottom: Number
) {
    set(left.toFloat(), top.toFloat(), right.toFloat(), bottom.toFloat())
}

fun RectF.clear() {
    set(0, 0, 0, 0)
}

fun RectF.set(
    isLTR: Boolean,
    left: Number = this.left,
    top: Number = this.top,
    right: Number = this.right,
    bottom: Number = this.bottom,
) {
    set(
        if (isLTR) left.toFloat() else right.toFloat(),
        top.toFloat(),
        if (isLTR) right.toFloat() else left.toFloat(),
        bottom.toFloat()
    )
}

fun RectF.start(isLTR: Boolean): Float = if (isLTR) left else right

fun RectF.end(isLTR: Boolean): Float = if (isLTR) right else left