package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzab {
    private final android.util.SparseBooleanArray zza;

    /* synthetic */ zzab(android.util.SparseBooleanArray r1, com.google.android.gms.internal.ads.zzaa r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.gms.internal.ads.zzab
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzab r6 = (com.google.android.gms.internal.ads.zzab) r6
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r3 = 24
            if (r1 >= r3) goto L39
            android.util.SparseBooleanArray r1 = r5.zza
            android.util.SparseBooleanArray r3 = r6.zza
            int r1 = r1.size()
            int r3 = r3.size()
            if (r1 != r3) goto L38
            r1 = 0
        L21:
            android.util.SparseBooleanArray r3 = r5.zza
            int r3 = r3.size()
            if (r1 >= r3) goto L37
            int r3 = r5.zza(r1)
            int r4 = r6.zza(r1)
            if (r3 == r4) goto L34
            return r2
        L34:
            int r1 = r1 + 1
            goto L21
        L37:
            return r0
        L38:
            return r2
        L39:
            android.util.SparseBooleanArray r0 = r5.zza
            android.util.SparseBooleanArray r6 = r6.zza
            boolean r6 = r0.equals(r6)
            return r6
    }

    public final int hashCode() {
            r3 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 24
            if (r0 >= r1) goto L20
            r0 = 0
            android.util.SparseBooleanArray r1 = r3.zza
            int r1 = r1.size()
        Ld:
            android.util.SparseBooleanArray r2 = r3.zza
            int r2 = r2.size()
            if (r0 >= r2) goto L1f
            int r1 = r1 * 31
            int r2 = r3.zza(r0)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto Ld
        L1f:
            return r1
        L20:
            android.util.SparseBooleanArray r0 = r3.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final int zza(int r3) {
            r2 = this;
            android.util.SparseBooleanArray r0 = r2.zza
            int r0 = r0.size()
            r1 = 0
            com.google.android.gms.internal.ads.zzdi.zza(r3, r1, r0)
            android.util.SparseBooleanArray r0 = r2.zza
            int r3 = r0.keyAt(r3)
            return r3
    }

    public final int zzb() {
            r1 = this;
            android.util.SparseBooleanArray r0 = r1.zza
            int r0 = r0.size()
            return r0
    }

    public final boolean zzc(int r2) {
            r1 = this;
            android.util.SparseBooleanArray r0 = r1.zza
            boolean r2 = r0.get(r2)
            return r2
    }
}
