package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgcg extends com.google.android.gms.internal.ads.zzgci implements java.io.Serializable {
    static final com.google.android.gms.internal.ads.zzgcg zza = null;

    static {
            com.google.android.gms.internal.ads.zzgcg r0 = new com.google.android.gms.internal.ads.zzgcg
            r0.<init>()
            com.google.android.gms.internal.ads.zzgcg.zza = r0
            return
    }

    private zzgcg() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgci, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            java.util.Objects.requireNonNull(r1)
            java.util.Objects.requireNonNull(r2)
            int r1 = r1.compareTo(r2)
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Ordering.natural()"
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final com.google.android.gms.internal.ads.zzgci zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgcq r0 = com.google.android.gms.internal.ads.zzgcq.zza
            return r0
    }
}
