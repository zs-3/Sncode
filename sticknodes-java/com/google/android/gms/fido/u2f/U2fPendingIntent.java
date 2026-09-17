package com.google.android.gms.fido.u2f;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface U2fPendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(android.app.Activity r1, int r2) throws android.content.IntentSender.SendIntentException;
}
