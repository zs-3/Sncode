package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public abstract class zzbf {
    private static final com.google.android.gms.internal.fido.zzbf zza = null;
    private static final com.google.android.gms.internal.fido.zzbf zzb = null;
    private static final com.google.android.gms.internal.fido.zzbf zzc = null;
    private static final com.google.android.gms.internal.fido.zzbf zzd = null;
    private static final com.google.android.gms.internal.fido.zzbf zze = null;

    static {
            com.google.android.gms.internal.fido.zzbd r0 = new com.google.android.gms.internal.fido.zzbd
            r1 = 61
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.String r2 = "base64()"
            java.lang.String r3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            r0.<init>(r2, r3, r1)
            com.google.android.gms.internal.fido.zzbf.zza = r0
            com.google.android.gms.internal.fido.zzbd r0 = new com.google.android.gms.internal.fido.zzbd
            java.lang.String r2 = "base64Url()"
            java.lang.String r3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"
            r0.<init>(r2, r3, r1)
            com.google.android.gms.internal.fido.zzbf.zzb = r0
            com.google.android.gms.internal.fido.zzbe r0 = new com.google.android.gms.internal.fido.zzbe
            java.lang.String r2 = "base32()"
            java.lang.String r3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"
            r0.<init>(r2, r3, r1)
            com.google.android.gms.internal.fido.zzbf.zzc = r0
            com.google.android.gms.internal.fido.zzbe r0 = new com.google.android.gms.internal.fido.zzbe
            java.lang.String r2 = "base32Hex()"
            java.lang.String r3 = "0123456789ABCDEFGHIJKLMNOPQRSTUV"
            r0.<init>(r2, r3, r1)
            com.google.android.gms.internal.fido.zzbf.zzd = r0
            com.google.android.gms.internal.fido.zzbc r0 = new com.google.android.gms.internal.fido.zzbc
            java.lang.String r1 = "base16()"
            java.lang.String r2 = "0123456789ABCDEF"
            r0.<init>(r1, r2)
            com.google.android.gms.internal.fido.zzbf.zze = r0
            return
    }

    zzbf() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.fido.zzbf zzd() {
            com.google.android.gms.internal.fido.zzbf r0 = com.google.android.gms.internal.fido.zzbf.zze
            return r0
    }

    abstract void zza(java.lang.Appendable r1, byte[] r2, int r3, int r4) throws java.io.IOException;

    abstract int zzb(int r1);

    public final java.lang.String zze(byte[] r3, int r4, int r5) {
            r2 = this;
            int r4 = r3.length
            r0 = 0
            com.google.android.gms.internal.fido.zzam.zze(r0, r5, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = r2.zzb(r5)
            r4.<init>(r1)
            r2.zza(r4, r3, r0, r5)     // Catch: java.io.IOException -> L16
            java.lang.String r3 = r4.toString()
            return r3
        L16:
            r3 = move-exception
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>(r3)
            throw r4
    }
}
