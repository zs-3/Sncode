package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzfzq extends com.google.android.gms.internal.ads.zzfzt implements java.io.Serializable {
    private final transient java.util.Map zza;
    private transient int zzb;

    protected zzfzq(java.util.Map r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.isEmpty()
            com.google.android.gms.internal.ads.zzfxz.zze(r0)
            r1.zza = r2
            return
    }

    static /* bridge */ /* synthetic */ int zzd(com.google.android.gms.internal.ads.zzfzq r0) {
            int r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzi(com.google.android.gms.internal.ads.zzfzq r0) {
            java.util.Map r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzfzq r0, int r1) {
            r0.zzb = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzfzq r1, java.lang.Object r2) {
            java.util.Map r0 = r1.zza
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L7
            goto L8
        L7:
            r2 = 0
        L8:
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L18
            int r0 = r2.size()
            r2.clear()
            int r2 = r1.zzb
            int r2 = r2 - r0
            r1.zzb = r2
        L18:
            return
    }

    abstract java.util.Collection zza();

    java.util.Collection zzb(java.util.Collection r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    java.util.Collection zzc(java.lang.Object r1, java.util.Collection r2) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final int zze() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzt
    final java.util.Collection zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfzs r0 = new com.google.android.gms.internal.ads.zzfzs
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzt
    final java.util.Iterator zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfza r0 = new com.google.android.gms.internal.ads.zzfza
            r0.<init>(r1)
            return r0
    }

    final java.util.List zzh(java.lang.Object r2, java.util.List r3, com.google.android.gms.internal.ads.zzfzn r4) {
            r1 = this;
            boolean r0 = r3 instanceof java.util.RandomAccess
            if (r0 == 0) goto La
            com.google.android.gms.internal.ads.zzfzj r0 = new com.google.android.gms.internal.ads.zzfzj
            r0.<init>(r1, r2, r3, r4)
            goto Lf
        La:
            com.google.android.gms.internal.ads.zzfzp r0 = new com.google.android.gms.internal.ads.zzfzp
            r0.<init>(r1, r2, r3, r4)
        Lf:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzt
    java.util.Map zzj() {
            r1 = this;
            r0 = 0
            throw r0
    }

    final java.util.Map zzk() {
            r2 = this;
            java.util.Map r0 = r2.zza
            boolean r1 = r0 instanceof java.util.NavigableMap
            if (r1 == 0) goto Le
            com.google.android.gms.internal.ads.zzfzh r1 = new com.google.android.gms.internal.ads.zzfzh
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            r1.<init>(r2, r0)
            return r1
        Le:
            boolean r1 = r0 instanceof java.util.SortedMap
            if (r1 == 0) goto L1a
            com.google.android.gms.internal.ads.zzfzk r1 = new com.google.android.gms.internal.ads.zzfzk
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            r1.<init>(r2, r0)
            return r1
        L1a:
            com.google.android.gms.internal.ads.zzfzd r1 = new com.google.android.gms.internal.ads.zzfzd
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfzt
    java.util.Set zzl() {
            r1 = this;
            r0 = 0
            throw r0
    }

    final java.util.Set zzm() {
            r2 = this;
            java.util.Map r0 = r2.zza
            boolean r1 = r0 instanceof java.util.NavigableMap
            if (r1 == 0) goto Le
            com.google.android.gms.internal.ads.zzfzi r1 = new com.google.android.gms.internal.ads.zzfzi
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            r1.<init>(r2, r0)
            return r1
        Le:
            boolean r1 = r0 instanceof java.util.SortedMap
            if (r1 == 0) goto L1a
            com.google.android.gms.internal.ads.zzfzl r1 = new com.google.android.gms.internal.ads.zzfzl
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            r1.<init>(r2, r0)
            return r1
        L1a:
            com.google.android.gms.internal.ads.zzfzg r1 = new com.google.android.gms.internal.ads.zzfzg
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final void zzp() {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            java.util.Collection r1 = (java.util.Collection) r1
            r1.clear()
            goto La
        L1a:
            java.util.Map r0 = r2.zza
            r0.clear()
            r0 = 0
            r2.zzb = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfzt, com.google.android.gms.internal.ads.zzgbv
    public final boolean zzq(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.lang.Object r0 = r0.get(r3)
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 1
            if (r0 != 0) goto L28
            java.util.Collection r0 = r2.zza()
            boolean r4 = r0.add(r4)
            if (r4 == 0) goto L20
            int r4 = r2.zzb
            int r4 = r4 + r1
            r2.zzb = r4
            java.util.Map r4 = r2.zza
            r4.put(r3, r0)
            return r1
        L20:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r4 = "New Collection violated the Collection spec"
            r3.<init>(r4)
            throw r3
        L28:
            boolean r3 = r0.add(r4)
            if (r3 == 0) goto L34
            int r3 = r2.zzb
            int r3 = r3 + r1
            r2.zzb = r3
            return r1
        L34:
            r3 = 0
            return r3
    }
}
