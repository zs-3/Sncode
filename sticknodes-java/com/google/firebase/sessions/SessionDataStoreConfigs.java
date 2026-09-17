package com.google.firebase.sessions;

/* compiled from: SessionDataStoreConfigs.kt */
/* loaded from: classes2.dex */
public final class SessionDataStoreConfigs {
    public static final com.google.firebase.sessions.SessionDataStoreConfigs INSTANCE = null;
    private static final java.lang.String PROCESS_NAME = null;
    private static final java.lang.String SESSIONS_CONFIG_NAME = null;
    private static final java.lang.String SETTINGS_CONFIG_NAME = null;

    static {
            com.google.firebase.sessions.SessionDataStoreConfigs r0 = new com.google.firebase.sessions.SessionDataStoreConfigs
            r0.<init>()
            com.google.firebase.sessions.SessionDataStoreConfigs.INSTANCE = r0
            com.google.firebase.sessions.ProcessDetailsProvider r0 = com.google.firebase.sessions.ProcessDetailsProvider.INSTANCE
            java.lang.String r0 = r0.getProcessName$com_google_firebase_firebase_sessions()
            byte[] r0 = kotlin.text.StringsKt.encodeToByteArray(r0)
            r1 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            com.google.firebase.sessions.SessionDataStoreConfigs.PROCESS_NAME = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "firebase_session_"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = "_data"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.google.firebase.sessions.SessionDataStoreConfigs.SESSIONS_CONFIG_NAME = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "_settings"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.firebase.sessions.SessionDataStoreConfigs.SETTINGS_CONFIG_NAME = r0
            return
    }

    private SessionDataStoreConfigs() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String getSESSIONS_CONFIG_NAME() {
            r1 = this;
            java.lang.String r0 = com.google.firebase.sessions.SessionDataStoreConfigs.SESSIONS_CONFIG_NAME
            return r0
    }

    public final java.lang.String getSETTINGS_CONFIG_NAME() {
            r1 = this;
            java.lang.String r0 = com.google.firebase.sessions.SessionDataStoreConfigs.SETTINGS_CONFIG_NAME
            return r0
    }
}
