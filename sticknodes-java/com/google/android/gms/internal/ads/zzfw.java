package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfw {
    private final com.google.android.gms.internal.ads.zzfu zza;
    private final java.util.concurrent.atomic.AtomicLong zzb;
    private final java.util.ArrayDeque zzc;
    private final java.util.PriorityQueue zzd;
    private int zze;

    public zzfw(com.google.android.gms.internal.ads.zzfu r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.zzb = r0
            r1.zza = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.zzc = r2
            java.util.PriorityQueue r2 = new java.util.PriorityQueue
            r2.<init>()
            r1.zzd = r2
            r2 = -1
            r1.zze = r2
            return
    }

    private final void zze(int r6) {
            r5 = this;
        L0:
            java.util.PriorityQueue r0 = r5.zzd
            int r0 = r0.size()
            if (r0 <= r6) goto L25
            java.util.PriorityQueue r0 = r5.zzd
            java.lang.Object r0 = r0.poll()
            com.google.android.gms.internal.ads.zzfv r0 = (com.google.android.gms.internal.ads.zzfv) r0
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzfu r1 = r5.zza
            long r2 = com.google.android.gms.internal.ads.zzfv.zza(r0)
            com.google.android.gms.internal.ads.zzek r4 = com.google.android.gms.internal.ads.zzfv.zzb(r0)
            r1.zza(r2, r4)
            java.util.ArrayDeque r1 = r5.zzc
            r1.push(r0)
            goto L0
        L25:
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    public final void zzb(long r9, com.google.android.gms.internal.ads.zzek r11) {
            r8 = this;
            int r0 = r8.zze
            if (r0 == 0) goto L53
            r1 = -1
            if (r0 == r1) goto L24
            java.util.PriorityQueue r0 = r8.zzd
            int r0 = r0.size()
            int r2 = r8.zze
            if (r0 < r2) goto L24
            java.util.PriorityQueue r0 = r8.zzd
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzfv r0 = (com.google.android.gms.internal.ads.zzfv) r0
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            long r2 = com.google.android.gms.internal.ads.zzfv.zza(r0)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L24
            goto L53
        L24:
            java.util.ArrayDeque r0 = r8.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzfv r0 = new com.google.android.gms.internal.ads.zzfv
            r0.<init>()
            goto L3a
        L32:
            java.util.ArrayDeque r0 = r8.zzc
            java.lang.Object r0 = r0.poll()
            com.google.android.gms.internal.ads.zzfv r0 = (com.google.android.gms.internal.ads.zzfv) r0
        L3a:
            java.util.concurrent.atomic.AtomicLong r2 = r8.zzb
            long r5 = r2.getAndIncrement()
            r2 = r0
            r3 = r9
            r7 = r11
            r2.zzc(r3, r5, r7)
            java.util.PriorityQueue r9 = r8.zzd
            r9.add(r0)
            int r9 = r8.zze
            if (r9 == r1) goto L52
            r8.zze(r9)
        L52:
            return
        L53:
            com.google.android.gms.internal.ads.zzfu r0 = r8.zza
            r0.zza(r9, r11)
            return
    }

    public final void zzc() {
            r1 = this;
            r0 = 0
            r1.zze(r0)
            return
    }

    public final void zzd(int r2) {
            r1 = this;
            if (r2 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r1.zze = r2
            r1.zze(r2)
            return
    }
}
