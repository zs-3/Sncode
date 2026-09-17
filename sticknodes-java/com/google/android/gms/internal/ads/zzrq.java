package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzrq {
    public final int zza;
    public final com.google.android.gms.internal.ads.zzuy zzb;
    private final java.util.concurrent.CopyOnWriteArrayList zzc;

    public zzrq() {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            r3.<init>(r0, r1, r2)
            return
    }

    private zzrq(java.util.concurrent.CopyOnWriteArrayList r1, int r2, com.google.android.gms.internal.ads.zzuy r3) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r1 = 0
            r0.zza = r1
            r0.zzb = r3
            return
    }

    public final com.google.android.gms.internal.ads.zzrq zza(int r3, com.google.android.gms.internal.ads.zzuy r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzrq r3 = new com.google.android.gms.internal.ads.zzrq
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.zzc
            r1 = 0
            r3.<init>(r0, r1, r4)
            return r3
    }

    public final void zzb(android.os.Handler r2, com.google.android.gms.internal.ads.zzrr r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzrp r0 = new com.google.android.gms.internal.ads.zzrp
            r0.<init>(r2, r3)
            java.util.concurrent.CopyOnWriteArrayList r2 = r1.zzc
            r2.add(r0)
            return
    }

    public final void zzc(com.google.android.gms.internal.ads.zzrr r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.zzc
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzrp r1 = (com.google.android.gms.internal.ads.zzrp) r1
            com.google.android.gms.internal.ads.zzrr r2 = r1.zza
            if (r2 != r4) goto L6
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.zzc
            r2.remove(r1)
            goto L6
        L1c:
            return
    }
}
