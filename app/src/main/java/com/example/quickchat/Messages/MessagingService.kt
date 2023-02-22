package com.example.quickchat.Messages

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.google.firebase.messaging.ktx.remoteMessage

class MessagingService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        Log.d("FCM", "Refreshed token: $token")

        super.onNewToken(token)

    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        Log.d("FCM", "Message" + message.notification?.body)
    }
}