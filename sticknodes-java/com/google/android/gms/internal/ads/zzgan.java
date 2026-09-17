package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgan extends com.google.android.gms.internal.ads.zzgao implements java.util.Map {
    protected zzgan() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Map
    public final void clear() {
            r1 = this;
            java.util.Map r0 = r1.zzb()
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zzb()
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zzb()
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
            r1 = this;
            java.util.Map r0 = r1.zzb()
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto Lf
            java.util.Map r0 = r1.zzb()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zzb()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.zzb()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.Map r0 = r1.zzb()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
            r1 = this;
            java.util.Map r0 = r1.zzb()
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map r0 = r1.zzb()
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r2) {
            r1 = this;
            java.util.Map r0 = r1.zzb()
            r0.putAll(r2)
            return
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zzb()
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            java.util.Map r0 = r1.zzb()
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r1 = this;
            java.util.Map r0 = r1.zzb()
            java.util.Collection r0 = r0.values()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgao
    protected /* bridge */ /* synthetic */ java.lang.Object zza() {
            r1 = this;
            r0 = 0
            throw r0
    }

    protected abstract java.util.Map zzb();

    protected final int zzc() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = com.google.android.gms.internal.ads.zzgcz.zza(r0)
            return r0
    }

    protected final boolean zzd(java.lang.Object r5) {
            r4 = this;
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.android.gms.internal.ads.zzgbp r1 = new com.google.android.gms.internal.ads.zzgbp
            r1.<init>(r0)
            r0 = 1
            r2 = 0
            if (r5 != 0) goto L20
        L11:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L1e
            java.lang.Object r5 = r1.next()
            if (r5 != 0) goto L11
            goto L30
        L1e:
            r0 = 0
            goto L30
        L20:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1e
            java.lang.Object r3 = r1.next()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L20
        L30:
            return r0
    }

    protected final boolean zze(java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.internal.ads.zzgbu.zzb(r0, r1)
            return r1
    }
}
