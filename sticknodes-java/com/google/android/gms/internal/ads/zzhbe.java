package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzhbe<MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzhay<MessageType, BuilderType>> extends com.google.android.gms.internal.ads.zzgzb<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Object, com.google.android.gms.internal.ads.zzhbe<?, ?>> zzc = null;
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd;
    protected com.google.android.gms.internal.ads.zzhdz zzt;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.android.gms.internal.ads.zzhbe.zzc = r0
            return
    }

    public zzhbe() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.zzd = r0
            com.google.android.gms.internal.ads.zzhdz r0 = com.google.android.gms.internal.ads.zzhdz.zzc()
            r1.zzt = r0
            return
    }

    protected static com.google.android.gms.internal.ads.zzhbg zzbA() {
            com.google.android.gms.internal.ads.zzgzi r0 = com.google.android.gms.internal.ads.zzgzi.zzd()
            return r0
    }

    protected static com.google.android.gms.internal.ads.zzhbg zzbB(com.google.android.gms.internal.ads.zzhbg r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto La
        L9:
            int r0 = r0 + r0
        La:
            com.google.android.gms.internal.ads.zzhbg r1 = r1.zze(r0)
            return r1
    }

    protected static com.google.android.gms.internal.ads.zzhbh zzbC() {
            com.google.android.gms.internal.ads.zzhal r0 = com.google.android.gms.internal.ads.zzhal.zze()
            return r0
    }

    protected static com.google.android.gms.internal.ads.zzhbh zzbD(com.google.android.gms.internal.ads.zzhbh r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto La
        L9:
            int r0 = r0 + r0
        La:
            com.google.android.gms.internal.ads.zzhbh r1 = r1.zzg(r0)
            return r1
    }

    protected static com.google.android.gms.internal.ads.zzhbl zzbE() {
            com.google.android.gms.internal.ads.zzhav r0 = com.google.android.gms.internal.ads.zzhav.zze()
            return r0
    }

    protected static com.google.android.gms.internal.ads.zzhbl zzbF(com.google.android.gms.internal.ads.zzhbl r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto La
        L9:
            int r0 = r0 + r0
        La:
            com.google.android.gms.internal.ads.zzhbl r1 = r1.zzg(r0)
            return r1
    }

    protected static com.google.android.gms.internal.ads.zzhbm zzbG() {
            com.google.android.gms.internal.ads.zzhbf r0 = com.google.android.gms.internal.ads.zzhbf.zzg()
            return r0
    }

    protected static com.google.android.gms.internal.ads.zzhbm zzbH(com.google.android.gms.internal.ads.zzhbm r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto La
        L9:
            int r0 = r0 + r0
        La:
            com.google.android.gms.internal.ads.zzhbm r1 = r1.zzh(r0)
            return r1
    }

    protected static com.google.android.gms.internal.ads.zzhbp zzbI() {
            com.google.android.gms.internal.ads.zzhce r0 = com.google.android.gms.internal.ads.zzhce.zzh()
            return r0
    }

    protected static com.google.android.gms.internal.ads.zzhbp zzbJ(com.google.android.gms.internal.ads.zzhbp r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto La
        L9:
            int r0 = r0 + r0
        La:
            com.google.android.gms.internal.ads.zzhbp r1 = r1.zze(r0)
            return r1
    }

    protected static <E> com.google.android.gms.internal.ads.zzhbq<E> zzbK() {
            com.google.android.gms.internal.ads.zzhda r0 = com.google.android.gms.internal.ads.zzhda.zzd()
            return r0
    }

    protected static <E> com.google.android.gms.internal.ads.zzhbq<E> zzbL(com.google.android.gms.internal.ads.zzhbq<E> r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto La
        L9:
            int r0 = r0 + r0
        La:
            com.google.android.gms.internal.ads.zzhbq r1 = r1.zzf(r0)
            return r1
    }

    static java.lang.Object zzbR(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L5 java.lang.IllegalAccessException -> L20
            return r0
        L5:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 != 0) goto L1d
            boolean r1 = r0 instanceof java.lang.Error
            if (r1 == 0) goto L15
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L15:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected exception thrown by generated accessor method."
            r1.<init>(r2, r0)
            throw r1
        L1d:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L20:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't use Java reflection to implement protocol message reflection."
            r1.<init>(r2, r0)
            throw r1
    }

    protected static java.lang.Object zzbS(com.google.android.gms.internal.ads.zzhcp r1, java.lang.String r2, java.lang.Object[] r3) {
            com.google.android.gms.internal.ads.zzhdb r0 = new com.google.android.gms.internal.ads.zzhdb
            r0.<init>(r1, r2, r3)
            return r0
    }

    static java.lang.reflect.Method zzbT(java.lang.Class r3, java.lang.String r4, java.lang.Class... r5) {
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L5
            return r3
        L5:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Generated message class \""
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "\" missing method \""
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "\"."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r5)
            throw r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhbc zzbd(com.google.android.gms.internal.ads.zzham r0) {
            com.google.android.gms.internal.ads.zzhbc r0 = zzd(r0)
            return r0
    }

    public static <ContainingType extends com.google.android.gms.internal.ads.zzhcp, Type> com.google.android.gms.internal.ads.zzhbc<ContainingType, Type> zzbe(ContainingType r13, com.google.android.gms.internal.ads.zzhcp r14, com.google.android.gms.internal.ads.zzhbj r15, int r16, com.google.android.gms.internal.ads.zzhel r17, boolean r18, java.lang.Class r19) {
            java.util.List r2 = java.util.Collections.emptyList()
            com.google.android.gms.internal.ads.zzhbc r6 = new com.google.android.gms.internal.ads.zzhbc
            com.google.android.gms.internal.ads.zzhbb r4 = new com.google.android.gms.internal.ads.zzhbb
            r11 = 1
            r7 = r4
            r8 = r15
            r9 = r16
            r10 = r17
            r12 = r18
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = r6
            r1 = r13
            r3 = r14
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <ContainingType extends com.google.android.gms.internal.ads.zzhcp, Type> com.google.android.gms.internal.ads.zzhbc<ContainingType, Type> zzbf(ContainingType r8, Type r9, com.google.android.gms.internal.ads.zzhcp r10, com.google.android.gms.internal.ads.zzhbj r11, int r12, com.google.android.gms.internal.ads.zzhel r13, java.lang.Class r14) {
            com.google.android.gms.internal.ads.zzhbc r6 = new com.google.android.gms.internal.ads.zzhbc
            com.google.android.gms.internal.ads.zzhbb r7 = new com.google.android.gms.internal.ads.zzhbb
            r4 = 0
            r5 = 0
            r0 = r7
            r1 = r11
            r2 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r7
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhbe zzbg(com.google.android.gms.internal.ads.zzhbe r0, byte[] r1, int r2, int r3, com.google.android.gms.internal.ads.zzhao r4) {
            com.google.android.gms.internal.ads.zzhbe r0 = zzh(r0, r1, r2, r3, r4)
            return r0
    }

    static <T extends com.google.android.gms.internal.ads.zzhbe> T zzbh(java.lang.Class<T> r3) {
            java.util.Map<java.lang.Object, com.google.android.gms.internal.ads.zzhbe<?, ?>> r0 = com.google.android.gms.internal.ads.zzhbe.zzc
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.zzhbe r0 = (com.google.android.gms.internal.ads.zzhbe) r0
            if (r0 != 0) goto L28
            java.lang.String r0 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L1f
            r1 = 1
            java.lang.ClassLoader r2 = r3.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1f
            java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L1f
            java.util.Map<java.lang.Object, com.google.android.gms.internal.ads.zzhbe<?, ?>> r0 = com.google.android.gms.internal.ads.zzhbe.zzc
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.zzhbe r0 = (com.google.android.gms.internal.ads.zzhbe) r0
            goto L28
        L1f:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r3)
            throw r0
        L28:
            if (r0 != 0) goto L42
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzhef.zzg(r3)
            com.google.android.gms.internal.ads.zzhbe r0 = (com.google.android.gms.internal.ads.zzhbe) r0
            com.google.android.gms.internal.ads.zzhbe r0 = r0.zzbi()
            if (r0 == 0) goto L3c
            java.util.Map<java.lang.Object, com.google.android.gms.internal.ads.zzhbe<?, ?>> r1 = com.google.android.gms.internal.ads.zzhbe.zzc
            r1.put(r3, r0)
            goto L42
        L3c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L42:
            return r0
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzbk(T r1, java.io.InputStream r2) throws com.google.android.gms.internal.ads.zzhbt {
            int r0 = com.google.android.gms.internal.ads.zzhao.zzb
            int r0 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhao r0 = com.google.android.gms.internal.ads.zzhao.zza
            com.google.android.gms.internal.ads.zzhbe r1 = zzf(r1, r2, r0)
            zze(r1)
            return r1
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzbl(T r0, java.io.InputStream r1, com.google.android.gms.internal.ads.zzhao r2) throws com.google.android.gms.internal.ads.zzhbt {
            com.google.android.gms.internal.ads.zzhbe r0 = zzf(r0, r1, r2)
            zze(r0)
            return r0
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzbm(T r1, com.google.android.gms.internal.ads.zzgzs r2) throws com.google.android.gms.internal.ads.zzhbt {
            int r0 = com.google.android.gms.internal.ads.zzhao.zzb
            int r0 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhao r0 = com.google.android.gms.internal.ads.zzhao.zza
            com.google.android.gms.internal.ads.zzhbe r1 = zzbr(r1, r2, r0)
            zze(r1)
            return r1
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzbn(T r1, com.google.android.gms.internal.ads.zzhac r2) throws com.google.android.gms.internal.ads.zzhbt {
            int r0 = com.google.android.gms.internal.ads.zzhao.zzb
            int r0 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhao r0 = com.google.android.gms.internal.ads.zzhao.zza
            com.google.android.gms.internal.ads.zzhbe r1 = zzbs(r1, r2, r0)
            return r1
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzbo(T r1, java.io.InputStream r2) throws com.google.android.gms.internal.ads.zzhbt {
            r0 = 4096(0x1000, float:5.74E-42)
            com.google.android.gms.internal.ads.zzhac r2 = com.google.android.gms.internal.ads.zzhac.zzG(r2, r0)
            int r0 = com.google.android.gms.internal.ads.zzhao.zzb
            int r0 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhao r0 = com.google.android.gms.internal.ads.zzhao.zza
            com.google.android.gms.internal.ads.zzhbe r1 = zzbz(r1, r2, r0)
            zze(r1)
            return r1
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzbp(T r1, java.nio.ByteBuffer r2) throws com.google.android.gms.internal.ads.zzhbt {
            int r0 = com.google.android.gms.internal.ads.zzhao.zzb
            int r0 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhao r0 = com.google.android.gms.internal.ads.zzhao.zza
            com.google.android.gms.internal.ads.zzhbe r1 = zzbv(r1, r2, r0)
            return r1
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzbq(T r3, byte[] r4) throws com.google.android.gms.internal.ads.zzhbt {
            int r0 = r4.length
            int r1 = com.google.android.gms.internal.ads.zzhao.zzb
            int r1 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhao r1 = com.google.android.gms.internal.ads.zzhao.zza
            r2 = 0
            com.google.android.gms.internal.ads.zzhbe r3 = zzh(r3, r4, r2, r0, r1)
            zze(r3)
            return r3
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzbr(T r0, com.google.android.gms.internal.ads.zzgzs r1, com.google.android.gms.internal.ads.zzhao r2) throws com.google.android.gms.internal.ads.zzhbt {
            com.google.android.gms.internal.ads.zzhbe r0 = zzg(r0, r1, r2)
            zze(r0)
            return r0
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzbs(T r0, com.google.android.gms.internal.ads.zzhac r1, com.google.android.gms.internal.ads.zzhao r2) throws com.google.android.gms.internal.ads.zzhbt {
            com.google.android.gms.internal.ads.zzhbe r0 = zzbz(r0, r1, r2)
            zze(r0)
            return r0
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzbu(T r1, java.io.InputStream r2, com.google.android.gms.internal.ads.zzhao r3) throws com.google.android.gms.internal.ads.zzhbt {
            r0 = 4096(0x1000, float:5.74E-42)
            com.google.android.gms.internal.ads.zzhac r2 = com.google.android.gms.internal.ads.zzhac.zzG(r2, r0)
            com.google.android.gms.internal.ads.zzhbe r1 = zzbz(r1, r2, r3)
            zze(r1)
            return r1
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzbv(T r4, java.nio.ByteBuffer r5, com.google.android.gms.internal.ads.zzhao r6) throws com.google.android.gms.internal.ads.zzhbt {
            int r0 = com.google.android.gms.internal.ads.zzhac.zzd
            boolean r0 = r5.hasArray()
            r1 = 0
            if (r0 == 0) goto L1f
            byte[] r0 = r5.array()
            int r2 = r5.arrayOffset()
            int r3 = r5.position()
            int r2 = r2 + r3
            int r5 = r5.remaining()
            com.google.android.gms.internal.ads.zzhac r5 = com.google.android.gms.internal.ads.zzhac.zzH(r0, r2, r5, r1)
            goto L45
        L1f:
            boolean r0 = r5.isDirect()
            if (r0 == 0) goto L33
            boolean r0 = com.google.android.gms.internal.ads.zzhef.zzB()
            if (r0 == 0) goto L33
            com.google.android.gms.internal.ads.zzhaa r0 = new com.google.android.gms.internal.ads.zzhaa
            r2 = 0
            r0.<init>(r5, r1, r2)
            r5 = r0
            goto L45
        L33:
            int r0 = r5.remaining()
            byte[] r2 = new byte[r0]
            java.nio.ByteBuffer r5 = r5.duplicate()
            r5.get(r2)
            r5 = 1
            com.google.android.gms.internal.ads.zzhac r5 = com.google.android.gms.internal.ads.zzhac.zzH(r2, r1, r0, r5)
        L45:
            com.google.android.gms.internal.ads.zzhbe r4 = zzbs(r4, r5, r6)
            zze(r4)
            return r4
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzbx(T r2, byte[] r3, com.google.android.gms.internal.ads.zzhao r4) throws com.google.android.gms.internal.ads.zzhbt {
            int r0 = r3.length
            r1 = 0
            com.google.android.gms.internal.ads.zzhbe r2 = zzh(r2, r3, r1, r0, r4)
            zze(r2)
            return r2
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzby(T r1, com.google.android.gms.internal.ads.zzhac r2) throws com.google.android.gms.internal.ads.zzhbt {
            int r0 = com.google.android.gms.internal.ads.zzhao.zzb
            int r0 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhao r0 = com.google.android.gms.internal.ads.zzhao.zza
            com.google.android.gms.internal.ads.zzhbe r1 = zzbz(r1, r2, r0)
            return r1
    }

    static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzbz(T r2, com.google.android.gms.internal.ads.zzhac r3, com.google.android.gms.internal.ads.zzhao r4) throws com.google.android.gms.internal.ads.zzhbt {
            com.google.android.gms.internal.ads.zzhbe r2 = r2.zzbj()
            com.google.android.gms.internal.ads.zzhcz r0 = com.google.android.gms.internal.ads.zzhcz.zza()     // Catch: java.lang.RuntimeException -> L1b java.io.IOException -> L2c com.google.android.gms.internal.ads.zzhdx -> L42 com.google.android.gms.internal.ads.zzhbt -> L48
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.RuntimeException -> L1b java.io.IOException -> L2c com.google.android.gms.internal.ads.zzhdx -> L42 com.google.android.gms.internal.ads.zzhbt -> L48
            com.google.android.gms.internal.ads.zzhdk r0 = r0.zzb(r1)     // Catch: java.lang.RuntimeException -> L1b java.io.IOException -> L2c com.google.android.gms.internal.ads.zzhdx -> L42 com.google.android.gms.internal.ads.zzhbt -> L48
            com.google.android.gms.internal.ads.zzhad r3 = com.google.android.gms.internal.ads.zzhad.zzq(r3)     // Catch: java.lang.RuntimeException -> L1b java.io.IOException -> L2c com.google.android.gms.internal.ads.zzhdx -> L42 com.google.android.gms.internal.ads.zzhbt -> L48
            r0.zzh(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L1b java.io.IOException -> L2c com.google.android.gms.internal.ads.zzhdx -> L42 com.google.android.gms.internal.ads.zzhbt -> L48
            r0.zzf(r2)     // Catch: java.lang.RuntimeException -> L1b java.io.IOException -> L2c com.google.android.gms.internal.ads.zzhdx -> L42 com.google.android.gms.internal.ads.zzhbt -> L48
            return r2
        L1b:
            r2 = move-exception
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.zzhbt
            if (r3 == 0) goto L2b
            java.lang.Throwable r2 = r2.getCause()
            com.google.android.gms.internal.ads.zzhbt r2 = (com.google.android.gms.internal.ads.zzhbt) r2
            throw r2
        L2b:
            throw r2
        L2c:
            r2 = move-exception
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.zzhbt
            if (r3 == 0) goto L3c
            java.lang.Throwable r2 = r2.getCause()
            com.google.android.gms.internal.ads.zzhbt r2 = (com.google.android.gms.internal.ads.zzhbt) r2
            throw r2
        L3c:
            com.google.android.gms.internal.ads.zzhbt r3 = new com.google.android.gms.internal.ads.zzhbt
            r3.<init>(r2)
            throw r3
        L42:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzhbt r2 = r2.zza()
            throw r2
        L48:
            r2 = move-exception
            boolean r3 = r2.zzb()
            if (r3 == 0) goto L55
            com.google.android.gms.internal.ads.zzhbt r3 = new com.google.android.gms.internal.ads.zzhbt
            r3.<init>(r2)
            throw r3
        L55:
            throw r2
    }

    private int zzc(com.google.android.gms.internal.ads.zzhdk<?> r2) {
            r1 = this;
            if (r2 != 0) goto L13
            java.lang.Class r2 = r1.getClass()
            com.google.android.gms.internal.ads.zzhcz r0 = com.google.android.gms.internal.ads.zzhcz.zza()
            com.google.android.gms.internal.ads.zzhdk r2 = r0.zzb(r2)
            int r2 = r2.zza(r1)
            return r2
        L13:
            int r2 = r2.zza(r1)
            return r2
    }

    protected static <T extends com.google.android.gms.internal.ads.zzhbe> void zzcb(java.lang.Class<T> r1, T r2) {
            r2.zzbX()
            java.util.Map<java.lang.Object, com.google.android.gms.internal.ads.zzhbe<?, ?>> r0 = com.google.android.gms.internal.ads.zzhbe.zzc
            r0.put(r1, r2)
            return
    }

    protected static final <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> boolean zzce(T r3, boolean r4) {
            com.google.android.gms.internal.ads.zzhbd r0 = com.google.android.gms.internal.ads.zzhbd.zza
            java.lang.Object r0 = r3.zzbP(r0)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r1 = 1
            if (r0 != r1) goto L10
            return r1
        L10:
            if (r0 != 0) goto L14
            r3 = 0
            return r3
        L14:
            com.google.android.gms.internal.ads.zzhcz r0 = com.google.android.gms.internal.ads.zzhcz.zza()
            java.lang.Class r2 = r3.getClass()
            com.google.android.gms.internal.ads.zzhdk r0 = r0.zzb(r2)
            boolean r0 = r0.zzl(r3)
            if (r4 == 0) goto L30
            if (r1 == r0) goto L2a
            r4 = 0
            goto L2b
        L2a:
            r4 = r3
        L2b:
            com.google.android.gms.internal.ads.zzhbd r1 = com.google.android.gms.internal.ads.zzhbd.zzb
            r3.zzbQ(r1, r4)
        L30:
            return r0
    }

    private static <MessageType extends com.google.android.gms.internal.ads.zzhba<MessageType, BuilderType>, BuilderType, T> com.google.android.gms.internal.ads.zzhbc<MessageType, T> zzd(com.google.android.gms.internal.ads.zzham<MessageType, T> r0) {
            com.google.android.gms.internal.ads.zzhbc r0 = (com.google.android.gms.internal.ads.zzhbc) r0
            return r0
    }

    private static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zze(T r1) throws com.google.android.gms.internal.ads.zzhbt {
            if (r1 == 0) goto L12
            boolean r0 = r1.zzbw()
            if (r0 == 0) goto L9
            goto L12
        L9:
            com.google.android.gms.internal.ads.zzhdx r1 = r1.zzaP()
            com.google.android.gms.internal.ads.zzhbt r1 = r1.zza()
            throw r1
        L12:
            return r1
    }

    private static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzf(T r2, java.io.InputStream r3, com.google.android.gms.internal.ads.zzhao r4) throws com.google.android.gms.internal.ads.zzhbt {
            int r0 = r3.read()     // Catch: java.io.IOException -> L23 com.google.android.gms.internal.ads.zzhbt -> L2a
            r1 = -1
            if (r0 != r1) goto L9
            r2 = 0
            return r2
        L9:
            int r0 = com.google.android.gms.internal.ads.zzhac.zzE(r0, r3)     // Catch: java.io.IOException -> L23 com.google.android.gms.internal.ads.zzhbt -> L2a
            com.google.android.gms.internal.ads.zzgyz r1 = new com.google.android.gms.internal.ads.zzgyz
            r1.<init>(r3, r0)
            r3 = 4096(0x1000, float:5.74E-42)
            com.google.android.gms.internal.ads.zzhac r3 = com.google.android.gms.internal.ads.zzhac.zzG(r1, r3)
            com.google.android.gms.internal.ads.zzhbe r2 = zzbz(r2, r3, r4)
            r4 = 0
            r3.zzy(r4)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L21
            return r2
        L21:
            r2 = move-exception
            throw r2
        L23:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzhbt r3 = new com.google.android.gms.internal.ads.zzhbt
            r3.<init>(r2)
            throw r3
        L2a:
            r2 = move-exception
            boolean r3 = r2.zzb()
            if (r3 == 0) goto L37
            com.google.android.gms.internal.ads.zzhbt r3 = new com.google.android.gms.internal.ads.zzhbt
            r3.<init>(r2)
            throw r3
        L37:
            throw r2
    }

    private static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzg(T r0, com.google.android.gms.internal.ads.zzgzs r1, com.google.android.gms.internal.ads.zzhao r2) throws com.google.android.gms.internal.ads.zzhbt {
            com.google.android.gms.internal.ads.zzhac r1 = r1.zzl()
            com.google.android.gms.internal.ads.zzhbe r0 = zzbz(r0, r1, r2)
            r2 = 0
            r1.zzy(r2)     // Catch: com.google.android.gms.internal.ads.zzhbt -> Ld
            return r0
        Ld:
            r0 = move-exception
            throw r0
    }

    private static <T extends com.google.android.gms.internal.ads.zzhbe<T, ?>> T zzh(T r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.ads.zzhao r11) throws com.google.android.gms.internal.ads.zzhbt {
            if (r10 != 0) goto L3
            return r7
        L3:
            com.google.android.gms.internal.ads.zzhbe r7 = r7.zzbj()
            com.google.android.gms.internal.ads.zzhcz r0 = com.google.android.gms.internal.ads.zzhcz.zza()     // Catch: java.lang.IndexOutOfBoundsException -> L25 java.io.IOException -> L2d com.google.android.gms.internal.ads.zzhdx -> L43 com.google.android.gms.internal.ads.zzhbt -> L49
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L25 java.io.IOException -> L2d com.google.android.gms.internal.ads.zzhdx -> L43 com.google.android.gms.internal.ads.zzhbt -> L49
            com.google.android.gms.internal.ads.zzhdk r6 = r0.zzb(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L25 java.io.IOException -> L2d com.google.android.gms.internal.ads.zzhdx -> L43 com.google.android.gms.internal.ads.zzhbt -> L49
            int r4 = r9 + r10
            com.google.android.gms.internal.ads.zzgzg r5 = new com.google.android.gms.internal.ads.zzgzg     // Catch: java.lang.IndexOutOfBoundsException -> L25 java.io.IOException -> L2d com.google.android.gms.internal.ads.zzhdx -> L43 com.google.android.gms.internal.ads.zzhbt -> L49
            r5.<init>(r11)     // Catch: java.lang.IndexOutOfBoundsException -> L25 java.io.IOException -> L2d com.google.android.gms.internal.ads.zzhdx -> L43 com.google.android.gms.internal.ads.zzhbt -> L49
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.zzi(r1, r2, r3, r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L25 java.io.IOException -> L2d com.google.android.gms.internal.ads.zzhdx -> L43 com.google.android.gms.internal.ads.zzhbt -> L49
            r6.zzf(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L25 java.io.IOException -> L2d com.google.android.gms.internal.ads.zzhdx -> L43 com.google.android.gms.internal.ads.zzhbt -> L49
            return r7
        L25:
            com.google.android.gms.internal.ads.zzhbt r7 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r8 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r7.<init>(r8)
            throw r7
        L2d:
            r7 = move-exception
            java.lang.Throwable r8 = r7.getCause()
            boolean r8 = r8 instanceof com.google.android.gms.internal.ads.zzhbt
            if (r8 == 0) goto L3d
            java.lang.Throwable r7 = r7.getCause()
            com.google.android.gms.internal.ads.zzhbt r7 = (com.google.android.gms.internal.ads.zzhbt) r7
            throw r7
        L3d:
            com.google.android.gms.internal.ads.zzhbt r8 = new com.google.android.gms.internal.ads.zzhbt
            r8.<init>(r7)
            throw r8
        L43:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzhbt r7 = r7.zza()
            throw r7
        L49:
            r7 = move-exception
            boolean r8 = r7.zzb()
            if (r8 == 0) goto L56
            com.google.android.gms.internal.ads.zzhbt r8 = new com.google.android.gms.internal.ads.zzhbt
            r8.<init>(r7)
            throw r8
        L56:
            throw r7
    }

    private void zzi() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhdz r0 = r2.zzt
            com.google.android.gms.internal.ads.zzhdz r1 = com.google.android.gms.internal.ads.zzhdz.zzc()
            if (r0 != r1) goto Le
            com.google.android.gms.internal.ads.zzhdz r0 = com.google.android.gms.internal.ads.zzhdz.zzf()
            r2.zzt = r0
        Le:
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L13
            return r0
        L13:
            java.lang.Class r0 = r3.getClass()
            com.google.android.gms.internal.ads.zzhcz r1 = com.google.android.gms.internal.ads.zzhcz.zza()
            com.google.android.gms.internal.ads.zzhdk r0 = r1.zzb(r0)
            com.google.android.gms.internal.ads.zzhbe r4 = (com.google.android.gms.internal.ads.zzhbe) r4
            boolean r4 = r0.zzk(r3, r4)
            return r4
    }

    public int hashCode() {
            r1 = this;
            boolean r0 = r1.zzcf()
            if (r0 == 0) goto Lb
            int r0 = r1.zzaW()
            return r0
        Lb:
            boolean r0 = r1.zzcd()
            if (r0 == 0) goto L18
            int r0 = r1.zzaW()
            r1.zzcc(r0)
        L18:
            int r0 = r1.zzaX()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            java.lang.String r0 = com.google.android.gms.internal.ads.zzhcr.zza(r1, r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    int zzaL() {
            r2 = this;
            int r0 = r2.zzd
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    int zzaM(com.google.android.gms.internal.ads.zzhdk r4) {
            r3 = this;
            boolean r0 = r3.zzcf()
            if (r0 == 0) goto L24
            int r4 = r3.zzc(r4)
            if (r4 < 0) goto Ld
            return r4
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "serialized size must be non-negative, was "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L24:
            int r0 = r3.zzaL()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L32
            int r4 = r3.zzaL()
            return r4
        L32:
            int r4 = r3.zzc(r4)
            r3.zzaS(r4)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    public com.google.android.gms.internal.ads.zzhcu zzaO() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Lite does not support the mutable API."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    void zzaS(int r4) {
            r3 = this;
            if (r4 < 0) goto Lb
            int r0 = r3.zzd
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            r4 = r4 | r0
            r3.zzd = r4
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "serialized size must be non-negative, was "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    int zzaW() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhcz r0 = com.google.android.gms.internal.ads.zzhcz.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.ads.zzhdk r0 = r0.zzb(r1)
            int r0 = r0.zzb(r2)
            return r0
    }

    int zzaX() {
            r1 = this;
            int r0 = r1.zzq
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    public int zzaY() {
            r1 = this;
            r0 = 0
            int r0 = r1.zzaM(r0)
            return r0
    }

    protected final <MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzhay<MessageType, BuilderType>> BuilderType zzaZ() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbd r0 = com.google.android.gms.internal.ads.zzhbd.zze
            java.lang.Object r0 = r1.zzbP(r0)
            com.google.android.gms.internal.ads.zzhay r0 = (com.google.android.gms.internal.ads.zzhay) r0
            return r0
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzbM() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhay r0 = r1.zzbc()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzhcx<MessageType> zzbN() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbd r0 = com.google.android.gms.internal.ads.zzhbd.zzg
            java.lang.Object r0 = r1.zzbP(r0)
            com.google.android.gms.internal.ads.zzhcx r0 = (com.google.android.gms.internal.ads.zzhcx) r0
            return r0
    }

    java.lang.Object zzbO() throws java.lang.Exception {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbd r0 = com.google.android.gms.internal.ads.zzhbd.zzc
            java.lang.Object r0 = r1.zzbP(r0)
            return r0
    }

    protected java.lang.Object zzbP(com.google.android.gms.internal.ads.zzhbd r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.zzde(r2, r0, r0)
            return r2
    }

    protected java.lang.Object zzbQ(com.google.android.gms.internal.ads.zzhbd r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.zzde(r2, r3, r0)
            return r2
    }

    void zzbU() {
            r1 = this;
            r0 = 0
            r1.zzq = r0
            return
    }

    void zzbV() {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.zzaS(r0)
            return
    }

    protected void zzbW() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhcz r0 = com.google.android.gms.internal.ads.zzhcz.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.ads.zzhdk r0 = r0.zzb(r1)
            r0.zzf(r2)
            r2.zzbX()
            return
    }

    void zzbX() {
            r2 = this;
            int r0 = r2.zzd
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            r2.zzd = r0
            return
    }

    protected void zzbY(int r2, com.google.android.gms.internal.ads.zzgzs r3) {
            r1 = this;
            r1.zzi()
            com.google.android.gms.internal.ads.zzhdz r0 = r1.zzt
            r0.zzg()
            if (r2 == 0) goto L12
            int r2 = r2 << 3
            r2 = r2 | 2
            r0.zzj(r2, r3)
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Zero is not a valid field number."
            r2.<init>(r3)
            throw r2
    }

    protected final void zzbZ(com.google.android.gms.internal.ads.zzhdz r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzhdz r0 = r1.zzt
            com.google.android.gms.internal.ads.zzhdz r2 = com.google.android.gms.internal.ads.zzhdz.zze(r0, r2)
            r1.zzt = r2
            return
    }

    protected final <MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzhay<MessageType, BuilderType>> BuilderType zzba(MessageType r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzhay r0 = r1.zzaZ()
            r0.zzbj(r2)
            return r0
    }

    public final BuilderType zzbb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbd r0 = com.google.android.gms.internal.ads.zzhbd.zze
            java.lang.Object r0 = r1.zzbP(r0)
            com.google.android.gms.internal.ads.zzhay r0 = (com.google.android.gms.internal.ads.zzhay) r0
            return r0
    }

    public final BuilderType zzbc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbd r0 = com.google.android.gms.internal.ads.zzhbd.zze
            java.lang.Object r0 = r1.zzbP(r0)
            com.google.android.gms.internal.ads.zzhay r0 = (com.google.android.gms.internal.ads.zzhay) r0
            r0.zzbj(r1)
            return r0
    }

    public final MessageType zzbi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbd r0 = com.google.android.gms.internal.ads.zzhbd.zzf
            java.lang.Object r0 = r1.zzbP(r0)
            com.google.android.gms.internal.ads.zzhbe r0 = (com.google.android.gms.internal.ads.zzhbe) r0
            return r0
    }

    MessageType zzbj() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbd r0 = com.google.android.gms.internal.ads.zzhbd.zzd
            java.lang.Object r0 = r1.zzbP(r0)
            com.google.android.gms.internal.ads.zzhbe r0 = (com.google.android.gms.internal.ads.zzhbe) r0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhcq
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhcp zzbt() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbe r0 = r1.zzbi()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhcq
    public final boolean zzbw() {
            r1 = this;
            r0 = 1
            boolean r0 = zzce(r1, r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzcZ() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhay r0 = r1.zzbb()
            return r0
    }

    protected void zzca(int r4, int r5) {
            r3 = this;
            r3.zzi()
            com.google.android.gms.internal.ads.zzhdz r0 = r3.zzt
            r0.zzg()
            if (r4 == 0) goto L15
            long r1 = (long) r5
            int r4 = r4 << 3
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r0.zzj(r4, r5)
            return
        L15:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Zero is not a valid field number."
            r4.<init>(r5)
            throw r4
    }

    void zzcc(int r1) {
            r0 = this;
            r0.zzq = r1
            return
    }

    boolean zzcd() {
            r1 = this;
            int r0 = r1.zzaX()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    boolean zzcf() {
            r2 = this;
            int r0 = r2.zzd
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    protected boolean zzcg(int r3, com.google.android.gms.internal.ads.zzhac r4) throws java.io.IOException {
            r2 = this;
            r0 = r3 & 7
            r1 = 4
            if (r0 != r1) goto L7
            r3 = 0
            return r3
        L7:
            r2.zzi()
            com.google.android.gms.internal.ads.zzhdz r0 = r2.zzt
            boolean r3 = r0.zzm(r3, r4)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    public void zzda(com.google.android.gms.internal.ads.zzhaj r3) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.ads.zzhcz r0 = com.google.android.gms.internal.ads.zzhcz.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.ads.zzhdk r0 = r0.zzb(r1)
            com.google.android.gms.internal.ads.zzhak r3 = com.google.android.gms.internal.ads.zzhak.zza(r3)
            r0.zzj(r2, r3)
            return
    }

    protected abstract java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r1, java.lang.Object r2, java.lang.Object r3);
}
