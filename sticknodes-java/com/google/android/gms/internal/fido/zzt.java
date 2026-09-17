package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzt implements com.google.android.gms.fido.u2f.U2fPendingIntent {
    private final android.app.PendingIntent zza;

    public zzt(android.app.PendingIntent r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.fido.u2f.U2fPendingIntent
    public final boolean hasPendingIntent() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zza
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.fido.u2f.U2fPendingIntent
    public final void launchPendingIntent(android.app.Activity r9, int r10) throws android.content.IntentSender.SendIntentException {
            r8 = this;
            android.app.PendingIntent r0 = r8.zza
            if (r0 == 0) goto L12
            android.content.IntentSender r2 = r0.getIntentSender()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r9
            r3 = r10
            r1.startIntentSenderForResult(r2, r3, r4, r5, r6, r7)
            return
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "No PendingIntent available"
            r9.<init>(r10)
            throw r9
    }
}
