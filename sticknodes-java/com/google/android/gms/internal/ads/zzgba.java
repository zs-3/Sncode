package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgba implements java.util.Map, java.io.Serializable {
    private transient com.google.android.gms.internal.ads.zzgbc zza;
    private transient com.google.android.gms.internal.ads.zzgbc zzb;
    private transient com.google.android.gms.internal.ads.zzgas zzc;

    zzgba() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.ads.zzgba zzc(java.util.Map r2) {
            java.util.Set r2 = r2.entrySet()
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto Ld
            int r0 = r2.size()
            goto Le
        Ld:
            r0 = 4
        Le:
            com.google.android.gms.internal.ads.zzgaz r1 = new com.google.android.gms.internal.ads.zzgaz
            r1.<init>(r0)
            r1.zzb(r2)
            com.google.android.gms.internal.ads.zzgba r2 = r1.zzc()
            return r2
    }

    public static com.google.android.gms.internal.ads.zzgba zzd() {
            com.google.android.gms.internal.ads.zzgba r0 = com.google.android.gms.internal.ads.zzgco.zza
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgba zze(java.lang.Object r2, java.lang.Object r3) {
            java.lang.String r2 = "dialog_not_shown_reason"
            com.google.android.gms.internal.ads.zzfzu.zzb(r2, r3)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r3 = 0
            com.google.android.gms.internal.ads.zzgco r2 = com.google.android.gms.internal.ads.zzgco.zzj(r2, r0, r3)
            return r2
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgas r0 = r1.zzb()
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgbc r0 = r1.zzh()
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.internal.ads.zzgbu.zzb(r0, r1)
            return r1
    }

    @Override // java.util.Map
    public abstract java.lang.Object get(java.lang.Object r1);

    @Override // java.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            return r2
    }

    @Override // java.util.Map
    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgbc r0 = r1.zzh()
            int r0 = com.google.android.gms.internal.ads.zzgcz.zza(r0)
            return r0
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgbc r0 = r1.zzi()
            return r0
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.size()
            java.lang.String r1 = "size"
            com.google.android.gms.internal.ads.zzfzu.zza(r0, r1)
            long r0 = (long) r0
            r2 = 8
            long r0 = r0 * r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
            long r0 = java.lang.Math.min(r0, r3)
            int r1 = (int) r0
            r2.<init>(r1)
            r0 = 123(0x7b, float:1.72E-43)
            r2.append(r0)
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
        L29:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r1 != 0) goto L3c
            java.lang.String r1 = ", "
            r2.append(r1)
        L3c:
            java.lang.Object r1 = r3.getKey()
            r2.append(r1)
            r1 = 61
            r2.append(r1)
            java.lang.Object r1 = r3.getValue()
            r2.append(r1)
            r1 = 0
            goto L29
        L51:
            r0 = 125(0x7d, float:1.75E-43)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgas r0 = r1.zzb()
            return r0
    }

    abstract com.google.android.gms.internal.ads.zzgas zza();

    public final com.google.android.gms.internal.ads.zzgas zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgas r0 = r1.zzc
            if (r0 != 0) goto La
            com.google.android.gms.internal.ads.zzgas r0 = r1.zza()
            r1.zzc = r0
        La:
            return r0
    }

    abstract com.google.android.gms.internal.ads.zzgbc zzf();

    abstract com.google.android.gms.internal.ads.zzgbc zzg();

    public final com.google.android.gms.internal.ads.zzgbc zzh() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgbc r0 = r1.zza
            if (r0 != 0) goto La
            com.google.android.gms.internal.ads.zzgbc r0 = r1.zzf()
            r1.zza = r0
        La:
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgbc zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgbc r0 = r1.zzb
            if (r0 != 0) goto La
            com.google.android.gms.internal.ads.zzgbc r0 = r1.zzg()
            r1.zzb = r0
        La:
            return r0
    }
}
