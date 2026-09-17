package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzvh {
    public final int zza;
    public final com.google.android.gms.internal.ads.zzuy zzb;
    private final java.util.concurrent.CopyOnWriteArrayList zzc;

    public zzvh() {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            r3.<init>(r0, r1, r2)
            return
    }

    private zzvh(java.util.concurrent.CopyOnWriteArrayList r1, int r2, com.google.android.gms.internal.ads.zzuy r3) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r1 = 0
            r0.zza = r1
            r0.zzb = r3
            return
    }

    public final com.google.android.gms.internal.ads.zzvh zza(int r3, com.google.android.gms.internal.ads.zzuy r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzvh r3 = new com.google.android.gms.internal.ads.zzvh
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.zzc
            r1 = 0
            r3.<init>(r0, r1, r4)
            return r3
    }

    public final void zzb(android.os.Handler r2, com.google.android.gms.internal.ads.zzvi r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzvg r0 = new com.google.android.gms.internal.ads.zzvg
            r0.<init>(r2, r3)
            java.util.concurrent.CopyOnWriteArrayList r2 = r1.zzc
            r2.add(r0)
            return
    }

    public final void zzc(com.google.android.gms.internal.ads.zzuu r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.zzc
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzvg r1 = (com.google.android.gms.internal.ads.zzvg) r1
            com.google.android.gms.internal.ads.zzvi r2 = r1.zzb
            android.os.Handler r1 = r1.zza
            com.google.android.gms.internal.ads.zzvb r3 = new com.google.android.gms.internal.ads.zzvb
            r3.<init>(r4, r2, r5)
            com.google.android.gms.internal.ads.zzeu.zzM(r1, r3)
            goto L6
        L1f:
            return
    }

    public final void zzd(com.google.android.gms.internal.ads.zzup r5, com.google.android.gms.internal.ads.zzuu r6) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.zzc
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzvg r1 = (com.google.android.gms.internal.ads.zzvg) r1
            com.google.android.gms.internal.ads.zzvi r2 = r1.zzb
            android.os.Handler r1 = r1.zza
            com.google.android.gms.internal.ads.zzvf r3 = new com.google.android.gms.internal.ads.zzvf
            r3.<init>(r4, r2, r5, r6)
            com.google.android.gms.internal.ads.zzeu.zzM(r1, r3)
            goto L6
        L1f:
            return
    }

    public final void zze(com.google.android.gms.internal.ads.zzup r5, com.google.android.gms.internal.ads.zzuu r6) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.zzc
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzvg r1 = (com.google.android.gms.internal.ads.zzvg) r1
            com.google.android.gms.internal.ads.zzvi r2 = r1.zzb
            android.os.Handler r1 = r1.zza
            com.google.android.gms.internal.ads.zzvd r3 = new com.google.android.gms.internal.ads.zzvd
            r3.<init>(r4, r2, r5, r6)
            com.google.android.gms.internal.ads.zzeu.zzM(r1, r3)
            goto L6
        L1f:
            return
    }

    public final void zzf(com.google.android.gms.internal.ads.zzup r11, com.google.android.gms.internal.ads.zzuu r12, java.io.IOException r13, boolean r14) {
            r10 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r10.zzc
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzvg r1 = (com.google.android.gms.internal.ads.zzvg) r1
            com.google.android.gms.internal.ads.zzvi r4 = r1.zzb
            android.os.Handler r1 = r1.zza
            com.google.android.gms.internal.ads.zzve r9 = new com.google.android.gms.internal.ads.zzve
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.ads.zzeu.zzM(r1, r9)
            goto L6
        L25:
            return
    }

    public final void zzg(com.google.android.gms.internal.ads.zzup r5, com.google.android.gms.internal.ads.zzuu r6) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.zzc
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzvg r1 = (com.google.android.gms.internal.ads.zzvg) r1
            com.google.android.gms.internal.ads.zzvi r2 = r1.zzb
            android.os.Handler r1 = r1.zza
            com.google.android.gms.internal.ads.zzvc r3 = new com.google.android.gms.internal.ads.zzvc
            r3.<init>(r4, r2, r5, r6)
            com.google.android.gms.internal.ads.zzeu.zzM(r1, r3)
            goto L6
        L1f:
            return
    }

    public final void zzh(com.google.android.gms.internal.ads.zzvi r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.zzc
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzvg r1 = (com.google.android.gms.internal.ads.zzvg) r1
            com.google.android.gms.internal.ads.zzvi r2 = r1.zzb
            if (r2 != r4) goto L6
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.zzc
            r2.remove(r1)
            goto L6
        L1c:
            return
    }
}
