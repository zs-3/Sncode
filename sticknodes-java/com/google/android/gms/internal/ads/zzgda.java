package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgda extends com.google.android.gms.internal.ads.zzgbc {
    final transient java.lang.Object zza;

    zzgda(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgbg r0 = new com.google.android.gms.internal.ads.zzgbg
            java.lang.Object r1 = r2.zza
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    final int zza(java.lang.Object[] r2, int r3) {
            r1 = this;
            java.lang.Object r0 = r1.zza
            r2[r3] = r0
            int r3 = r3 + 1
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas
    public final com.google.android.gms.internal.ads.zzgax zzd() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzo(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas
    public final com.google.android.gms.internal.ads.zzgdd zze() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgbg r0 = new com.google.android.gms.internal.ads.zzgbg
            java.lang.Object r1 = r2.zza
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    final boolean zzf() {
            r1 = this;
            r0 = 0
            return r0
    }
}
