package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzvx {
    public final int zza;
    public final boolean zzb;

    public zzvx(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1f
            java.lang.Class<com.google.android.gms.internal.ads.zzvx> r2 = com.google.android.gms.internal.ads.zzvx.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1f
        L10:
            com.google.android.gms.internal.ads.zzvx r5 = (com.google.android.gms.internal.ads.zzvx) r5
            int r2 = r4.zza
            int r3 = r5.zza
            if (r2 != r3) goto L1f
            boolean r2 = r4.zzb
            boolean r5 = r5.zzb
            if (r2 != r5) goto L1f
            return r0
        L1f:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zza
            int r0 = r0 * 31
            boolean r1 = r2.zzb
            int r0 = r0 + r1
            return r0
    }
}
