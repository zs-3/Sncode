package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzfe extends com.google.android.gms.internal.auth.zzdr implements java.util.RandomAccess, com.google.android.gms.internal.auth.zzff {

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.auth.zzff zza = null;
    private static final com.google.android.gms.internal.auth.zzfe zzb = null;
    private final java.util.List zzc;

    static {
            com.google.android.gms.internal.auth.zzfe r0 = new com.google.android.gms.internal.auth.zzfe
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.auth.zzfe.zzb = r0
            com.google.android.gms.internal.auth.zzfe.zza = r0
            return
    }

    public zzfe() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public zzfe(int r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r2 = 1
            r1.<init>(r2)
            r1.zzc = r0
            return
    }

    private zzfe(java.util.ArrayList r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.zzc = r2
            return
    }

    private zzfe(boolean r1) {
            r0 = this;
            r1 = 0
            r0.<init>(r1)
            java.util.List r1 = java.util.Collections.emptyList()
            r0.zzc = r1
            return
    }

    private static java.lang.String zzh(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L7
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L7:
            boolean r0 = r1 instanceof com.google.android.gms.internal.auth.zzef
            if (r0 == 0) goto L14
            com.google.android.gms.internal.auth.zzef r1 = (com.google.android.gms.internal.auth.zzef) r1
            java.nio.charset.Charset r0 = com.google.android.gms.internal.auth.zzfa.zzb
            java.lang.String r1 = r1.zzl(r0)
            return r1
        L14:
            byte[] r1 = (byte[]) r1
            java.lang.String r1 = com.google.android.gms.internal.auth.zzfa.zzd(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r1.zza()
            java.util.List r0 = r1.zzc
            r0.add(r2, r3)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final boolean addAll(int r2, java.util.Collection r3) {
            r1 = this;
            r1.zza()
            boolean r0 = r3 instanceof com.google.android.gms.internal.auth.zzff
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.auth.zzff r3 = (com.google.android.gms.internal.auth.zzff) r3
            java.util.List r3 = r3.zzg()
        Ld:
            java.util.List r0 = r1.zzc
            boolean r2 = r0.addAll(r2, r3)
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
            return r2
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.size()
            boolean r2 = r1.addAll(r0, r2)
            return r2
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r1 = this;
            r1.zza()
            java.util.List r0 = r1.zzc
            r0.clear()
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.String r1 = r0.zzf(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r2) {
            r1 = this;
            r1.zza()
            java.util.List r0 = r1.zzc
            java.lang.Object r2 = r0.remove(r2)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            java.lang.String r2 = zzh(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r1.zza()
            java.util.List r0 = r1.zzc
            java.lang.Object r2 = r0.set(r2, r3)
            java.lang.String r2 = zzh(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            java.util.List r0 = r1.zzc
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzez zzd(int r2) {
            r1 = this;
            int r0 = r1.size()
            if (r2 < r0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.util.List r2 = r1.zzc
            r0.addAll(r2)
            com.google.android.gms.internal.auth.zzfe r2 = new com.google.android.gms.internal.auth.zzfe
            r2.<init>(r0)
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final com.google.android.gms.internal.auth.zzff zze() {
            r1 = this;
            boolean r0 = r1.zzc()
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.auth.zzhe r0 = new com.google.android.gms.internal.auth.zzhe
            r0.<init>(r1)
            return r0
        Lc:
            return r1
    }

    public final java.lang.String zzf(int r3) {
            r2 = this;
            java.util.List r0 = r2.zzc
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld:
            boolean r1 = r0 instanceof com.google.android.gms.internal.auth.zzef
            if (r1 == 0) goto L25
            com.google.android.gms.internal.auth.zzef r0 = (com.google.android.gms.internal.auth.zzef) r0
            java.nio.charset.Charset r1 = com.google.android.gms.internal.auth.zzfa.zzb
            java.lang.String r1 = r0.zzl(r1)
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L24
            java.util.List r0 = r2.zzc
            r0.set(r3, r1)
        L24:
            return r1
        L25:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = com.google.android.gms.internal.auth.zzfa.zzd(r0)
            boolean r0 = com.google.android.gms.internal.auth.zzhn.zzb(r0)
            if (r0 == 0) goto L36
            java.util.List r0 = r2.zzc
            r0.set(r3, r1)
        L36:
            return r1
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final java.util.List zzg() {
            r1 = this;
            java.util.List r0 = r1.zzc
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }
}
