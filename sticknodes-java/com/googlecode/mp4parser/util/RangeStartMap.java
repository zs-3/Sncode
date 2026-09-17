package com.googlecode.mp4parser.util;

import java.lang.Comparable;

/* loaded from: classes2.dex */
public class RangeStartMap<K extends java.lang.Comparable, V> implements java.util.Map<K, V> {
    java.util.TreeMap<K, V> base;


    public RangeStartMap() {
            r2 = this;
            r2.<init>()
            java.util.TreeMap r0 = new java.util.TreeMap
            com.googlecode.mp4parser.util.RangeStartMap$1 r1 = new com.googlecode.mp4parser.util.RangeStartMap$1
            r1.<init>(r2)
            r0.<init>(r1)
            r2.base = r0
            return
    }

    public RangeStartMap(K r3, V r4) {
            r2 = this;
            r2.<init>()
            java.util.TreeMap r0 = new java.util.TreeMap
            com.googlecode.mp4parser.util.RangeStartMap$1 r1 = new com.googlecode.mp4parser.util.RangeStartMap$1
            r1.<init>(r2)
            r0.<init>(r1)
            r2.base = r0
            r2.put(r3, r4)
            return
    }

    @Override // java.util.Map
    public void clear() {
            r1 = this;
            java.util.TreeMap<K extends java.lang.Comparable, V> r0 = r1.base
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.TreeMap<K extends java.lang.Comparable, V> r0 = r1.base
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.TreeMap<K extends java.lang.Comparable, V> r0 = r1.base
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Map
    public V get(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Comparable
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lf
            return r1
        Lf:
            java.util.TreeMap<K extends java.lang.Comparable, V> r0 = r3.base
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r1 = r0.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L1f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            int r2 = r4.compareTo(r1)
            if (r2 >= 0) goto L32
            java.lang.Object r1 = r0.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            goto L1f
        L32:
            java.util.TreeMap<K extends java.lang.Comparable, V> r4 = r3.base
            java.lang.Object r4 = r4.get(r1)
            return r4
        L39:
            java.util.TreeMap<K extends java.lang.Comparable, V> r4 = r3.base
            java.lang.Object r4 = r4.get(r1)
            return r4
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.TreeMap<K extends java.lang.Comparable, V> r0 = r1.base
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.TreeMap<K extends java.lang.Comparable, V> r0 = r1.base
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public V put(K r2, V r3) {
            r1 = this;
            java.util.TreeMap<K extends java.lang.Comparable, V> r0 = r1.base
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r1 = r0.put(r1, r2)
            return r1
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.util.TreeMap<K extends java.lang.Comparable, V> r0 = r1.base
            r0.putAll(r2)
            return
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Comparable
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lf
            return r1
        Lf:
            java.util.TreeMap<K extends java.lang.Comparable, V> r0 = r3.base
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r1 = r0.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L1f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            int r2 = r4.compareTo(r1)
            if (r2 >= 0) goto L32
            java.lang.Object r1 = r0.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            goto L1f
        L32:
            java.util.TreeMap<K extends java.lang.Comparable, V> r4 = r3.base
            java.lang.Object r4 = r4.remove(r1)
            return r4
        L39:
            java.util.TreeMap<K extends java.lang.Comparable, V> r4 = r3.base
            java.lang.Object r4 = r4.remove(r1)
            return r4
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            java.util.TreeMap<K extends java.lang.Comparable, V> r0 = r1.base
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.TreeMap<K extends java.lang.Comparable, V> r0 = r1.base
            java.util.Collection r0 = r0.values()
            return r0
    }
}
