package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaeg {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzaeg(int r1, byte[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2f
            java.lang.Class<com.google.android.gms.internal.ads.zzaeg> r2 = com.google.android.gms.internal.ads.zzaeg.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L2f
        L10:
            com.google.android.gms.internal.ads.zzaeg r5 = (com.google.android.gms.internal.ads.zzaeg) r5
            int r2 = r4.zza
            int r3 = r5.zza
            if (r2 != r3) goto L2f
            int r2 = r4.zzc
            int r3 = r5.zzc
            if (r2 != r3) goto L2f
            int r2 = r4.zzd
            int r3 = r5.zzd
            if (r2 != r3) goto L2f
            byte[] r2 = r4.zzb
            byte[] r5 = r5.zzb
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L2f
            return r0
        L2f:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zza
            byte[] r1 = r2.zzb
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.zzc
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.zzd
            int r0 = r0 + r1
            return r0
    }
}
