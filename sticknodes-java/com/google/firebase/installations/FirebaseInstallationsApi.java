package com.google.firebase.installations;

/* loaded from: classes2.dex */
public interface FirebaseInstallationsApi {
    com.google.android.gms.tasks.Task<java.lang.String> getId();

    com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> getToken(boolean r1);
}
