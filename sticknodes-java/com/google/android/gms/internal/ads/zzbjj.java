package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbjj implements com.google.android.gms.internal.ads.zzbjw {
    zzbjj() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r2, java.util.Map r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r2 = (com.google.android.gms.internal.ads.zzcfo) r2
            java.lang.String r0 = "enabled"
            java.lang.Object r3 = r3.get(r0)     // Catch: java.io.IOException -> L2c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.io.IOException -> L2c
            java.lang.String r0 = "true"
            boolean r0 = com.google.android.gms.internal.ads.zzfxi.zzc(r0, r3)     // Catch: java.io.IOException -> L2c
            if (r0 != 0) goto L1c
            java.lang.String r0 = "false"
            boolean r0 = com.google.android.gms.internal.ads.zzfxi.zzc(r0, r3)     // Catch: java.io.IOException -> L2c
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            return
        L1c:
            android.content.Context r2 = r2.getContext()     // Catch: java.io.IOException -> L2c
            com.google.android.gms.internal.ads.zzfuv r2 = com.google.android.gms.internal.ads.zzfuv.zzi(r2)     // Catch: java.io.IOException -> L2c
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch: java.io.IOException -> L2c
            r2.zzm(r3)     // Catch: java.io.IOException -> L2c
            return
        L2c:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled"
            r3.zzw(r2, r0)
            return
    }
}
