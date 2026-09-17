package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgcm extends com.google.android.gms.internal.ads.zzgbc {
    private final transient com.google.android.gms.internal.ads.zzgba zza;
    private final transient com.google.android.gms.internal.ads.zzgax zzb;

    zzgcm(com.google.android.gms.internal.ads.zzgba r1, com.google.android.gms.internal.ads.zzgax r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgba r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r2.zzb
            r1 = 0
            com.google.android.gms.internal.ads.zzgde r0 = r0.zzu(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgba r0 = r1.zza
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    final int zza(java.lang.Object[] r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r1.zzb
            int r2 = r0.zza(r2, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas
    public final com.google.android.gms.internal.ads.zzgax zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas
    public final com.google.android.gms.internal.ads.zzgdd zze() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r2.zzb
            r1 = 0
            com.google.android.gms.internal.ads.zzgde r0 = r0.zzu(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    final boolean zzf() {
            r1 = this;
            r0 = 1
            return r0
    }
}
