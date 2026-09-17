package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzhaj extends com.google.android.gms.internal.ads.zzgzj {
    private static final java.util.logging.Logger zza = null;
    private static final boolean zzb = false;
    public static final /* synthetic */ int zzf = 0;
    com.google.android.gms.internal.ads.zzhak zze;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzhaj> r0 = com.google.android.gms.internal.ads.zzhaj.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.android.gms.internal.ads.zzhaj.zza = r0
            boolean r0 = com.google.android.gms.internal.ads.zzhef.zzA()
            com.google.android.gms.internal.ads.zzhaj.zzb = r0
            return
    }

    private zzhaj() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ zzhaj(com.google.android.gms.internal.ads.zzhai r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static int zzA(com.google.android.gms.internal.ads.zzhcp r0, com.google.android.gms.internal.ads.zzhdk r1) {
            com.google.android.gms.internal.ads.zzgzb r0 = (com.google.android.gms.internal.ads.zzgzb) r0
            int r0 = r0.zzaM(r1)
            int r1 = zzD(r0)
            int r1 = r1 + r0
            return r1
    }

    static int zzB(int r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 <= r0) goto L5
            return r0
        L5:
            return r1
    }

    public static int zzC(java.lang.String r1) {
            int r1 = com.google.android.gms.internal.ads.zzhek.zze(r1)     // Catch: com.google.android.gms.internal.ads.zzhej -> L5
            goto Lc
        L5:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzhbr.zza
            byte[] r1 = r1.getBytes(r0)
            int r1 = r1.length
        Lc:
            int r0 = zzD(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zzD(int r0) {
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = r0 * 9
            int r0 = 352 - r0
            int r0 = r0 >>> 6
            return r0
    }

    public static int zzE(long r0) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r0)
            int r0 = r0 * 9
            int r0 = 640 - r0
            int r0 = r0 >>> 6
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzH() {
            boolean r0 = com.google.android.gms.internal.ads.zzhaj.zzb
            return r0
    }

    @java.lang.Deprecated
    static int zzy(int r0, com.google.android.gms.internal.ads.zzhcp r1, com.google.android.gms.internal.ads.zzhdk r2) {
            int r0 = r0 << 3
            int r0 = zzD(r0)
            int r0 = r0 + r0
            com.google.android.gms.internal.ads.zzgzb r1 = (com.google.android.gms.internal.ads.zzgzb) r1
            int r1 = r1.zzaM(r2)
            int r0 = r0 + r1
            return r0
    }

    public static int zzz(com.google.android.gms.internal.ads.zzhcp r1) {
            int r1 = r1.zzaY()
            int r0 = zzD(r1)
            int r0 = r0 + r1
            return r0
    }

    public final void zzF() {
            r2 = this;
            int r0 = r2.zzb()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Did not write as much data as expected."
            r0.<init>(r1)
            throw r0
    }

    final void zzG(java.lang.String r7, com.google.android.gms.internal.ads.zzhej r8) throws java.io.IOException {
            r6 = this;
            java.util.logging.Logger r0 = com.google.android.gms.internal.ads.zzhaj.zza
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r2 = "com.google.protobuf.CodedOutputStream"
            java.lang.String r3 = "inefficientWriteStringNoTag"
            java.lang.String r4 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"
            r5 = r8
            r0.logp(r1, r2, r3, r4, r5)
            java.nio.charset.Charset r8 = com.google.android.gms.internal.ads.zzhbr.zza
            byte[] r7 = r7.getBytes(r8)
            int r8 = r7.length     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r6.zzu(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r0 = 0
            r6.zza(r7, r0, r8)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            return
        L1d:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzhag r8 = new com.google.android.gms.internal.ads.zzhag
            r8.<init>(r7)
            throw r8
    }

    public abstract void zzK() throws java.io.IOException;

    public abstract void zzL(byte r1) throws java.io.IOException;

    public abstract void zzM(int r1, boolean r2) throws java.io.IOException;

    public abstract void zzN(int r1, com.google.android.gms.internal.ads.zzgzs r2) throws java.io.IOException;

    @Override // com.google.android.gms.internal.ads.zzgzj
    public abstract void zza(byte[] r1, int r2, int r3) throws java.io.IOException;

    public abstract int zzb();

    public abstract void zzh(int r1, int r2) throws java.io.IOException;

    public abstract void zzi(int r1) throws java.io.IOException;

    public abstract void zzj(int r1, long r2) throws java.io.IOException;

    public abstract void zzk(long r1) throws java.io.IOException;

    public abstract void zzl(int r1, int r2) throws java.io.IOException;

    public abstract void zzm(int r1) throws java.io.IOException;

    abstract void zzn(int r1, com.google.android.gms.internal.ads.zzhcp r2, com.google.android.gms.internal.ads.zzhdk r3) throws java.io.IOException;

    public abstract void zzo(int r1, com.google.android.gms.internal.ads.zzhcp r2) throws java.io.IOException;

    public abstract void zzp(int r1, com.google.android.gms.internal.ads.zzgzs r2) throws java.io.IOException;

    public abstract void zzq(int r1, java.lang.String r2) throws java.io.IOException;

    public abstract void zzs(int r1, int r2) throws java.io.IOException;

    public abstract void zzt(int r1, int r2) throws java.io.IOException;

    public abstract void zzu(int r1) throws java.io.IOException;

    public abstract void zzv(int r1, long r2) throws java.io.IOException;

    public abstract void zzw(long r1) throws java.io.IOException;
}
