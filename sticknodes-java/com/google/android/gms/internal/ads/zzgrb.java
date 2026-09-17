package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgrb {
    private final java.lang.Class zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzgrb(java.lang.Class r1, java.lang.Class r2, com.google.android.gms.internal.ads.zzgra r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzgrb
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzgrb r4 = (com.google.android.gms.internal.ads.zzgrb) r4
            java.lang.Class r0 = r4.zza
            java.lang.Class r2 = r3.zza
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            java.lang.Class r4 = r4.zzb
            java.lang.Class r0 = r3.zzb
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class r0 = r3.zza
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.Class r0 = r3.zzb
            r2 = 1
            r1[r2] = r0
            int r0 = java.util.Objects.hash(r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Class r0 = r3.zzb
            java.lang.Class r1 = r3.zza
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " with serialization type: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
