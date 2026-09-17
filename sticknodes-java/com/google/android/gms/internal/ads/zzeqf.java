package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeqf {
    private final java.util.concurrent.atomic.AtomicBoolean zza;
    private com.google.android.gms.internal.ads.zzeqe zzb;

    public zzeqf() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.zza = r0
            return
    }

    final com.google.android.gms.internal.ads.zzeqe zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzeqe r0 = r1.zzb
            return r0
    }

    final void zzb(com.google.android.gms.internal.ads.zzeqe r1) {
            r0 = this;
            r0.zzb = r1
            return
    }

    public final void zzc(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.zza
            r0 = 1
            r2.set(r0)
            return
    }

    public final boolean zzd() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zza
            boolean r0 = r0.get()
            return r0
    }
}
