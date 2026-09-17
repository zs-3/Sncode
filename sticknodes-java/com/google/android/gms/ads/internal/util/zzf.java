package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzf extends com.google.android.gms.internal.ads.zzfun {
    public zzf(android.os.Looper r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r3) {
            r2 = this;
            super.handleMessage(r3)     // Catch: java.lang.Exception -> L4
            return
        L4:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "AdMobHandler.handleMessage"
            r0.zzw(r3, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfun
    protected final void zza(android.os.Message r2) {
            r1 = this;
            super.zza(r2)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r2 = move-exception
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            android.content.Context r0 = r0.zzd()
            com.google.android.gms.ads.internal.util.zzt.zzM(r0, r2)
            throw r2
    }
}
