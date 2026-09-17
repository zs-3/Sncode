package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdgc extends com.google.android.gms.internal.ads.zzddr {
    public zzdgc(java.util.Set r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public final synchronized void zza() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdgb r0 = new com.google.android.gms.internal.ads.zzdgb     // Catch: java.lang.Throwable -> Lb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb
            r1.zzq(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
