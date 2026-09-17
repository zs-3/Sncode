package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzawh extends android.content.BroadcastReceiver {
    private boolean zza;

    zzawh(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.zza = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.USER_PRESENT"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            r0.addAction(r1)
            r3.registerReceiver(r2, r0)
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            java.lang.String r2 = r3.getAction()
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L10
            r2 = 1
            r1.zza = r2
            return
        L10:
            java.lang.String r2 = r3.getAction()
            java.lang.String r3 = "android.intent.action.SCREEN_OFF"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 0
            r1.zza = r2
        L1f:
            return
    }

    final boolean zza() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }
}
