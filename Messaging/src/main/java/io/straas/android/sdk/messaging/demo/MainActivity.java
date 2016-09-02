package io.straas.android.sdk.messaging.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import io.straas.android.sdk.base.credential.CredentialFailReason;
import io.straas.android.sdk.base.identity.Identity;
import io.straas.android.sdk.messaging.ChatMode;
import io.straas.android.sdk.messaging.ChatRoomManager;
import io.straas.android.sdk.messaging.Message;
import io.straas.android.sdk.messaging.MessagingError;
import io.straas.android.sdk.messaging.User;
import io.straas.android.sdk.messaging.interfaces.EventListener;
import io.straas.android.sdk.messaging.ui.ChatRoomView;
import io.straas.android.sdk.messaging.ui.interfaces.CredentialAuthorizeListener;
import io.straas.android.sdk.messaging.ui.interfaces.SendMessageListener;
import io.straas.android.sdk.messaging.ui.interfaces.SignInListener;

public class MainActivity extends AppCompatActivity {

    private static final String CHAT_ROOM_ID = "test_channel";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChatRoomView chatRoom = (ChatRoomView) findViewById(R.id.chat_room);
        chatRoom.setCredentialAuthorizeListener(mCredentialAuthorizeListener);
        chatRoom.setEventListener(mEventListener);
        chatRoom.setSendMessageListener(mSendMessageListener);
        chatRoom.setSignInListener(mSignInListener);

        //Before connecting to a chat room, developer have to fill some data.
        //See https://github.com/StraaS/StraaS-android-sdk-sample/wiki/SDK-Credential for more
        // information about initialization.
        //See https://github.com/StraaS/StraaS-android-sdk-sample/wiki/Messaging for more
        // information about StraaS Messaging SDK.
        Identity identity = new Identity("");
        chatRoom.connectChatRoom(CHAT_ROOM_ID, identity);
    }

    private CredentialAuthorizeListener mCredentialAuthorizeListener =
            new CredentialAuthorizeListener() {
                @Override
                public void onSuccess(ChatRoomManager chatRoomManager) {

                }

                @Override
                public void onFailure(CredentialFailReason credentialFailReason) {

                }
            };

    private EventListener mEventListener = new EventListener() {
        @Override
        public void onConnected() {

        }

        @Override
        public void onConnectFailed(MessagingError messagingError) {

        }

        @Override
        public void onError(MessagingError messagingError) {

        }

        @Override
        public void onDisconnected() {

        }

        @Override
        public void onChatWriteModeChanged(ChatMode chatMode) {

        }

        @Override
        public void onInputIntervalChanged(int i) {

        }

        @Override
        public void onMessageAdded(Message message) {

        }

        @Override
        public void onMessageRemoved(String s) {

        }

        @Override
        public void onMessageFlushed() {

        }

        @Override
        public void onUserJoined(User[] users) {

        }

        @Override
        public void onUserUpdated(User[] users) {

        }

        @Override
        public void onUserLeft(Integer[] integers) {

        }

        @Override
        public void userCount(int i, int i1) {

        }
    };

    private SendMessageListener mSendMessageListener = new SendMessageListener() {
        @Override
        public void onSuccess(Void aVoid) {

        }

        @Override
        public void onFailure(MessagingError messagingError) {

        }
    };

    private SignInListener mSignInListener = new SignInListener() {
        @Override
        public void signIn() {

        }
    };
}

