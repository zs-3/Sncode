package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzem implements com.google.android.gms.internal.ads.zzdj {
    protected zzem() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final long zza() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final long zzb() {
            r2 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final long zzc() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final com.google.android.gms.internal.ads.zzdt zzd(android.os.Looper r3, android.os.Handler.Callback r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzep r0 = new com.google.android.gms.internal.ads.zzep
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r3, r4)
            r0.<init>(r1)
            return r0
    }
}
