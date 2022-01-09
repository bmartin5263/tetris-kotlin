package dev.bdon.engine.events

import dev.bdon.engine.entity.Entity

class Timer(
    val entity: Entity,
    val executeAt: Long,
    private val fn: Entity.(Timer) -> Unit
): Comparable<Timer> {

    fun execute() {
        entity.fn(this)
    }

    override fun compareTo(other: Timer) = this.executeAt.compareTo(other.executeAt)
}