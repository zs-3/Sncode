package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgcl extends com.google.android.gms.internal.ads.zzgbc {
    private final transient com.google.android.gms.internal.ads.zzgba zza;
    private final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzgcl(com.google.android.gms.internal.ads.zzgba r1, java.lang.Object[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r4
            return
    }

    static /* bridge */ /* synthetic */ int zzv(com.google.android.gms.internal.ads.zzgcl r0) {
            int r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object[] zzw(com.google.android.gms.internal.ads.zzgcl r0) {
            java.lang.Object[] r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L1f
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L1f
            com.google.android.gms.internal.ads.zzgba r2 = r3.zza
            java.lang.Object r0 = r2.get(r0)
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L1f
            r4 = 1
            return r4
        L1f:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r2.zzd()
            r1 = 0
            com.google.android.gms.internal.ads.zzgde r0 = r0.zzu(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    final int zza(java.lang.Object[] r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r1.zzd()
            int r2 = r0.zza(r2, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas
    public final com.google.android.gms.internal.ads.zzgdd zze() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r2.zzd()
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

    @Override // com.google.android.gms.internal.ads.zzgbc
    final com.google.android.gms.internal.ads.zzgax zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgck r0 = new com.google.android.gms.internal.ads.zzgck
            r0.<init>(r1)
            return r0
    }
}
