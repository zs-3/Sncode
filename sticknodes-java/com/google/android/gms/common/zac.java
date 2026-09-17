package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zac implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.app.Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ androidx.activity.result.ActivityResultLauncher zac;
    final /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zad;

    zac(com.google.android.gms.common.GoogleApiAvailability r1, android.app.Activity r2, int r3, androidx.activity.result.ActivityResultLauncher r4) {
            r0 = this;
            r0.zad = r1
            r0.zaa = r2
            r0.zab = r3
            r0.zac = r4
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r3, int r4) {
            r2 = this;
            r3.dismiss()
            com.google.android.gms.common.GoogleApiAvailability r3 = r2.zad
            android.app.Activity r4 = r2.zaa
            int r0 = r2.zab
            r1 = 0
            android.app.PendingIntent r3 = r3.getErrorResolutionPendingIntent(r4, r0, r1)
            if (r3 != 0) goto L11
            return
        L11:
            androidx.activity.result.IntentSenderRequest$Builder r4 = new androidx.activity.result.IntentSenderRequest$Builder
            android.content.IntentSender r3 = r3.getIntentSender()
            r4.<init>(r3)
            androidx.activity.result.IntentSenderRequest r3 = r4.build()
            androidx.activity.result.ActivityResultLauncher r4 = r2.zac
            r4.launch(r3)
            return
    }
}
