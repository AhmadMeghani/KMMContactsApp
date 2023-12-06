package org.example.project.contacts.domain

import contacts.domain.Contact
import kotlinx.coroutines.flow.Flow

interface ContactDataSource {
    fun getContacts(): Flow<List<Contact>>
    fun getRecentContacts(amount:Long): Flow<List<Contact>>
    suspend fun insertContact(contact: Contact)
    suspend fun deleteContact(id: Long)
}