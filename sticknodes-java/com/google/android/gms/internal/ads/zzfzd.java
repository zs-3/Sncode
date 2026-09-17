package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
class zzfzd extends com.google.android.gms.internal.ads.zzgbt {
    final transient java.util.Map zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfzq zzb;

    zzfzd(com.google.android.gms.internal.ads.zzfzq r1, java.util.Map r2) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            r0.zza = r2
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfzq r0 = r3.zzb
            java.util.Map r1 = r3.zza
            java.util.Map r2 = com.google.android.gms.internal.ads.zzfzq.zzi(r0)
            if (r1 != r2) goto Le
            r0.zzp()
            return
        Le:
            com.google.android.gms.internal.ads.zzfzc r0 = new com.google.android.gms.internal.ads.zzfzc
            r0.<init>(r3)
            com.google.android.gms.internal.ads.zzgbh.zzb(r0)
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.Objects.requireNonNull(r0)
            boolean r2 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> La
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 == r2) goto Ld
            java.util.Map r0 = r1.zza
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            return r2
        Ld:
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r3) {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgbu.zza(r0, r3)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            com.google.android.gms.internal.ads.zzfzq r1 = r2.zzb
            java.util.Collection r3 = r1.zzc(r3, r0)
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgbt, java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfzq r0 = r1.zzb
            java.util.Set r0 = r0.zzt()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object r5) {
            r4 = this;
            java.util.Map r0 = r4.zza
            java.lang.Object r5 = r0.remove(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 != 0) goto Lc
            r5 = 0
            return r5
        Lc:
            com.google.android.gms.internal.ads.zzfzq r0 = r4.zzb
            java.util.Collection r0 = r0.zza()
            r0.addAll(r5)
            com.google.android.gms.internal.ads.zzfzq r1 = r4.zzb
            int r2 = com.google.android.gms.internal.ads.zzfzq.zzd(r1)
            int r3 = r5.size()
            int r2 = r2 - r3
            com.google.android.gms.internal.ads.zzfzq.zzn(r1, r2)
            r5.clear()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r1 = this;
            java.util.Map r0 = r1.zza
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.lang.String r0 = r0.toString()
            return r0
    }

    final java.util.Map.Entry zza(java.util.Map.Entry r3) {
            r2 = this;
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.util.Collection r3 = (java.util.Collection) r3
            com.google.android.gms.internal.ads.zzfzq r1 = r2.zzb
            java.util.Collection r3 = r1.zzc(r0, r3)
            com.google.android.gms.internal.ads.zzgat r1 = new com.google.android.gms.internal.ads.zzgat
            r1.<init>(r0, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    protected final java.util.Set zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfzb r0 = new com.google.android.gms.internal.ads.zzfzb
            r0.<init>(r1)
            return r0
    }
}
