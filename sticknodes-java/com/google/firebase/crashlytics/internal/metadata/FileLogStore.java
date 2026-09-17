package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes2.dex */
interface FileLogStore {
    void closeLogFile();

    void deleteLogFile();

    byte[] getLogAsBytes();

    java.lang.String getLogAsString();

    void writeToLog(long r1, java.lang.String r3);
}
