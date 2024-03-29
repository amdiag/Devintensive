package ru.skillbranch.devintensive.models

import java.util.*

abstract class BaseMessage(
        val id: String,
        val from: User?,
        val chat: Chat,
        val isIncoming: Boolean = false,
        val date: Date = Date()
) {

    abstract fun formatMessage(): String
    companion object AbstractFactory{
        var lastId = -1
        fun makeMessage(from:User?, chat: Chat, date: Date=Date(),):BaseMessage {
            lastId++
            return
        }
    }
}