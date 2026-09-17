package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzyx {
    private final java.util.concurrent.CopyOnWriteArrayList zza;

    public zzyx() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.zza = r0
            return
    }

    public final void zza(android.os.Handler r2, com.google.android.gms.internal.ads.zzyy r3) {
            r1 = this;
            r1.zzc(r3)
            com.google.android.gms.internal.ads.zzyw r0 = new com.google.android.gms.internal.ads.zzyw
            r0.<init>(r2, r3)
            java.util.concurrent.CopyOnWriteArrayList r2 = r1.zza
            r2.add(r0)
            return
    }

    public final void zzb(int r11, long r12, long r14) {
            r10 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r10.zza
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.google.android.gms.internal.ads.zzyw r3 = (com.google.android.gms.internal.ads.zzyw) r3
            boolean r1 = com.google.android.gms.internal.ads.zzyw.zzd(r3)
            if (r1 != 0) goto L6
            android.os.Handler r1 = com.google.android.gms.internal.ads.zzyw.zza(r3)
            com.google.android.gms.internal.ads.zzyv r9 = new com.google.android.gms.internal.ads.zzyv
            r2 = r9
            r4 = r11
            r5 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r7)
            r1.post(r9)
            goto L6
        L2a:
            return
    }

    public final void zzc(com.google.android.gms.internal.ads.zzyy r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.zza
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzyw r1 = (com.google.android.gms.internal.ads.zzyw) r1
            com.google.android.gms.internal.ads.zzyy r2 = com.google.android.gms.internal.ads.zzyw.zzb(r1)
            if (r2 != r4) goto L6
            r1.zzc()
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.zza
            r2.remove(r1)
            goto L6
        L21:
            return
    }
}
