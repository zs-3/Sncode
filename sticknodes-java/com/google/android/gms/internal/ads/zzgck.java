package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgck extends com.google.android.gms.internal.ads.zzgax {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgcl zza;

    zzgck(com.google.android.gms.internal.ads.zzgcl r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzgcl r0 = r2.zza
            int r0 = com.google.android.gms.internal.ads.zzgcl.zzv(r0)
            java.lang.String r1 = "index"
            com.google.android.gms.internal.ads.zzfxz.zza(r3, r0, r1)
            com.google.android.gms.internal.ads.zzgcl r0 = r2.zza
            java.lang.Object[] r0 = com.google.android.gms.internal.ads.zzgcl.zzw(r0)
            int r3 = r3 + r3
            r0 = r0[r3]
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzgcl r1 = r2.zza
            java.lang.Object[] r1 = com.google.android.gms.internal.ads.zzgcl.zzw(r1)
            int r3 = r3 + 1
            r3 = r1[r3]
            java.util.Objects.requireNonNull(r3)
            java.util.AbstractMap$SimpleImmutableEntry r1 = new java.util.AbstractMap$SimpleImmutableEntry
            r1.<init>(r0, r3)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgcl r0 = r1.zza
            int r0 = com.google.android.gms.internal.ads.zzgcl.zzv(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final boolean zzf() {
            r1 = this;
            r0 = 1
            return r0
    }
}
