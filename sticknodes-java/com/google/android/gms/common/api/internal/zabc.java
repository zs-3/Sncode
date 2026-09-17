package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zabc extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabe zaa;

    zabc(com.google.android.gms.common.api.internal.zabe r1, android.os.Looper r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r3) {
            r2 = this;
            int r3 = r3.what
            r0 = 1
            if (r3 == r0) goto L25
            r0 = 2
            if (r3 == r0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown message id: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "GoogleApiClientImpl"
            android.util.Log.w(r0, r3)
            return
        L1f:
            com.google.android.gms.common.api.internal.zabe r3 = r2.zaa
            com.google.android.gms.common.api.internal.zabe.zai(r3)
            return
        L25:
            com.google.android.gms.common.api.internal.zabe r3 = r2.zaa
            com.google.android.gms.common.api.internal.zabe.zaj(r3)
            return
    }
}
