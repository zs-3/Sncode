package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzerw {
    public final com.google.common.util.concurrent.ListenableFuture zza;
    private final long zzb;
    private final com.google.android.gms.common.util.Clock zzc;

    public zzerw(com.google.common.util.concurrent.ListenableFuture r3, long r4, com.google.android.gms.common.util.Clock r6) {
            r2 = this;
            r2.<init>()
            r2.zza = r3
            r2.zzc = r6
            long r0 = r6.elapsedRealtime()
            long r0 = r0 + r4
            r2.zzb = r0
            return
    }

    public final boolean zza() {
            r5 = this;
            com.google.android.gms.common.util.Clock r0 = r5.zzc
            long r1 = r5.zzb
            long r3 = r0.elapsedRealtime()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }
}
