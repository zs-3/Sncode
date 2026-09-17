package com.google.firebase.crashlytics.internal;

/* loaded from: classes2.dex */
public interface NativeSessionFileProvider {
    java.io.File getAppFile();

    com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getApplicationExitInto();

    java.io.File getDeviceFile();

    java.io.File getMetadataFile();

    java.io.File getMinidumpFile();

    java.io.File getOsFile();

    java.io.File getSessionFile();
}
