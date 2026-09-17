package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public abstract class zzev<MessageType extends com.google.android.gms.internal.auth.zzev<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.auth.zzet<MessageType, BuilderType>> extends com.google.android.gms.internal.auth.zzdq<MessageType, BuilderType> {
    private static final java.util.Map zzb = null;
    protected com.google.android.gms.internal.auth.zzha zzc;
    private int zzd;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.android.gms.internal.auth.zzev.zzb = r0
            return
    }

    public zzev() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.zzd = r0
            com.google.android.gms.internal.auth.zzha r0 = com.google.android.gms.internal.auth.zzha.zza()
            r1.zzc = r0
            return
    }

    static com.google.android.gms.internal.auth.zzev zzb(java.lang.Class r4) {
            java.util.Map r0 = com.google.android.gms.internal.auth.zzev.zzb
            java.lang.Object r1 = r0.get(r4)
            com.google.android.gms.internal.auth.zzev r1 = (com.google.android.gms.internal.auth.zzev) r1
            if (r1 != 0) goto L26
            java.lang.String r1 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> L1d
            r2 = 1
            java.lang.ClassLoader r3 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Class.forName(r1, r2, r3)     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object r1 = r0.get(r4)
            com.google.android.gms.internal.auth.zzev r1 = (com.google.android.gms.internal.auth.zzev) r1
            goto L26
        L1d:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r4)
            throw r0
        L26:
            if (r1 != 0) goto L42
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhj.zze(r4)
            com.google.android.gms.internal.auth.zzev r1 = (com.google.android.gms.internal.auth.zzev) r1
            r2 = 6
            r3 = 0
            java.lang.Object r1 = r1.zzn(r2, r3, r3)
            com.google.android.gms.internal.auth.zzev r1 = (com.google.android.gms.internal.auth.zzev) r1
            if (r1 == 0) goto L3c
            r0.put(r4, r1)
            goto L42
        L3c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        L42:
            return r1
    }

    protected static com.google.android.gms.internal.auth.zzev zzd(com.google.android.gms.internal.auth.zzev r3, byte[] r4) throws com.google.android.gms.internal.auth.zzfb {
            int r0 = r4.length
            com.google.android.gms.internal.auth.zzel r1 = com.google.android.gms.internal.auth.zzel.zza
            r2 = 0
            com.google.android.gms.internal.auth.zzev r3 = zzo(r3, r4, r2, r0, r1)
            if (r3 == 0) goto L44
            r4 = 1
            r0 = 0
            java.lang.Object r1 = r3.zzn(r4, r0, r0)
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 != r4) goto L19
            goto L44
        L19:
            if (r1 == 0) goto L37
            java.lang.Class r1 = r3.getClass()
            com.google.android.gms.internal.auth.zzgf r2 = com.google.android.gms.internal.auth.zzgf.zza()
            com.google.android.gms.internal.auth.zzgi r1 = r2.zzb(r1)
            boolean r1 = r1.zzi(r3)
            if (r4 == r1) goto L2f
            r4 = r0
            goto L30
        L2f:
            r4 = r3
        L30:
            r2 = 2
            r3.zzn(r2, r4, r0)
            if (r1 == 0) goto L37
            goto L44
        L37:
            com.google.android.gms.internal.auth.zzgy r4 = new com.google.android.gms.internal.auth.zzgy
            r4.<init>(r3)
            com.google.android.gms.internal.auth.zzfb r4 = r4.zza()
            r4.zze(r3)
            throw r4
        L44:
            return r3
    }

    protected static com.google.android.gms.internal.auth.zzez zzf() {
            com.google.android.gms.internal.auth.zzgg r0 = com.google.android.gms.internal.auth.zzgg.zze()
            return r0
    }

    static java.lang.Object zzg(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
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

    protected static java.lang.Object zzh(com.google.android.gms.internal.auth.zzfx r1, java.lang.String r2, java.lang.Object[] r3) {
            com.google.android.gms.internal.auth.zzgh r2 = new com.google.android.gms.internal.auth.zzgh
            java.lang.String r0 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"
            r2.<init>(r1, r0, r3)
            return r2
    }

    protected static void zzk(java.lang.Class r1, com.google.android.gms.internal.auth.zzev r2) {
            r2.zzj()
            java.util.Map r0 = com.google.android.gms.internal.auth.zzev.zzb
            r0.put(r1, r2)
            return
    }

    private static com.google.android.gms.internal.auth.zzev zzo(com.google.android.gms.internal.auth.zzev r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.auth.zzel r10) throws com.google.android.gms.internal.auth.zzfb {
            com.google.android.gms.internal.auth.zzev r6 = r6.zzc()
            com.google.android.gms.internal.auth.zzgf r8 = com.google.android.gms.internal.auth.zzgf.zza()     // Catch: java.lang.IndexOutOfBoundsException -> L21 java.io.IOException -> L29 com.google.android.gms.internal.auth.zzgy -> L42 com.google.android.gms.internal.auth.zzfb -> L4b
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L21 java.io.IOException -> L29 com.google.android.gms.internal.auth.zzgy -> L42 com.google.android.gms.internal.auth.zzfb -> L4b
            com.google.android.gms.internal.auth.zzgi r8 = r8.zzb(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L21 java.io.IOException -> L29 com.google.android.gms.internal.auth.zzgy -> L42 com.google.android.gms.internal.auth.zzfb -> L4b
            r3 = 0
            com.google.android.gms.internal.auth.zzdt r5 = new com.google.android.gms.internal.auth.zzdt     // Catch: java.lang.IndexOutOfBoundsException -> L21 java.io.IOException -> L29 com.google.android.gms.internal.auth.zzgy -> L42 com.google.android.gms.internal.auth.zzfb -> L4b
            r5.<init>(r10)     // Catch: java.lang.IndexOutOfBoundsException -> L21 java.io.IOException -> L29 com.google.android.gms.internal.auth.zzgy -> L42 com.google.android.gms.internal.auth.zzfb -> L4b
            r0 = r8
            r1 = r6
            r2 = r7
            r4 = r9
            r0.zzg(r1, r2, r3, r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L21 java.io.IOException -> L29 com.google.android.gms.internal.auth.zzgy -> L42 com.google.android.gms.internal.auth.zzfb -> L4b
            r8.zze(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L21 java.io.IOException -> L29 com.google.android.gms.internal.auth.zzgy -> L42 com.google.android.gms.internal.auth.zzfb -> L4b
            return r6
        L21:
            com.google.android.gms.internal.auth.zzfb r7 = com.google.android.gms.internal.auth.zzfb.zzf()
            r7.zze(r6)
            throw r7
        L29:
            r7 = move-exception
            java.lang.Throwable r8 = r7.getCause()
            boolean r8 = r8 instanceof com.google.android.gms.internal.auth.zzfb
            if (r8 == 0) goto L39
            java.lang.Throwable r6 = r7.getCause()
            com.google.android.gms.internal.auth.zzfb r6 = (com.google.android.gms.internal.auth.zzfb) r6
            throw r6
        L39:
            com.google.android.gms.internal.auth.zzfb r8 = new com.google.android.gms.internal.auth.zzfb
            r8.<init>(r7)
            r8.zze(r6)
            throw r8
        L42:
            r7 = move-exception
            com.google.android.gms.internal.auth.zzfb r7 = r7.zza()
            r7.zze(r6)
            throw r7
        L4b:
            r7 = move-exception
            r7.zze(r6)
            throw r7
    }

    public final boolean equals(java.lang.Object r4) {
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
            com.google.android.gms.internal.auth.zzgf r1 = com.google.android.gms.internal.auth.zzgf.zza()
            com.google.android.gms.internal.auth.zzgi r0 = r1.zzb(r0)
            com.google.android.gms.internal.auth.zzev r4 = (com.google.android.gms.internal.auth.zzev) r4
            boolean r4 = r0.zzh(r3, r4)
            return r4
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.zzm()
            if (r0 != 0) goto L11
            int r0 = r1.zza
            if (r0 != 0) goto L10
            int r0 = r1.zza()
            r1.zza = r0
        L10:
            return r0
        L11:
            int r0 = r1.zza()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            java.lang.String r0 = com.google.android.gms.internal.auth.zzfz.zza(r1, r0)
            return r0
    }

    final int zza() {
            r2 = this;
            com.google.android.gms.internal.auth.zzgf r0 = com.google.android.gms.internal.auth.zzgf.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.auth.zzgi r0 = r0.zzb(r1)
            int r0 = r0.zza(r2)
            return r0
    }

    final com.google.android.gms.internal.auth.zzev zzc() {
            r2 = this;
            r0 = 4
            r1 = 0
            java.lang.Object r0 = r2.zzn(r0, r1, r1)
            com.google.android.gms.internal.auth.zzev r0 = (com.google.android.gms.internal.auth.zzev) r0
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* synthetic */ com.google.android.gms.internal.auth.zzfx zze() {
            r2 = this;
            r0 = 6
            r1 = 0
            java.lang.Object r0 = r2.zzn(r0, r1, r1)
            com.google.android.gms.internal.auth.zzev r0 = (com.google.android.gms.internal.auth.zzev) r0
            return r0
    }

    protected final void zzi() {
            r2 = this;
            com.google.android.gms.internal.auth.zzgf r0 = com.google.android.gms.internal.auth.zzgf.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.auth.zzgi r0 = r0.zzb(r1)
            r0.zze(r2)
            r2.zzj()
            return
    }

    final void zzj() {
            r2 = this;
            int r0 = r2.zzd
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            r2.zzd = r0
            return
    }

    final void zzl(int r2) {
            r1 = this;
            int r2 = r1.zzd
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 | r0
            r1.zzd = r2
            return
    }

    final boolean zzm() {
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

    protected abstract java.lang.Object zzn(int r1, java.lang.Object r2, java.lang.Object r3);
}
