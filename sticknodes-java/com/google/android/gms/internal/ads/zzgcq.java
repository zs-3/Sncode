package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgcq extends com.google.android.gms.internal.ads.zzgci implements java.io.Serializable {
    static final com.google.android.gms.internal.ads.zzgcq zza = null;

    static {
            com.google.android.gms.internal.ads.zzgcq r0 = new com.google.android.gms.internal.ads.zzgcq
            r0.<init>()
            com.google.android.gms.internal.ads.zzgcq.zza = r0
            return
    }

    private zzgcq() {
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
            if (r1 != r2) goto Lb
            r1 = 0
            return r1
        Lb:
            int r1 = r2.compareTo(r1)
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Ordering.natural().reverse()"
            return r0
    }
}
