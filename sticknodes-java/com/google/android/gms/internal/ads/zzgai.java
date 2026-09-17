package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgai extends com.google.android.gms.internal.ads.zzgci implements java.io.Serializable {
    final java.util.Comparator zza;

    zzgai(java.util.Comparator r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgci, java.util.Comparator
    public final int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.util.Comparator r0 = r1.zza
            int r2 = r0.compare(r2, r3)
            return r2
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzgai
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzgai r2 = (com.google.android.gms.internal.ads.zzgai) r2
            java.util.Comparator r0 = r1.zza
            java.util.Comparator r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.Comparator r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.util.Comparator r0 = r1.zza
            java.lang.String r0 = r0.toString()
            return r0
    }
}
