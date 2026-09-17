package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfqo {
    private final java.util.concurrent.BlockingQueue zza;
    private final java.util.concurrent.ThreadPoolExecutor zzb;
    private final java.util.ArrayDeque zzc;
    private com.google.android.gms.internal.ads.zzfqn zzd;

    public zzfqo() {
            r8 = this;
            r8.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r8.zzc = r0
            r0 = 0
            r8.zzd = r0
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            r8.zza = r7
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 1
            r3 = 1
            r4 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7)
            r8.zzb = r0
            return
    }

    private final void zzc() {
            r3 = this;
            java.util.ArrayDeque r0 = r3.zzc
            java.lang.Object r0 = r0.poll()
            com.google.android.gms.internal.ads.zzfqn r0 = (com.google.android.gms.internal.ads.zzfqn) r0
            r3.zzd = r0
            if (r0 == 0) goto L14
            java.util.concurrent.ThreadPoolExecutor r1 = r3.zzb
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.executeOnExecutor(r1, r2)
        L14:
            return
    }

    public final void zza(com.google.android.gms.internal.ads.zzfqn r1) {
            r0 = this;
            r1 = 0
            r0.zzd = r1
            r0.zzc()
            return
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfqn r2) {
            r1 = this;
            r2.zzb(r1)
            java.util.ArrayDeque r0 = r1.zzc
            r0.add(r2)
            com.google.android.gms.internal.ads.zzfqn r2 = r1.zzd
            if (r2 != 0) goto Lf
            r1.zzc()
        Lf:
            return
    }
}
