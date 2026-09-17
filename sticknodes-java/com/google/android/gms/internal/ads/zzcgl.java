package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcgl implements com.google.android.gms.internal.ads.zzbjw {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcgn zza;

    zzcgl(com.google.android.gms.internal.ads.zzcgn r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r3, java.util.Map r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcfo r3 = (com.google.android.gms.internal.ads.zzcfo) r3
            if (r4 == 0) goto L34
            java.lang.String r3 = "height"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L34
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L2e
            com.google.android.gms.internal.ads.zzcgn r4 = r2.zza     // Catch: java.lang.Exception -> L2e
            monitor-enter(r4)     // Catch: java.lang.Exception -> L2e
            com.google.android.gms.internal.ads.zzcgn r0 = r2.zza     // Catch: java.lang.Throwable -> L2b
            int r1 = com.google.android.gms.internal.ads.zzcgn.zzaI(r0)     // Catch: java.lang.Throwable -> L2b
            if (r1 == r3) goto L29
            com.google.android.gms.internal.ads.zzcgn.zzaQ(r0, r3)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzcgn r3 = r2.zza     // Catch: java.lang.Throwable -> L2b
            r3.requestLayout()     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r3     // Catch: java.lang.Exception -> L2e
        L2e:
            r3 = move-exception
            java.lang.String r4 = "Exception occurred while getting webview content height"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r4, r3)
        L34:
            return
    }
}
