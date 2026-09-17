package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgza;
import com.google.android.gms.internal.ads.zzgzb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgza<MessageType extends com.google.android.gms.internal.ads.zzgzb<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzgza<MessageType, BuilderType>> implements com.google.android.gms.internal.ads.zzhco {
    public zzgza() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String zza(java.lang.String r4) {
            r3 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Reading "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " from a "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = " threw an IOException (should never happen)."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    private static <T> void zzb(java.lang.Iterable<T> r3, java.util.List<? super T> r4) {
            boolean r0 = r4 instanceof java.util.ArrayList
            if (r0 == 0) goto L1a
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L1a
            r0 = r4
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r4.size()
            r2 = r3
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
        L1a:
            int r0 = r4.size()
            java.util.Iterator r3 = r3.iterator()
        L22:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r3.next()
            if (r1 != 0) goto L5b
            int r3 = r4.size()
            int r3 = r3 - r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Element at index "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is null."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            int r1 = r4.size()
        L4d:
            int r1 = r1 + (-1)
            if (r1 < r0) goto L55
            r4.remove(r1)
            goto L4d
        L55:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r3)
            throw r4
        L5b:
            r4.add(r1)
            goto L22
        L5f:
            return
    }

    protected static com.google.android.gms.internal.ads.zzhdx zzbb(com.google.android.gms.internal.ads.zzhcp r1) {
            com.google.android.gms.internal.ads.zzhdx r0 = new com.google.android.gms.internal.ads.zzhdx
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    protected static <T> void zzbc(java.lang.Iterable<T> r0, java.util.Collection<? super T> r1) {
            java.util.List r1 = (java.util.List) r1
            zzbd(r0, r1)
            return
    }

    protected static <T> void zzbd(java.lang.Iterable<T> r4, java.util.List<? super T> r5) {
            byte[] r0 = com.google.android.gms.internal.ads.zzhbr.zzb
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzhcb
            if (r0 == 0) goto L73
            com.google.android.gms.internal.ads.zzhcb r4 = (com.google.android.gms.internal.ads.zzhcb) r4
            java.util.List r4 = r4.zza()
            r0 = r5
            com.google.android.gms.internal.ads.zzhcb r0 = (com.google.android.gms.internal.ads.zzhcb) r0
            int r5 = r5.size()
            java.util.Iterator r4 = r4.iterator()
        L1a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r4.next()
            if (r1 != 0) goto L53
            int r4 = r0.size()
            int r4 = r4 - r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Element at index "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is null."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            int r1 = r0.size()
        L45:
            int r1 = r1 + (-1)
            if (r1 < r5) goto L4d
            r0.remove(r1)
            goto L45
        L4d:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r4)
            throw r5
        L53:
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzgzs
            if (r2 == 0) goto L5d
            com.google.android.gms.internal.ads.zzgzs r1 = (com.google.android.gms.internal.ads.zzgzs) r1
            r0.zzb()
            goto L1a
        L5d:
            boolean r2 = r1 instanceof byte[]
            if (r2 == 0) goto L6c
            r2 = 0
            byte[] r1 = (byte[]) r1
            int r3 = r1.length
            com.google.android.gms.internal.ads.zzgzs.zzv(r1, r2, r3)
            r0.zzb()
            goto L1a
        L6c:
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L1a
        L72:
            return
        L73:
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzhcy
            if (r0 == 0) goto L7d
            java.util.Collection r4 = (java.util.Collection) r4
            r5.addAll(r4)
            return
        L7d:
            zzb(r4, r5)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.google.android.gms.internal.ads.zzgza r0 = r1.zzaC()
            return r0
    }

    public abstract BuilderType zzaC();

    protected abstract BuilderType zzaD(MessageType r1);

    public BuilderType zzaE(com.google.android.gms.internal.ads.zzgzs r3) throws com.google.android.gms.internal.ads.zzhbt {
            r2 = this;
            com.google.android.gms.internal.ads.zzhac r3 = r3.zzl()     // Catch: java.io.IOException -> Lc com.google.android.gms.internal.ads.zzhbt -> L19
            r2.zzaF(r3)     // Catch: java.io.IOException -> Lc com.google.android.gms.internal.ads.zzhbt -> L19
            r0 = 0
            r3.zzy(r0)     // Catch: java.io.IOException -> Lc com.google.android.gms.internal.ads.zzhbt -> L19
            return r2
        Lc:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "ByteString"
            java.lang.String r1 = r2.zza(r1)
            r0.<init>(r1, r3)
            throw r0
        L19:
            r3 = move-exception
            throw r3
    }

    public BuilderType zzaF(com.google.android.gms.internal.ads.zzhac r2) throws java.io.IOException {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzhao.zzb
            int r0 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhao r0 = com.google.android.gms.internal.ads.zzhao.zza
            com.google.android.gms.internal.ads.zzgza r2 = r1.zzaK(r2, r0)
            return r2
    }

    public BuilderType zzaG(com.google.android.gms.internal.ads.zzhcp r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzhcp r0 = r1.zzbt()
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isInstance(r2)
            if (r0 == 0) goto L15
            com.google.android.gms.internal.ads.zzgzb r2 = (com.google.android.gms.internal.ads.zzgzb) r2
            com.google.android.gms.internal.ads.zzgza r2 = r1.zzaD(r2)
            return r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "mergeFrom(MessageLite) can only merge messages of the same type."
            r2.<init>(r0)
            throw r2
    }

    public BuilderType zzaH(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            com.google.android.gms.internal.ads.zzhac r2 = com.google.android.gms.internal.ads.zzhac.zzG(r2, r0)
            r1.zzaF(r2)
            r0 = 0
            r2.zzy(r0)
            return r1
    }

    public BuilderType zzaI(byte[] r3) throws com.google.android.gms.internal.ads.zzhbt {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            com.google.android.gms.internal.ads.zzgza r3 = r2.zzaN(r3, r1, r0)
            return r3
    }

    public BuilderType zzaJ(com.google.android.gms.internal.ads.zzgzs r2, com.google.android.gms.internal.ads.zzhao r3) throws com.google.android.gms.internal.ads.zzhbt {
            r1 = this;
            com.google.android.gms.internal.ads.zzhac r2 = r2.zzl()     // Catch: java.io.IOException -> Lc com.google.android.gms.internal.ads.zzhbt -> L19
            r1.zzaK(r2, r3)     // Catch: java.io.IOException -> Lc com.google.android.gms.internal.ads.zzhbt -> L19
            r3 = 0
            r2.zzy(r3)     // Catch: java.io.IOException -> Lc com.google.android.gms.internal.ads.zzhbt -> L19
            return r1
        Lc:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "ByteString"
            java.lang.String r0 = r1.zza(r0)
            r3.<init>(r0, r2)
            throw r3
        L19:
            r2 = move-exception
            throw r2
    }

    public abstract BuilderType zzaK(com.google.android.gms.internal.ads.zzhac r1, com.google.android.gms.internal.ads.zzhao r2) throws java.io.IOException;

    public BuilderType zzaL(java.io.InputStream r2, com.google.android.gms.internal.ads.zzhao r3) throws java.io.IOException {
            r1 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            com.google.android.gms.internal.ads.zzhac r2 = com.google.android.gms.internal.ads.zzhac.zzG(r2, r0)
            r1.zzaK(r2, r3)
            r3 = 0
            r2.zzy(r3)
            return r1
    }

    public BuilderType zzaM(byte[] r3, com.google.android.gms.internal.ads.zzhao r4) throws com.google.android.gms.internal.ads.zzhbt {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            com.google.android.gms.internal.ads.zzgza r3 = r2.zzaO(r3, r1, r0, r4)
            return r3
    }

    public BuilderType zzaN(byte[] r2, int r3, int r4) throws com.google.android.gms.internal.ads.zzhbt {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzhac r2 = com.google.android.gms.internal.ads.zzhac.zzH(r2, r3, r4, r0)     // Catch: java.io.IOException -> Lc com.google.android.gms.internal.ads.zzhbt -> L19
            r1.zzaF(r2)     // Catch: java.io.IOException -> Lc com.google.android.gms.internal.ads.zzhbt -> L19
            r2.zzy(r0)     // Catch: java.io.IOException -> Lc com.google.android.gms.internal.ads.zzhbt -> L19
            return r1
        Lc:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "byte array"
            java.lang.String r4 = r1.zza(r4)
            r3.<init>(r4, r2)
            throw r3
        L19:
            r2 = move-exception
            throw r2
    }

    public BuilderType zzaO(byte[] r2, int r3, int r4, com.google.android.gms.internal.ads.zzhao r5) throws com.google.android.gms.internal.ads.zzhbt {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzhac r2 = com.google.android.gms.internal.ads.zzhac.zzH(r2, r3, r4, r0)     // Catch: java.io.IOException -> Lc com.google.android.gms.internal.ads.zzhbt -> L19
            r1.zzaK(r2, r5)     // Catch: java.io.IOException -> Lc com.google.android.gms.internal.ads.zzhbt -> L19
            r2.zzy(r0)     // Catch: java.io.IOException -> Lc com.google.android.gms.internal.ads.zzhbt -> L19
            return r1
        Lc:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "byte array"
            java.lang.String r4 = r1.zza(r4)
            r3.<init>(r4, r2)
            throw r3
        L19:
            r2 = move-exception
            throw r2
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaP() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgza r0 = r1.zzaC()
            return r0
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaQ(com.google.android.gms.internal.ads.zzgzs r1) throws com.google.android.gms.internal.ads.zzhbt {
            r0 = this;
            r0.zzaE(r1)
            return r0
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaR(com.google.android.gms.internal.ads.zzhac r1) throws java.io.IOException {
            r0 = this;
            com.google.android.gms.internal.ads.zzgza r1 = r0.zzaF(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaS(com.google.android.gms.internal.ads.zzhcp r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzgza r1 = r0.zzaG(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaT(java.io.InputStream r1) throws java.io.IOException {
            r0 = this;
            r0.zzaH(r1)
            return r0
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaU(byte[] r1) throws com.google.android.gms.internal.ads.zzhbt {
            r0 = this;
            com.google.android.gms.internal.ads.zzgza r1 = r0.zzaI(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaV(com.google.android.gms.internal.ads.zzgzs r1, com.google.android.gms.internal.ads.zzhao r2) throws com.google.android.gms.internal.ads.zzhbt {
            r0 = this;
            r0.zzaJ(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaW(com.google.android.gms.internal.ads.zzhac r1, com.google.android.gms.internal.ads.zzhao r2) throws java.io.IOException {
            r0 = this;
            com.google.android.gms.internal.ads.zzgza r1 = r0.zzaK(r1, r2)
            return r1
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaX(java.io.InputStream r1, com.google.android.gms.internal.ads.zzhao r2) throws java.io.IOException {
            r0 = this;
            r0.zzaL(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaY(byte[] r1, com.google.android.gms.internal.ads.zzhao r2) throws com.google.android.gms.internal.ads.zzhbt {
            r0 = this;
            com.google.android.gms.internal.ads.zzgza r1 = r0.zzaM(r1, r2)
            return r1
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaZ(byte[] r1, int r2, int r3) throws com.google.android.gms.internal.ads.zzhbt {
            r0 = this;
            com.google.android.gms.internal.ads.zzgza r1 = r0.zzaN(r1, r2, r3)
            return r1
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzba(byte[] r1, int r2, int r3, com.google.android.gms.internal.ads.zzhao r4) throws com.google.android.gms.internal.ads.zzhbt {
            r0 = this;
            com.google.android.gms.internal.ads.zzgza r1 = r0.zzaO(r1, r2, r3, r4)
            return r1
    }

    public boolean zzbe(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzhao.zzb
            int r0 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhao r0 = com.google.android.gms.internal.ads.zzhao.zza
            boolean r2 = r1.zzbf(r2, r0)
            return r2
    }

    public boolean zzbf(java.io.InputStream r3, com.google.android.gms.internal.ads.zzhao r4) throws java.io.IOException {
            r2 = this;
            int r0 = r3.read()
            r1 = -1
            if (r0 != r1) goto L9
            r3 = 0
            return r3
        L9:
            int r0 = com.google.android.gms.internal.ads.zzhac.zzE(r0, r3)
            com.google.android.gms.internal.ads.zzgyz r1 = new com.google.android.gms.internal.ads.zzgyz
            r1.<init>(r3, r0)
            r2.zzaL(r1, r4)
            r3 = 1
            return r3
    }
}
