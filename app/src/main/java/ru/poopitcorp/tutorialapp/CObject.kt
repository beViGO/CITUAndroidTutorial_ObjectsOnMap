package ru.poopitcorp.tutorialapp

import android.widget.SimpleCursorAdapter

class CObject(var name: String, var description: String) {
    var comments = mutableListOf<String>()

    override fun toString(): String {
        return "$name :: $description"
    }
}