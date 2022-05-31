package com.isllam.chat.utilities;

import java.util.HashMap;

public class Constants {
    public static final String KEY_COLLECTION_USERS = "users";
    public static final String KEY_NAME = "name";
    public static final String kEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PREFERENCE_NAME = "chatAppPreference";
    public static final String KEY_IS_SIGNED_IN = "isSignedIn";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_FCM_TOKEN = "fcmToken";
    public static final String KEY_USER = "user";
    public static final String KEY_COLLECTION_CHAT = "chat";
    public static final String KEY_SENDER_ID = "senderId";
    public static final String KEY_RECEIVER_ID = "receiverId";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_COLLECTION_CONVERSATION = "conversation";
    public static final String KEY_SENDER_NAME = "senderName";
    public static final String KEY_RECEIVER_NAME = "receiverName";
    public static final String KEY_RECEIVER_IMAGE = "receiverImage";
    public static final String KEY_SENDER_IMAGE = "senderImage";
    public static final String KEY_LAST_MESSAGE = "lastMessage";
    public static final String KEY_AVAILABILLITY = "availability";
    public static final String REMOTE_MSG_AUTH = "Authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE = "Content-Type";
    public static final String REMOTE_MSG_DATA = "data";
    public static final String REMOTE_MSG_REGISTRATION_IDS = "registration_ids";

    public static HashMap<String, String> remoteMsgHeaders = null;

    public static HashMap<String, String> getRemoteMsgHeaders() {
        if (remoteMsgHeaders == null) {
            remoteMsgHeaders = new HashMap<>();
            remoteMsgHeaders.put(
                    REMOTE_MSG_AUTH,
                    "key=AAAArFLVHZ8:APA91bGxa3YxUwpOXCH7dRIV_h_-1_w8XO1QAKUj3xxsnIUvKYp3-LvdX6xySnuQJSIi5TncexoZRGZzn23yVTaS7BYTLXCeQ6eTqUU2-rvJvuNVUiOYZ07hsQ44B_Om-b_aVkV1hAyI"
            );
            remoteMsgHeaders.put(REMOTE_MSG_CONTENT_TYPE, "application/json");
        }
        return remoteMsgHeaders;
    }


}
