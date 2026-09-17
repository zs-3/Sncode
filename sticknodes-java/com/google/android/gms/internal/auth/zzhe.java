package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zzhe extends java.util.AbstractList implements java.util.RandomAccess, com.google.android.gms.internal.auth.zzff {
    private final com.google.android.gms.internal.auth.zzff zza;

    public zzhe(com.google.android.gms.internal.auth.zzff r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzff zza(com.google.android.gms.internal.auth.zzhe r0) {
            com.google.android.gms.internal.auth.zzff r0 = r0.zza
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            com.google.android.gms.internal.auth.zzff r0 = r1.zza
            com.google.android.gms.internal.auth.zzfe r0 = (com.google.android.gms.internal.auth.zzfe) r0
            java.lang.String r2 = r0.zzf(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.auth.zzhd r0 = new com.google.android.gms.internal.auth.zzhd
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            com.google.android.gms.internal.auth.zzhc r0 = new com.google.android.gms.internal.auth.zzhc
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.auth.zzff r0 = r1.zza
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final com.google.android.gms.internal.auth.zzff zze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final java.util.List zzg() {
            r1 = this;
            com.google.android.gms.internal.auth.zzff r0 = r1.zza
            java.util.List r0 = r0.zzg()
            return r0
    }
}
