package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
class zzgv extends java.util.AbstractMap {
    private final int zza;
    private java.util.List zzb;
    private java.util.Map zzc;
    private boolean zzd;
    private volatile com.google.android.gms.internal.auth.zzgt zze;
    private java.util.Map zzf;

    /* synthetic */ zzgv(int r1, com.google.android.gms.internal.auth.zzgu r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            java.util.List r1 = java.util.Collections.emptyList()
            r0.zzb = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.zzc = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.zzf = r1
            return
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzd(com.google.android.gms.internal.auth.zzgv r0, int r1) {
            java.lang.Object r0 = r0.zzl(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List zzf(com.google.android.gms.internal.auth.zzgv r0) {
            java.util.List r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzh(com.google.android.gms.internal.auth.zzgv r0) {
            java.util.Map r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ void zzi(com.google.android.gms.internal.auth.zzgv r0) {
            r0.zzn()
            return
    }

    private final int zzk(java.lang.Comparable r5) {
            r4 = this;
            java.util.List r0 = r4.zzb
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r1 = 0
            if (r0 < 0) goto L25
            java.util.List r2 = r4.zzb
            java.lang.Object r2 = r2.get(r0)
            com.google.android.gms.internal.auth.zzgp r2 = (com.google.android.gms.internal.auth.zzgp) r2
            java.lang.Comparable r2 = r2.zza()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L21
            int r0 = r0 + 2
            int r5 = -r0
            return r5
        L21:
            if (r2 == 0) goto L24
            goto L25
        L24:
            return r0
        L25:
            if (r1 > r0) goto L46
            int r2 = r1 + r0
            int r2 = r2 / 2
            java.util.List r3 = r4.zzb
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.auth.zzgp r3 = (com.google.android.gms.internal.auth.zzgp) r3
            java.lang.Comparable r3 = r3.zza()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r0 = r2 + (-1)
            goto L25
        L40:
            if (r3 <= 0) goto L45
            int r1 = r2 + 1
            goto L25
        L45:
            return r2
        L46:
            int r1 = r1 + 1
            int r5 = -r1
            return r5
    }

    private final java.lang.Object zzl(int r6) {
            r5 = this;
            r5.zzn()
            java.util.List r0 = r5.zzb
            java.lang.Object r6 = r0.remove(r6)
            com.google.android.gms.internal.auth.zzgp r6 = (com.google.android.gms.internal.auth.zzgp) r6
            java.lang.Object r6 = r6.getValue()
            java.util.Map r0 = r5.zzc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L40
            java.util.SortedMap r0 = r5.zzm()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.List r1 = r5.zzb
            com.google.android.gms.internal.auth.zzgp r2 = new com.google.android.gms.internal.auth.zzgp
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            java.lang.Object r3 = r3.getValue()
            r2.<init>(r5, r4, r3)
            r1.add(r2)
            r0.remove()
        L40:
            return r6
    }

    private final java.util.SortedMap zzm() {
            r2 = this;
            r2.zzn()
            java.util.Map r0 = r2.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L21
            java.util.Map r0 = r2.zzc
            boolean r0 = r0 instanceof java.util.TreeMap
            if (r0 != 0) goto L21
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r2.zzc = r0
            r1 = r0
            java.util.TreeMap r1 = (java.util.TreeMap) r1
            java.util.NavigableMap r0 = r0.descendingMap()
            r2.zzf = r0
        L21:
            java.util.Map r0 = r2.zzc
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    private final void zzn() {
            r1 = this;
            boolean r0 = r1.zzd
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r1 = this;
            r1.zzn()
            java.util.List r0 = r1.zzb
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10
            java.util.List r0 = r1.zzb
            r0.clear()
        L10:
            java.util.Map r0 = r1.zzc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.Map r0 = r1.zzc
            r0.clear()
        L1d:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.zzk(r2)
            if (r0 >= 0) goto L13
            java.util.Map r0 = r1.zzc
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            com.google.android.gms.internal.auth.zzgt r0 = r2.zze
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.auth.zzgt r0 = new com.google.android.gms.internal.auth.zzgt
            r1 = 0
            r0.<init>(r2, r1)
            r2.zze = r0
        Lc:
            com.google.android.gms.internal.auth.zzgt r0 = r2.zze
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.gms.internal.auth.zzgv
            if (r1 != 0) goto Ld
            boolean r8 = super.equals(r8)
            return r8
        Ld:
            com.google.android.gms.internal.auth.zzgv r8 = (com.google.android.gms.internal.auth.zzgv) r8
            int r1 = r7.size()
            int r2 = r8.size()
            r3 = 0
            if (r1 == r2) goto L1b
            return r3
        L1b:
            int r2 = r7.zzb()
            int r4 = r8.zzb()
            if (r2 != r4) goto L46
            r4 = 0
        L26:
            if (r4 >= r2) goto L3a
            java.util.Map$Entry r5 = r7.zzg(r4)
            java.util.Map$Entry r6 = r8.zzg(r4)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L37
            return r3
        L37:
            int r4 = r4 + 1
            goto L26
        L3a:
            if (r2 == r1) goto L45
            java.util.Map r0 = r7.zzc
            java.util.Map r8 = r8.zzc
            boolean r8 = r0.equals(r8)
            return r8
        L45:
            return r0
        L46:
            java.util.Set r0 = r7.entrySet()
            java.util.Set r8 = r8.entrySet()
            boolean r8 = r0.equals(r8)
            return r8
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.zzk(r2)
            if (r0 < 0) goto L15
            java.util.List r2 = r1.zzb
            java.lang.Object r2 = r2.get(r0)
            com.google.android.gms.internal.auth.zzgp r2 = (com.google.android.gms.internal.auth.zzgp) r2
            java.lang.Object r2 = r2.getValue()
            return r2
        L15:
            java.util.Map r0 = r1.zzc
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
            r4 = this;
            int r0 = r4.zzb()
            r1 = 0
            r2 = 0
        L6:
            if (r1 >= r0) goto L18
            java.util.List r3 = r4.zzb
            java.lang.Object r3 = r3.get(r1)
            com.google.android.gms.internal.auth.zzgp r3 = (com.google.android.gms.internal.auth.zzgp) r3
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L18:
            java.util.Map r0 = r4.zzc
            int r0 = r0.size()
            if (r0 <= 0) goto L27
            java.util.Map r0 = r4.zzc
            int r0 = r0.hashCode()
            int r2 = r2 + r0
        L27:
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r1 = r0.zze(r1, r2)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            r1.zzn()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.zzk(r2)
            if (r0 < 0) goto L10
            java.lang.Object r2 = r1.zzl(r0)
            return r2
        L10:
            java.util.Map r0 = r1.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            r2 = 0
            return r2
        L1a:
            java.util.Map r0 = r1.zzc
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r2 = this;
            java.util.List r0 = r2.zzb
            int r0 = r0.size()
            java.util.Map r1 = r2.zzc
            int r1 = r1.size()
            int r0 = r0 + r1
            return r0
    }

    public void zza() {
            r1 = this;
            boolean r0 = r1.zzd
            if (r0 != 0) goto L31
            java.util.Map r0 = r1.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L17
        L11:
            java.util.Map r0 = r1.zzc
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L17:
            r1.zzc = r0
            java.util.Map r0 = r1.zzf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L26
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L2c
        L26:
            java.util.Map r0 = r1.zzf
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L2c:
            r1.zzf = r0
            r0 = 1
            r1.zzd = r0
        L31:
            return
    }

    public final int zzb() {
            r1 = this;
            java.util.List r0 = r1.zzb
            int r0 = r0.size()
            return r0
    }

    public final java.lang.Iterable zzc() {
            r1 = this;
            java.util.Map r0 = r1.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.lang.Iterable r0 = com.google.android.gms.internal.auth.zzgo.zza()
            goto L13
        Ld:
            java.util.Map r0 = r1.zzc
            java.util.Set r0 = r0.entrySet()
        L13:
            return r0
    }

    public final java.lang.Object zze(java.lang.Comparable r5, java.lang.Object r6) {
            r4 = this;
            r4.zzn()
            int r0 = r4.zzk(r5)
            if (r0 < 0) goto L16
            java.util.List r5 = r4.zzb
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.auth.zzgp r5 = (com.google.android.gms.internal.auth.zzgp) r5
            java.lang.Object r5 = r5.setValue(r6)
            return r5
        L16:
            r4.zzn()
            java.util.List r1 = r4.zzb
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L30
            java.util.List r1 = r4.zzb
            boolean r1 = r1 instanceof java.util.ArrayList
            if (r1 != 0) goto L30
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r4.zza
            r1.<init>(r2)
            r4.zzb = r1
        L30:
            int r0 = r0 + 1
            int r0 = -r0
            int r1 = r4.zza
            if (r0 < r1) goto L40
            java.util.SortedMap r0 = r4.zzm()
            java.lang.Object r5 = r0.put(r5, r6)
            return r5
        L40:
            java.util.List r1 = r4.zzb
            int r1 = r1.size()
            int r2 = r4.zza
            if (r1 != r2) goto L63
            java.util.List r1 = r4.zzb
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.remove(r2)
            com.google.android.gms.internal.auth.zzgp r1 = (com.google.android.gms.internal.auth.zzgp) r1
            java.util.SortedMap r2 = r4.zzm()
            java.lang.Comparable r3 = r1.zza()
            java.lang.Object r1 = r1.getValue()
            r2.put(r3, r1)
        L63:
            java.util.List r1 = r4.zzb
            com.google.android.gms.internal.auth.zzgp r2 = new com.google.android.gms.internal.auth.zzgp
            r2.<init>(r4, r5, r6)
            r1.add(r0, r2)
            r5 = 0
            return r5
    }

    public final java.util.Map.Entry zzg(int r2) {
            r1 = this;
            java.util.List r0 = r1.zzb
            java.lang.Object r2 = r0.get(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            return r2
    }

    public final boolean zzj() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }
}
