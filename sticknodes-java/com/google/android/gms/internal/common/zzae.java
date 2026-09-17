package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
class zzae extends com.google.android.gms.internal.common.zzaf {
    java.lang.Object[] zza;
    int zzb;
    boolean zzc;

    zzae(int r1) {
            r0 = this;
            r0.<init>()
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            return
    }

    public final com.google.android.gms.internal.common.zzae zza(java.lang.Object r4) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            java.lang.Object[] r0 = r3.zza
            int r0 = r0.length
            int r1 = r3.zzb
            int r1 = r1 + 1
            if (r1 < 0) goto L40
            if (r1 > r0) goto L10
            r2 = r0
            goto L24
        L10:
            int r2 = r0 >> 1
            int r2 = r2 + r0
            int r2 = r2 + 1
            if (r2 >= r1) goto L1f
            int r1 = r1 + (-1)
            int r1 = java.lang.Integer.highestOneBit(r1)
            int r2 = r1 + r1
        L1f:
            if (r2 >= 0) goto L24
            r2 = 2147483647(0x7fffffff, float:NaN)
        L24:
            if (r2 > r0) goto L2a
            boolean r0 = r3.zzc
            if (r0 == 0) goto L35
        L2a:
            java.lang.Object[] r0 = r3.zza
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            r3.zza = r0
            r0 = 0
            r3.zzc = r0
        L35:
            java.lang.Object[] r0 = r3.zza
            int r1 = r3.zzb
            int r2 = r1 + 1
            r3.zzb = r2
            r0[r1] = r4
            return r3
        L40:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cannot store more than MAX_VALUE elements"
            r4.<init>(r0)
            throw r4
    }
}
