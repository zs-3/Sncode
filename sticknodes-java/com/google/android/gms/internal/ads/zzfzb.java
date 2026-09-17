package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfzb extends com.google.android.gms.internal.ads.zzgbq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfzd zza;

    zzfzb(com.google.android.gms.internal.ads.zzfzd r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgbq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfzd r0 = r1.zza
            java.util.Map r0 = r0.zza
            java.util.Set r0 = r0.entrySet()
            boolean r2 = com.google.android.gms.internal.ads.zzfzw.zza(r0, r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfzc r0 = new com.google.android.gms.internal.ads.zzfzc
            com.google.android.gms.internal.ads.zzfzd r1 = r2.zza
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgbq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Objects.requireNonNull(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            com.google.android.gms.internal.ads.zzfzd r0 = r1.zza
            java.lang.Object r2 = r2.getKey()
            com.google.android.gms.internal.ads.zzfzq r0 = r0.zzb
            com.google.android.gms.internal.ads.zzfzq.zzo(r0, r2)
            r2 = 1
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgbq
    final java.util.Map zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfzd r0 = r1.zza
            return r0
    }
}
