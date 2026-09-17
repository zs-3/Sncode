package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzhac {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb;
    com.google.android.gms.internal.ads.zzhad zzc;

    static {
            return
    }

    private zzhac() {
            r1 = this;
            r1.<init>()
            int r0 = com.google.android.gms.internal.ads.zzhac.zze
            r1.zzb = r0
            return
    }

    /* synthetic */ zzhac(com.google.android.gms.internal.ads.zzhab r1) {
            r0 = this;
            r0.<init>()
            int r1 = com.google.android.gms.internal.ads.zzhac.zze
            r0.zzb = r1
            return
    }

    public static int zzD(int r1) {
            r0 = r1 & 1
            int r1 = r1 >>> 1
            int r0 = -r0
            r1 = r1 ^ r0
            return r1
    }

    public static int zzE(int r4, java.io.InputStream r5) throws java.io.IOException {
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L5
            return r4
        L5:
            r4 = r4 & 127(0x7f, float:1.78E-43)
            r0 = 7
        L8:
            r1 = 32
            java.lang.String r2 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r3 = -1
            if (r0 >= r1) goto L27
            int r1 = r5.read()
            if (r1 == r3) goto L21
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r2 = r2 << r0
            r4 = r4 | r2
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L1e
            return r4
        L1e:
            int r0 = r0 + 7
            goto L8
        L21:
            com.google.android.gms.internal.ads.zzhbt r4 = new com.google.android.gms.internal.ads.zzhbt
            r4.<init>(r2)
            throw r4
        L27:
            r1 = 64
            if (r0 >= r1) goto L3f
            int r1 = r5.read()
            if (r1 == r3) goto L39
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L36
            return r4
        L36:
            int r0 = r0 + 7
            goto L27
        L39:
            com.google.android.gms.internal.ads.zzhbt r4 = new com.google.android.gms.internal.ads.zzhbt
            r4.<init>(r2)
            throw r4
        L3f:
            com.google.android.gms.internal.ads.zzhbt r4 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r5 = "CodedInputStream encountered a malformed varint."
            r4.<init>(r5)
            throw r4
    }

    public static long zzF(long r3) {
            r0 = 1
            long r0 = r0 & r3
            r2 = 1
            long r3 = r3 >>> r2
            long r0 = -r0
            long r3 = r3 ^ r0
            return r3
    }

    public static com.google.android.gms.internal.ads.zzhac zzG(java.io.InputStream r2, int r3) {
            if (r2 != 0) goto Lb
            byte[] r2 = com.google.android.gms.internal.ads.zzhbr.zzb
            int r3 = r2.length
            r3 = 0
            com.google.android.gms.internal.ads.zzhac r2 = zzH(r2, r3, r3, r3)
            return r2
        Lb:
            com.google.android.gms.internal.ads.zzgzy r3 = new com.google.android.gms.internal.ads.zzgzy
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 0
            r3.<init>(r2, r0, r1)
            return r3
    }

    static com.google.android.gms.internal.ads.zzhac zzH(byte[] r7, int r8, int r9, boolean r10) {
            com.google.android.gms.internal.ads.zzgzu r6 = new com.google.android.gms.internal.ads.zzgzu
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.zzd(r9)     // Catch: com.google.android.gms.internal.ads.zzhbt -> Lf
            return r6
        Lf:
            r7 = move-exception
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r7)
            throw r8
    }

    public abstract boolean zzA() throws java.io.IOException;

    public abstract boolean zzB() throws java.io.IOException;

    public abstract double zza() throws java.io.IOException;

    public abstract float zzb() throws java.io.IOException;

    public abstract int zzc();

    public abstract int zzd(int r1) throws com.google.android.gms.internal.ads.zzhbt;

    public abstract int zze() throws java.io.IOException;

    public abstract int zzf() throws java.io.IOException;

    public abstract int zzg() throws java.io.IOException;

    public abstract int zzj() throws java.io.IOException;

    public abstract int zzk() throws java.io.IOException;

    public abstract int zzl() throws java.io.IOException;

    public abstract int zzm() throws java.io.IOException;

    public abstract long zzn() throws java.io.IOException;

    public abstract long zzo() throws java.io.IOException;

    public abstract long zzs() throws java.io.IOException;

    public abstract long zzt() throws java.io.IOException;

    public abstract long zzu() throws java.io.IOException;

    public abstract com.google.android.gms.internal.ads.zzgzs zzv() throws java.io.IOException;

    public abstract java.lang.String zzw() throws java.io.IOException;

    public abstract java.lang.String zzx() throws java.io.IOException;

    public abstract void zzy(int r1) throws com.google.android.gms.internal.ads.zzhbt;

    public abstract void zzz(int r1);
}
