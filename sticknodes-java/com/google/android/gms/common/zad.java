package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@android.annotation.SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
final class zad extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zaa;
    private final android.content.Context zab;

    public zad(com.google.android.gms.common.GoogleApiAvailability r1, android.content.Context r2) {
            r0 = this;
            r0.zaa = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.zab = r1
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r3) {
            r2 = this;
            int r3 = r3.what
            r0 = 1
            if (r3 == r0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't know how to handle this message: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "GoogleApiAvailability"
            android.util.Log.w(r0, r3)
            return
        L1c:
            com.google.android.gms.common.GoogleApiAvailability r3 = r2.zaa
            android.content.Context r0 = r2.zab
            int r0 = r3.isGooglePlayServicesAvailable(r0)
            boolean r3 = r3.isUserResolvableError(r0)
            if (r3 == 0) goto L31
            com.google.android.gms.common.GoogleApiAvailability r3 = r2.zaa
            android.content.Context r1 = r2.zab
            r3.showErrorNotification(r1, r0)
        L31:
            return
    }
}
