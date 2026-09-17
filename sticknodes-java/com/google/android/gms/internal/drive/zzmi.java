package com.google.android.gms.internal.drive;

import java.lang.Comparable;

/* loaded from: classes.dex */
class zzmi<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private boolean zzot;
    private final int zzvd;
    private java.util.List<com.google.android.gms.internal.drive.zzmp> zzve;
    private java.util.Map<K, V> zzvf;
    private volatile com.google.android.gms.internal.drive.zzmr zzvg;
    private java.util.Map<K, V> zzvh;
    private volatile com.google.android.gms.internal.drive.zzml zzvi;

    private zzmi(int r1) {
            r0 = this;
            r0.<init>()
            r0.zzvd = r1
            java.util.List r1 = java.util.Collections.emptyList()
            r0.zzve = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.zzvf = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.zzvh = r1
            return
    }

    /* synthetic */ zzmi(int r1, com.google.android.gms.internal.drive.zzmj r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private final int zza(K r5) {
            r4 = this;
            java.util.List<com.google.android.gms.internal.drive.zzmp> r0 = r4.zzve
            int r0 = r0.size()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L25
            java.util.List<com.google.android.gms.internal.drive.zzmp> r1 = r4.zzve
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.drive.zzmp r1 = (com.google.android.gms.internal.drive.zzmp) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r5.compareTo(r1)
            if (r1 <= 0) goto L22
            int r0 = r0 + 2
            int r5 = -r0
            return r5
        L22:
            if (r1 != 0) goto L25
            return r0
        L25:
            r1 = 0
        L26:
            if (r1 > r0) goto L49
            int r2 = r1 + r0
            int r2 = r2 / 2
            java.util.List<com.google.android.gms.internal.drive.zzmp> r3 = r4.zzve
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.drive.zzmp r3 = (com.google.android.gms.internal.drive.zzmp) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L43
            int r0 = r2 + (-1)
            goto L26
        L43:
            if (r3 <= 0) goto L48
            int r1 = r2 + 1
            goto L26
        L48:
            return r2
        L49:
            int r1 = r1 + 1
            int r5 = -r1
            return r5
    }

    static /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.drive.zzmi r0, int r1) {
            java.lang.Object r0 = r0.zzax(r1)
            return r0
    }

    static /* synthetic */ void zza(com.google.android.gms.internal.drive.zzmi r0) {
            r0.zzeu()
            return
    }

    static <FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>> com.google.android.gms.internal.drive.zzmi<FieldDescriptorType, java.lang.Object> zzav(int r1) {
            com.google.android.gms.internal.drive.zzmj r0 = new com.google.android.gms.internal.drive.zzmj
            r0.<init>(r1)
            return r0
    }

    private final V zzax(int r5) {
            r4 = this;
            r4.zzeu()
            java.util.List<com.google.android.gms.internal.drive.zzmp> r0 = r4.zzve
            java.lang.Object r5 = r0.remove(r5)
            com.google.android.gms.internal.drive.zzmp r5 = (com.google.android.gms.internal.drive.zzmp) r5
            java.lang.Object r5 = r5.getValue()
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r4.zzvf
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L36
            java.util.SortedMap r0 = r4.zzev()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.List<com.google.android.gms.internal.drive.zzmp> r1 = r4.zzve
            com.google.android.gms.internal.drive.zzmp r2 = new com.google.android.gms.internal.drive.zzmp
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r2.<init>(r4, r3)
            r1.add(r2)
            r0.remove()
        L36:
            return r5
    }

    static /* synthetic */ java.util.List zzb(com.google.android.gms.internal.drive.zzmi r0) {
            java.util.List<com.google.android.gms.internal.drive.zzmp> r0 = r0.zzve
            return r0
    }

    static /* synthetic */ java.util.Map zzc(com.google.android.gms.internal.drive.zzmi r0) {
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r0.zzvf
            return r0
    }

    static /* synthetic */ java.util.Map zzd(com.google.android.gms.internal.drive.zzmi r0) {
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r0.zzvh
            return r0
    }

    private final void zzeu() {
            r1 = this;
            boolean r0 = r1.zzot
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    private final java.util.SortedMap<K, V> zzev() {
            r2 = this;
            r2.zzeu()
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r2.zzvf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L21
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r2.zzvf
            boolean r0 = r0 instanceof java.util.TreeMap
            if (r0 != 0) goto L21
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r2.zzvf = r0
            r1 = r0
            java.util.TreeMap r1 = (java.util.TreeMap) r1
            java.util.NavigableMap r0 = r0.descendingMap()
            r2.zzvh = r0
        L21:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r2.zzvf
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r1 = this;
            r1.zzeu()
            java.util.List<com.google.android.gms.internal.drive.zzmp> r0 = r1.zzve
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10
            java.util.List<com.google.android.gms.internal.drive.zzmp> r0 = r1.zzve
            r0.clear()
        L10:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.zzvf
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.zzvf
            r0.clear()
        L1d:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.zza(r2)
            if (r0 >= 0) goto L13
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.zzvf
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
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r2 = this;
            com.google.android.gms.internal.drive.zzmr r0 = r2.zzvg
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.drive.zzmr r0 = new com.google.android.gms.internal.drive.zzmr
            r1 = 0
            r0.<init>(r2, r1)
            r2.zzvg = r0
        Lc:
            com.google.android.gms.internal.drive.zzmr r0 = r2.zzvg
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.gms.internal.drive.zzmi
            if (r1 != 0) goto Ld
            boolean r8 = super.equals(r8)
            return r8
        Ld:
            com.google.android.gms.internal.drive.zzmi r8 = (com.google.android.gms.internal.drive.zzmi) r8
            int r1 = r7.size()
            int r2 = r8.size()
            r3 = 0
            if (r1 == r2) goto L1b
            return r3
        L1b:
            int r2 = r7.zzer()
            int r4 = r8.zzer()
            if (r2 == r4) goto L32
            java.util.Set r0 = r7.entrySet()
            java.util.Set r8 = r8.entrySet()
            boolean r8 = r0.equals(r8)
            return r8
        L32:
            r4 = 0
        L33:
            if (r4 >= r2) goto L47
            java.util.Map$Entry r5 = r7.zzaw(r4)
            java.util.Map$Entry r6 = r8.zzaw(r4)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L44
            return r3
        L44:
            int r4 = r4 + 1
            goto L33
        L47:
            if (r2 == r1) goto L52
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r7.zzvf
            java.util.Map<K extends java.lang.Comparable<K>, V> r8 = r8.zzvf
            boolean r8 = r0.equals(r8)
            return r8
        L52:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.zza(r2)
            if (r0 < 0) goto L15
            java.util.List<com.google.android.gms.internal.drive.zzmp> r2 = r1.zzve
            java.lang.Object r2 = r2.get(r0)
            com.google.android.gms.internal.drive.zzmp r2 = (com.google.android.gms.internal.drive.zzmp) r2
            java.lang.Object r2 = r2.getValue()
            return r2
        L15:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.zzvf
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
            r4 = this;
            int r0 = r4.zzer()
            r1 = 0
            r2 = 0
        L6:
            if (r1 >= r0) goto L18
            java.util.List<com.google.android.gms.internal.drive.zzmp> r3 = r4.zzve
            java.lang.Object r3 = r3.get(r1)
            com.google.android.gms.internal.drive.zzmp r3 = (com.google.android.gms.internal.drive.zzmp) r3
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L18:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r4.zzvf
            int r0 = r0.size()
            if (r0 <= 0) goto L27
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r4.zzvf
            int r0 = r0.hashCode()
            int r2 = r2 + r0
        L27:
            return r2
    }

    public final boolean isImmutable() {
            r1 = this;
            boolean r0 = r1.zzot
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r1 = r0.zza(r1, r2)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            r1.zzeu()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.zza(r2)
            if (r0 < 0) goto L10
            java.lang.Object r2 = r1.zzax(r0)
            return r2
        L10:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.zzvf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            r2 = 0
            return r2
        L1a:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.zzvf
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r2 = this;
            java.util.List<com.google.android.gms.internal.drive.zzmp> r0 = r2.zzve
            int r0 = r0.size()
            java.util.Map<K extends java.lang.Comparable<K>, V> r1 = r2.zzvf
            int r1 = r1.size()
            int r0 = r0 + r1
            return r0
    }

    public final V zza(K r5, V r6) {
            r4 = this;
            r4.zzeu()
            int r0 = r4.zza(r5)
            if (r0 < 0) goto L16
            java.util.List<com.google.android.gms.internal.drive.zzmp> r5 = r4.zzve
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.drive.zzmp r5 = (com.google.android.gms.internal.drive.zzmp) r5
            java.lang.Object r5 = r5.setValue(r6)
            return r5
        L16:
            r4.zzeu()
            java.util.List<com.google.android.gms.internal.drive.zzmp> r1 = r4.zzve
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L30
            java.util.List<com.google.android.gms.internal.drive.zzmp> r1 = r4.zzve
            boolean r1 = r1 instanceof java.util.ArrayList
            if (r1 != 0) goto L30
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r4.zzvd
            r1.<init>(r2)
            r4.zzve = r1
        L30:
            int r0 = r0 + 1
            int r0 = -r0
            int r1 = r4.zzvd
            if (r0 < r1) goto L40
            java.util.SortedMap r0 = r4.zzev()
            java.lang.Object r5 = r0.put(r5, r6)
            return r5
        L40:
            java.util.List<com.google.android.gms.internal.drive.zzmp> r1 = r4.zzve
            int r1 = r1.size()
            int r2 = r4.zzvd
            if (r1 != r2) goto L65
            java.util.List<com.google.android.gms.internal.drive.zzmp> r1 = r4.zzve
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.remove(r2)
            com.google.android.gms.internal.drive.zzmp r1 = (com.google.android.gms.internal.drive.zzmp) r1
            java.util.SortedMap r2 = r4.zzev()
            java.lang.Object r3 = r1.getKey()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            java.lang.Object r1 = r1.getValue()
            r2.put(r3, r1)
        L65:
            java.util.List<com.google.android.gms.internal.drive.zzmp> r1 = r4.zzve
            com.google.android.gms.internal.drive.zzmp r2 = new com.google.android.gms.internal.drive.zzmp
            r2.<init>(r4, r5, r6)
            r1.add(r0, r2)
            r5 = 0
            return r5
    }

    public final java.util.Map.Entry<K, V> zzaw(int r2) {
            r1 = this;
            java.util.List<com.google.android.gms.internal.drive.zzmp> r0 = r1.zzve
            java.lang.Object r2 = r0.get(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            return r2
    }

    public void zzbp() {
            r1 = this;
            boolean r0 = r1.zzot
            if (r0 != 0) goto L31
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.zzvf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L17
        L11:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.zzvf
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L17:
            r1.zzvf = r0
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.zzvh
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L26
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L2c
        L26:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.zzvh
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L2c:
            r1.zzvh = r0
            r0 = 1
            r1.zzot = r0
        L31:
            return
    }

    public final int zzer() {
            r1 = this;
            java.util.List<com.google.android.gms.internal.drive.zzmp> r0 = r1.zzve
            int r0 = r0.size()
            return r0
    }

    public final java.lang.Iterable<java.util.Map.Entry<K, V>> zzes() {
            r1 = this;
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.zzvf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.lang.Iterable r0 = com.google.android.gms.internal.drive.zzmm.zzex()
            return r0
        Ld:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.zzvf
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    final java.util.Set<java.util.Map.Entry<K, V>> zzet() {
            r2 = this;
            com.google.android.gms.internal.drive.zzml r0 = r2.zzvi
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.drive.zzml r0 = new com.google.android.gms.internal.drive.zzml
            r1 = 0
            r0.<init>(r2, r1)
            r2.zzvi = r0
        Lc:
            com.google.android.gms.internal.drive.zzml r0 = r2.zzvi
            return r0
    }
}
