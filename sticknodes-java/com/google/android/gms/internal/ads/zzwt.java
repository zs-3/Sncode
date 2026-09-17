package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzwt {
    private int zza;
    private final android.util.SparseArray zzb;
    private final com.google.android.gms.internal.ads.zzdn zzc;

    public zzwt() {
            r1 = this;
            com.google.android.gms.internal.ads.zzws r0 = new com.google.android.gms.internal.ads.zzws
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public zzwt(com.google.android.gms.internal.ads.zzdn r2) {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.zzb = r0
            r1.zzc = r2
            r2 = -1
            r1.zza = r2
            return
    }

    public final java.lang.Object zza(int r4) {
            r3 = this;
            int r0 = r3.zza
            r1 = -1
            if (r0 == r1) goto L6
            goto L9
        L6:
            r0 = 0
        L7:
            r3.zza = r0
        L9:
            int r0 = r3.zza
            if (r0 > 0) goto Le
            goto L1a
        Le:
            android.util.SparseArray r2 = r3.zzb
            int r0 = r2.keyAt(r0)
            if (r4 >= r0) goto L1a
            int r0 = r3.zza
            int r0 = r0 + r1
            goto L7
        L1a:
            int r0 = r3.zza
            android.util.SparseArray r2 = r3.zzb
            int r2 = r2.size()
            int r2 = r2 + r1
            if (r0 >= r2) goto L38
            android.util.SparseArray r0 = r3.zzb
            int r2 = r3.zza
            int r2 = r2 + 1
            int r0 = r0.keyAt(r2)
            if (r4 < r0) goto L38
            int r0 = r3.zza
            int r0 = r0 + 1
            r3.zza = r0
            goto L1a
        L38:
            android.util.SparseArray r4 = r3.zzb
            int r0 = r3.zza
            java.lang.Object r4 = r4.valueAt(r0)
            return r4
    }

    public final java.lang.Object zzb() {
            r2 = this;
            android.util.SparseArray r0 = r2.zzb
            int r0 = r0.size()
            int r0 = r0 + (-1)
            android.util.SparseArray r1 = r2.zzb
            java.lang.Object r0 = r1.valueAt(r0)
            return r0
    }

    public final void zzc(int r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.zza
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L17
            android.util.SparseArray r0 = r5.zzb
            int r0 = r0.size()
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r5.zza = r2
        L17:
            android.util.SparseArray r0 = r5.zzb
            int r0 = r0.size()
            if (r0 <= 0) goto L43
            android.util.SparseArray r0 = r5.zzb
            int r4 = r0.size()
            int r4 = r4 + r3
            int r0 = r0.keyAt(r4)
            if (r6 < r0) goto L2d
            goto L2e
        L2d:
            r1 = 0
        L2e:
            com.google.android.gms.internal.ads.zzdi.zzd(r1)
            if (r0 != r6) goto L43
            com.google.android.gms.internal.ads.zzdn r0 = r5.zzc
            android.util.SparseArray r1 = r5.zzb
            int r2 = r1.size()
            int r2 = r2 + r3
            java.lang.Object r1 = r1.valueAt(r2)
            r0.zza(r1)
        L43:
            android.util.SparseArray r0 = r5.zzb
            r0.append(r6, r7)
            return
    }

    public final void zzd() {
            r3 = this;
            r0 = 0
        L1:
            android.util.SparseArray r1 = r3.zzb
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            com.google.android.gms.internal.ads.zzdn r1 = r3.zzc
            android.util.SparseArray r2 = r3.zzb
            java.lang.Object r2 = r2.valueAt(r0)
            r1.zza(r2)
            int r0 = r0 + 1
            goto L1
        L17:
            r0 = -1
            r3.zza = r0
            android.util.SparseArray r0 = r3.zzb
            r0.clear()
            return
    }

    public final void zze(int r5) {
            r4 = this;
            r0 = 0
        L1:
            android.util.SparseArray r1 = r4.zzb
            int r1 = r1.size()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L2f
            android.util.SparseArray r1 = r4.zzb
            int r2 = r0 + 1
            int r1 = r1.keyAt(r2)
            if (r5 < r1) goto L2f
            com.google.android.gms.internal.ads.zzdn r1 = r4.zzc
            android.util.SparseArray r3 = r4.zzb
            java.lang.Object r3 = r3.valueAt(r0)
            r1.zza(r3)
            android.util.SparseArray r1 = r4.zzb
            r1.removeAt(r0)
            int r0 = r4.zza
            if (r0 <= 0) goto L2d
            int r0 = r0 + (-1)
            r4.zza = r0
        L2d:
            r0 = r2
            goto L1
        L2f:
            return
    }

    public final boolean zzf() {
            r1 = this;
            android.util.SparseArray r0 = r1.zzb
            int r0 = r0.size()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
