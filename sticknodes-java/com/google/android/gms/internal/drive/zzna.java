package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzna extends java.util.AbstractList<java.lang.String> implements com.google.android.gms.internal.drive.zzkz, java.util.RandomAccess {
    private final com.google.android.gms.internal.drive.zzkz zzvt;

    public zzna(com.google.android.gms.internal.drive.zzkz r1) {
            r0 = this;
            r0.<init>()
            r0.zzvt = r1
            return
    }

    static /* synthetic */ com.google.android.gms.internal.drive.zzkz zza(com.google.android.gms.internal.drive.zzna r0) {
            com.google.android.gms.internal.drive.zzkz r0 = r0.zzvt
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzkz r0 = r1.zzvt
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            com.google.android.gms.internal.drive.zznc r0 = new com.google.android.gms.internal.drive.zznc
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<java.lang.String> listIterator(int r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zznb r0 = new com.google.android.gms.internal.drive.zznb
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.drive.zzkz r0 = r1.zzvt
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final java.lang.Object zzao(int r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzkz r0 = r1.zzvt
            java.lang.Object r2 = r0.zzao(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final java.util.List<?> zzdr() {
            r1 = this;
            com.google.android.gms.internal.drive.zzkz r0 = r1.zzvt
            java.util.List r0 = r0.zzdr()
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final com.google.android.gms.internal.drive.zzkz zzds() {
            r0 = this;
            return r0
    }
}
