package dev.bdon.engine.sprite

import dev.bdon.engine.graphics.Graphics
import java.awt.Graphics2D

abstract class Sprite {

    var x: Int = 0
    var y: Int = 0
    var hidden: Boolean = false

    fun move(x: Int, y: Int) {
        this.x += x
        this.y += y
    }

    fun draw(g: Graphics) {
        if (!hidden) {
            render(g)
        }
    }

    protected abstract fun render(g: Graphics)
}