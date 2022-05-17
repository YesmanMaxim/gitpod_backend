package backend.gitpod.service

import java.util.concurrent.atomic.AtomicLong

object ValueService {
    private var value: AtomicLong = AtomicLong(0)
    fun get(): Long = value.get()
    fun increment(): Long = value.incrementAndGet()
}
