package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcfe {
    private final java.util.concurrent.atomic.AtomicBoolean zza;

    public zzcfe(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r2.<init>(r0)
            r1.zza = r2
            return
    }

    public final void zza() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zza
            r1 = 0
            r0.set(r1)
            return
    }

    public final void zzb() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zza
            r1 = 1
            r0.set(r1)
            return
    }

    public final void zzc() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zza
            r1 = 0
            r0.set(r1)
            return
    }

    public final boolean zzd() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zza
            boolean r0 = r0.get()
            return r0
    }
}
