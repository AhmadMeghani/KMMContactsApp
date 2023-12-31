package org.example.project.contacts.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import contacts.domain.Contact

@Composable
fun ContactListItem(
    contact: Contact,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.clickable {  },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        ContactPhoto(contact, modifier = Modifier.size(50.dp))
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = "${contact.firstName} ${contact.lastName}",
        modifier = Modifier.weight(1f))
    }
}