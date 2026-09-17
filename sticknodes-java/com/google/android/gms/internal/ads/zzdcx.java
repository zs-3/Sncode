package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdcx extends com.google.android.gms.internal.ads.zzddr implements com.google.android.gms.internal.ads.zzbio {
    public zzdcx(java.util.Set r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final synchronized void zzb(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdcw r0 = new com.google.android.gms.internal.ads.zzdcw     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lb
            r1.zzq(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
