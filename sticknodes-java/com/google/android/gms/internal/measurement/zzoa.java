package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
class zzoa extends java.util.AbstractMap {
    private java.lang.Object[] zza;
    private int zzb;
    private java.util.Map zzc;
    private boolean zzd;
    private volatile com.google.android.gms.internal.measurement.zzny zze;
    private java.util.Map zzf;

    private zzoa() {
            r1 = this;
            r1.<init>()
            java.util.Map r0 = java.util.Collections.emptyMap()
            r1.zzc = r0
            java.util.Map r0 = java.util.Collections.emptyMap()
            r1.zzf = r0
            return
    }

    /* synthetic */ zzoa(com.google.android.gms.internal.measurement.zznz r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.zzc = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.zzf = r1
            return
    }

    static /* bridge */ /* synthetic */ int zzb(com.google.android.gms.internal.measurement.zzoa r0) {
            int r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zze(com.google.android.gms.internal.measurement.zzoa r0, int r1) {
            java.lang.Object r0 = r0.zzm(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzh(com.google.android.gms.internal.measurement.zzoa r0) {
            java.util.Map r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzoa r0) {
            r0.zzo()
            return
    }

    static /* bridge */ /* synthetic */ java.lang.Object[] zzk(com.google.android.gms.internal.measurement.zzoa r0) {
            java.lang.Object[] r0 = r0.zza
            return r0
    }

    private final int zzl(java.lang.Comparable r5) {
            r4 = this;
            int r0 = r4.zzb
            int r0 = r0 + (-1)
            r1 = 0
            if (r0 < 0) goto L1f
            java.lang.Object[] r2 = r4.zza
            r2 = r2[r0]
            com.google.android.gms.internal.measurement.zznw r2 = (com.google.android.gms.internal.measurement.zznw) r2
            java.lang.Comparable r2 = r2.zza()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1b
            int r0 = r0 + 2
            int r5 = -r0
            return r5
        L1b:
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            return r0
        L1f:
            if (r1 > r0) goto L3e
            int r2 = r1 + r0
            int r2 = r2 / 2
            java.lang.Object[] r3 = r4.zza
            r3 = r3[r2]
            com.google.android.gms.internal.measurement.zznw r3 = (com.google.android.gms.internal.measurement.zznw) r3
            java.lang.Comparable r3 = r3.zza()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L38
            int r0 = r2 + (-1)
            goto L1f
        L38:
            if (r3 <= 0) goto L3d
            int r1 = r2 + 1
            goto L1f
        L3d:
            return r2
        L3e:
            int r1 = r1 + 1
            int r5 = -r1
            return r5
    }

    private final java.lang.Object zzm(int r7) {
            r6 = this;
            r6.zzo()
            java.lang.Object[] r0 = r6.zza
            r0 = r0[r7]
            com.google.android.gms.internal.measurement.zznw r0 = (com.google.android.gms.internal.measurement.zznw) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Object[] r1 = r6.zza
            int r2 = r6.zzb
            int r2 = r2 - r7
            int r2 = r2 + (-1)
            int r3 = r7 + 1
            java.lang.System.arraycopy(r1, r3, r1, r7, r2)
            int r7 = r6.zzb
            int r7 = r7 + (-1)
            r6.zzb = r7
            java.util.Map r7 = r6.zzc
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L57
            java.util.SortedMap r7 = r6.zzn()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            java.lang.Object[] r1 = r6.zza
            int r2 = r6.zzb
            com.google.android.gms.internal.measurement.zznw r3 = new com.google.android.gms.internal.measurement.zznw
            java.lang.Object r4 = r7.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            java.lang.Object r4 = r4.getValue()
            r3.<init>(r6, r5, r4)
            r1[r2] = r3
            int r1 = r6.zzb
            int r1 = r1 + 1
            r6.zzb = r1
            r7.remove()
        L57:
            return r0
    }

    private final java.util.SortedMap zzn() {
            r2 = this;
            r2.zzo()
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

    private final void zzo() {
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
            r1.zzo()
            int r0 = r1.zzb
            if (r0 == 0) goto Ld
            r0 = 0
            r1.zza = r0
            r0 = 0
            r1.zzb = r0
        Ld:
            java.util.Map r0 = r1.zzc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1a
            java.util.Map r0 = r1.zzc
            r0.clear()
        L1a:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.zzl(r2)
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
            com.google.android.gms.internal.measurement.zzny r0 = r2.zze
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.measurement.zzny r0 = new com.google.android.gms.internal.measurement.zzny
            r1 = 0
            r0.<init>(r2, r1)
            r2.zze = r0
        Lc:
            com.google.android.gms.internal.measurement.zzny r0 = r2.zze
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.gms.internal.measurement.zzoa
            if (r1 != 0) goto Ld
            boolean r8 = super.equals(r8)
            return r8
        Ld:
            com.google.android.gms.internal.measurement.zzoa r8 = (com.google.android.gms.internal.measurement.zzoa) r8
            int r1 = r7.size()
            int r2 = r8.size()
            r3 = 0
            if (r1 != r2) goto L4e
            int r2 = r7.zzb
            int r4 = r8.zzb
            if (r2 != r4) goto L41
            r4 = 0
        L21:
            if (r4 >= r2) goto L35
            java.util.Map$Entry r5 = r7.zzg(r4)
            java.util.Map$Entry r6 = r8.zzg(r4)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L32
            return r3
        L32:
            int r4 = r4 + 1
            goto L21
        L35:
            if (r2 == r1) goto L40
            java.util.Map r0 = r7.zzc
            java.util.Map r8 = r8.zzc
            boolean r8 = r0.equals(r8)
            return r8
        L40:
            return r0
        L41:
            java.util.Set r0 = r7.entrySet()
            java.util.Set r8 = r8.entrySet()
            boolean r8 = r0.equals(r8)
            return r8
        L4e:
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.zzl(r2)
            if (r0 < 0) goto L13
            java.lang.Object[] r2 = r1.zza
            r2 = r2[r0]
            com.google.android.gms.internal.measurement.zznw r2 = (com.google.android.gms.internal.measurement.zznw) r2
            java.lang.Object r2 = r2.getValue()
            return r2
        L13:
            java.util.Map r0 = r1.zzc
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
            r4 = this;
            int r0 = r4.zzb
            r1 = 0
            r2 = 0
        L4:
            if (r1 >= r0) goto L12
            java.lang.Object[] r3 = r4.zza
            r3 = r3[r1]
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L4
        L12:
            java.util.Map r0 = r4.zzc
            int r0 = r0.size()
            if (r0 <= 0) goto L21
            java.util.Map r0 = r4.zzc
            int r0 = r0.hashCode()
            int r2 = r2 + r0
        L21:
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r1 = r0.zzf(r1, r2)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            r1.zzo()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.zzl(r2)
            if (r0 < 0) goto L10
            java.lang.Object r2 = r1.zzm(r0)
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
            int r0 = r2.zzb
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

    public final int zzc() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public final java.lang.Iterable zzd() {
            r1 = this;
            java.util.Map r0 = r1.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.util.Set r0 = java.util.Collections.emptySet()
            goto L13
        Ld:
            java.util.Map r0 = r1.zzc
            java.util.Set r0 = r0.entrySet()
        L13:
            return r0
    }

    public final java.lang.Object zzf(java.lang.Comparable r5, java.lang.Object r6) {
            r4 = this;
            r4.zzo()
            int r0 = r4.zzl(r5)
            if (r0 < 0) goto L14
            java.lang.Object[] r5 = r4.zza
            r5 = r5[r0]
            com.google.android.gms.internal.measurement.zznw r5 = (com.google.android.gms.internal.measurement.zznw) r5
            java.lang.Object r5 = r5.setValue(r6)
            return r5
        L14:
            r4.zzo()
            java.lang.Object[] r1 = r4.zza
            r2 = 16
            if (r1 != 0) goto L21
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r4.zza = r1
        L21:
            int r0 = r0 + 1
            int r0 = -r0
            if (r0 < r2) goto L2f
            java.util.SortedMap r0 = r4.zzn()
            java.lang.Object r5 = r0.put(r5, r6)
            return r5
        L2f:
            int r1 = r4.zzb
            if (r1 != r2) goto L4c
            java.lang.Object[] r1 = r4.zza
            r2 = 15
            r1 = r1[r2]
            com.google.android.gms.internal.measurement.zznw r1 = (com.google.android.gms.internal.measurement.zznw) r1
            r4.zzb = r2
            java.util.SortedMap r2 = r4.zzn()
            java.lang.Comparable r3 = r1.zza()
            java.lang.Object r1 = r1.getValue()
            r2.put(r3, r1)
        L4c:
            java.lang.Object[] r1 = r4.zza
            int r2 = r0 + 1
            int r3 = r1.length
            int r3 = 16 - r0
            int r3 = r3 + (-1)
            java.lang.System.arraycopy(r1, r0, r1, r2, r3)
            java.lang.Object[] r1 = r4.zza
            com.google.android.gms.internal.measurement.zznw r2 = new com.google.android.gms.internal.measurement.zznw
            r2.<init>(r4, r5, r6)
            r1[r0] = r2
            int r5 = r4.zzb
            int r5 = r5 + 1
            r4.zzb = r5
            r5 = 0
            return r5
    }

    public final java.util.Map.Entry zzg(int r2) {
            r1 = this;
            int r0 = r1.zzb
            if (r2 >= r0) goto Lb
            java.lang.Object[] r0 = r1.zza
            r2 = r0[r2]
            com.google.android.gms.internal.measurement.zznw r2 = (com.google.android.gms.internal.measurement.zznw) r2
            return r2
        Lb:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r2)
            throw r0
    }

    public final boolean zzj() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }
}
