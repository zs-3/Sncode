package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgcr extends com.google.android.gms.internal.ads.zzgci implements java.io.Serializable {
    final com.google.android.gms.internal.ads.zzgci zza;

    zzgcr(com.google.android.gms.internal.ads.zzgci r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgci, java.util.Comparator
    public final int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgci r0 = r1.zza
            int r2 = r0.compare(r3, r2)
            return r2
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzgcr
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzgcr r2 = (com.google.android.gms.internal.ads.zzgcr) r2
            com.google.android.gms.internal.ads.zzgci r0 = r1.zza
            com.google.android.gms.internal.ads.zzgci r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgci r0 = r1.zza
            int r0 = r0.hashCode()
            int r0 = -r0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgci r0 = r2.zza
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = ".reverse()"
            java.lang.String r0 = r0.concat(r1)
            return r0
    }
}
