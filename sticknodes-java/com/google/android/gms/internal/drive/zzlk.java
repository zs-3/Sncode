package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzlk<K, V> extends java.util.LinkedHashMap<K, V> {
    private static final com.google.android.gms.internal.drive.zzlk zzty = null;
    private boolean zznh;

    static {
            com.google.android.gms.internal.drive.zzlk r0 = new com.google.android.gms.internal.drive.zzlk
            r0.<init>()
            com.google.android.gms.internal.drive.zzlk.zzty = r0
            r1 = 0
            r0.zznh = r1
            return
    }

    private zzlk() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zznh = r0
            return
    }

    private zzlk(java.util.Map<K, V> r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.zznh = r1
            return
    }

    public static <K, V> com.google.android.gms.internal.drive.zzlk<K, V> zzdw() {
            com.google.android.gms.internal.drive.zzlk r0 = com.google.android.gms.internal.drive.zzlk.zzty
            return r0
    }

    private final void zzdy() {
            r1 = this;
            boolean r0 = r1.zznh
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    private static int zzg(java.lang.Object r1) {
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto Lb
            byte[] r1 = (byte[]) r1
            int r1 = com.google.android.gms.internal.drive.zzkm.hashCode(r1)
            return r1
        Lb:
            boolean r0 = r1 instanceof com.google.android.gms.internal.drive.zzkn
            if (r0 != 0) goto L14
            int r1 = r1.hashCode()
            return r1
        L14:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
            r0 = this;
            r0.zzdy()
            super.clear()
            return
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
        Lb:
            java.util.Set r0 = super.entrySet()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L59
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L16
        L14:
            r7 = 0
            goto L5a
        L16:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
            goto L14
        L59:
            r7 = 1
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
            r4 = this;
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            int r3 = zzg(r3)
            java.lang.Object r2 = r2.getValue()
            int r2 = zzg(r2)
            r2 = r2 ^ r3
            int r1 = r1 + r2
            goto L9
        L28:
            return r1
    }

    public final boolean isMutable() {
            r1 = this;
            boolean r0 = r1.zznh
            return r0
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K r1, V r2) {
            r0 = this;
            r0.zzdy()
            com.google.android.gms.internal.drive.zzkm.checkNotNull(r1)
            com.google.android.gms.internal.drive.zzkm.checkNotNull(r2)
            java.lang.Object r1 = super.put(r1, r2)
            return r1
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            r2.zzdy()
            java.util.Set r0 = r3.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.drive.zzkm.checkNotNull(r1)
            java.lang.Object r1 = r3.get(r1)
            com.google.android.gms.internal.drive.zzkm.checkNotNull(r1)
            goto Lb
        L20:
            super.putAll(r3)
            return
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object r1) {
            r0 = this;
            r0.zzdy()
            java.lang.Object r1 = super.remove(r1)
            return r1
    }

    public final void zza(com.google.android.gms.internal.drive.zzlk<K, V> r2) {
            r1 = this;
            r1.zzdy()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lc
            r1.putAll(r2)
        Lc:
            return
    }

    public final void zzbp() {
            r1 = this;
            r0 = 0
            r1.zznh = r0
            return
    }

    public final com.google.android.gms.internal.drive.zzlk<K, V> zzdx() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.drive.zzlk r0 = new com.google.android.gms.internal.drive.zzlk
            r0.<init>()
            return r0
        Lc:
            com.google.android.gms.internal.drive.zzlk r0 = new com.google.android.gms.internal.drive.zzlk
            r0.<init>(r1)
            return r0
    }
}
