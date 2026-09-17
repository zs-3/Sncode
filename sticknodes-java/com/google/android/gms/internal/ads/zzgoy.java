package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgoy {
    private final com.google.android.gms.internal.ads.zzghf zza;
    private final int zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    /* synthetic */ zzgoy(com.google.android.gms.internal.ads.zzghf r1, int r2, java.lang.String r3, java.lang.String r4, com.google.android.gms.internal.ads.zzgox r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzgoy
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzgoy r4 = (com.google.android.gms.internal.ads.zzgoy) r4
            com.google.android.gms.internal.ads.zzghf r0 = r3.zza
            com.google.android.gms.internal.ads.zzghf r2 = r4.zza
            if (r0 != r2) goto L2a
            int r0 = r3.zzb
            int r2 = r4.zzb
            if (r0 != r2) goto L2a
            java.lang.String r0 = r3.zzc
            java.lang.String r2 = r4.zzc
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2a
            java.lang.String r0 = r3.zzd
            java.lang.String r4 = r4.zzd
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L2a
            r4 = 1
            return r4
        L2a:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            com.google.android.gms.internal.ads.zzghf r0 = r3.zza
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = r3.zzb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = r3.zzc
            r2 = 2
            r1[r2] = r0
            java.lang.String r0 = r3.zzd
            r2 = 3
            r1[r2] = r0
            int r0 = java.util.Objects.hash(r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.ads.zzghf r0 = r3.zza
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = r3.zzb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = r3.zzc
            r2 = 2
            r1[r2] = r0
            java.lang.String r0 = r3.zzd
            r2 = 3
            r1[r2] = r0
            java.lang.String r0 = "(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }
}
