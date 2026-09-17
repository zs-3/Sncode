package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzky extends com.google.android.gms.internal.drive.zziw<java.lang.String> implements com.google.android.gms.internal.drive.zzkz, java.util.RandomAccess {
    private static final com.google.android.gms.internal.drive.zzky zztk = null;
    private static final com.google.android.gms.internal.drive.zzkz zztl = null;
    private final java.util.List<java.lang.Object> zziu;

    static {
            com.google.android.gms.internal.drive.zzky r0 = new com.google.android.gms.internal.drive.zzky
            r0.<init>()
            com.google.android.gms.internal.drive.zzky.zztk = r0
            r0.zzbp()
            com.google.android.gms.internal.drive.zzky.zztl = r0
            return
    }

    public zzky() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public zzky(int r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    private zzky(java.util.ArrayList<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.zziu = r1
            return
    }

    private static java.lang.String zzf(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L7
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L7:
            boolean r0 = r1 instanceof com.google.android.gms.internal.drive.zzjc
            if (r0 == 0) goto L12
            com.google.android.gms.internal.drive.zzjc r1 = (com.google.android.gms.internal.drive.zzjc) r1
            java.lang.String r1 = r1.zzbt()
            return r1
        L12:
            byte[] r1 = (byte[]) r1
            java.lang.String r1 = com.google.android.gms.internal.drive.zzkm.zze(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r1.zzbq()
            java.util.List<java.lang.Object> r0 = r1.zziu
            r0.add(r2, r3)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final boolean addAll(int r2, java.util.Collection<? extends java.lang.String> r3) {
            r1 = this;
            r1.zzbq()
            boolean r0 = r3 instanceof com.google.android.gms.internal.drive.zzkz
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.drive.zzkz r3 = (com.google.android.gms.internal.drive.zzkz) r3
            java.util.List r3 = r3.zzdr()
        Ld:
            java.util.List<java.lang.Object> r0 = r1.zziu
            boolean r2 = r0.addAll(r2, r3)
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
            return r2
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.String> r2) {
            r1 = this;
            int r0 = r1.size()
            boolean r2 = r1.addAll(r0, r2)
            return r2
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r1 = this;
            r1.zzbq()
            java.util.List<java.lang.Object> r0 = r1.zziu
            r0.clear()
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int r3) {
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.zziu
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld:
            boolean r1 = r0 instanceof com.google.android.gms.internal.drive.zzjc
            if (r1 == 0) goto L23
            com.google.android.gms.internal.drive.zzjc r0 = (com.google.android.gms.internal.drive.zzjc) r0
            java.lang.String r1 = r0.zzbt()
            boolean r0 = r0.zzbu()
            if (r0 == 0) goto L22
            java.util.List<java.lang.Object> r0 = r2.zziu
            r0.set(r3, r1)
        L22:
            return r1
        L23:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = com.google.android.gms.internal.drive.zzkm.zze(r0)
            boolean r0 = com.google.android.gms.internal.drive.zzkm.zzd(r0)
            if (r0 == 0) goto L34
            java.util.List<java.lang.Object> r0 = r2.zziu
            r0.set(r3, r1)
        L34:
            return r1
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int r2) {
            r1 = this;
            r1.zzbq()
            java.util.List<java.lang.Object> r0 = r1.zziu
            java.lang.Object r2 = r0.remove(r2)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            java.lang.String r2 = zzf(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.removeAll(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.retainAll(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r1.zzbq()
            java.util.List<java.lang.Object> r0 = r1.zziu
            java.lang.Object r2 = r0.set(r2, r3)
            java.lang.String r2 = zzf(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.zziu
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final java.lang.Object zzao(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.zziu
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.drive.zziw, com.google.android.gms.internal.drive.zzkp
    public final /* bridge */ /* synthetic */ boolean zzbo() {
            r1 = this;
            boolean r0 = super.zzbo()
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final java.util.List<?> zzdr() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.zziu
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final com.google.android.gms.internal.drive.zzkz zzds() {
            r1 = this;
            boolean r0 = r1.zzbo()
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.drive.zzna r0 = new com.google.android.gms.internal.drive.zzna
            r0.<init>(r1)
            return r0
        Lc:
            return r1
    }

    @Override // com.google.android.gms.internal.drive.zzkp
    public final /* synthetic */ com.google.android.gms.internal.drive.zzkp zzr(int r2) {
            r1 = this;
            int r0 = r1.size()
            if (r2 < r0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.util.List<java.lang.Object> r2 = r1.zziu
            r0.addAll(r2)
            com.google.android.gms.internal.drive.zzky r2 = new com.google.android.gms.internal.drive.zzky
            r2.<init>(r0)
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }
}
