package org.example.project.contacts.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import contacts.domain.Contact
import contacts.presentation.ContactListEvent
import contacts.presentation.ContactListState
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ContactsListViewModel : ViewModel() {

    private val _state = MutableStateFlow(
        ContactListState(
            contacts = contacts
        )
    )
    val state = _state.asStateFlow()

    var newContact: Contact? by mutableStateOf(null)
        private set

    fun onEvent(event: ContactListEvent) {

    }
}

private val contacts = (1..50).map {
    Contact(
        it.toLong(),
        "First $it",
        "Last $it",
        "email@email${it}.com",
        "01212323223",
        null
    )
}