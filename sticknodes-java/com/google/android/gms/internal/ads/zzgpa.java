package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgpa {
    private final com.google.android.gms.internal.ads.zzgot zza;
    private final java.util.List zzb;
    private final java.lang.Integer zzc;

    /* synthetic */ zzgpa(com.google.android.gms.internal.ads.zzgot r1, java.util.List r2, java.lang.Integer r3, com.google.android.gms.internal.ads.zzgoz r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzgpa
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzgpa r4 = (com.google.android.gms.internal.ads.zzgpa) r4
            com.google.android.gms.internal.ads.zzgot r0 = r3.zza
            com.google.android.gms.internal.ads.zzgot r2 = r4.zza
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L28
            java.util.List r0 = r3.zzb
            java.util.List r2 = r4.zzb
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L28
            java.lang.Integer r0 = r3.zzc
            java.lang.Integer r4 = r4.zzc
            boolean r4 = java.util.Objects.equals(r0, r4)
            if (r4 == 0) goto L28
            r4 = 1
            return r4
        L28:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgot r0 = r3.zza
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.util.List r0 = r3.zzb
            r2 = 1
            r1[r2] = r0
            int r0 = java.util.Objects.hash(r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgot r0 = r3.zza
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.util.List r0 = r3.zzb
            r2 = 1
            r1[r2] = r0
            java.lang.Integer r0 = r3.zzc
            r2 = 2
            r1[r2] = r0
            java.lang.String r0 = "(annotations=%s, entries=%s, primaryKeyId=%s)"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
    }
}
