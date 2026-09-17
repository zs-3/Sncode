package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhbr {
    static final java.nio.charset.Charset zza = null;
    public static final byte[] zzb = null;
    public static final java.nio.ByteBuffer zzc = null;

    static {
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset.forName(r0)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.android.gms.internal.ads.zzhbr.zza = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset.forName(r0)
            r0 = 0
            byte[] r1 = new byte[r0]
            com.google.android.gms.internal.ads.zzhbr.zzb = r1
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r1)
            com.google.android.gms.internal.ads.zzhbr.zzc = r2
            int r2 = com.google.android.gms.internal.ads.zzhac.zzd
            com.google.android.gms.internal.ads.zzhac.zzH(r1, r0, r0, r0)
            return
    }

    public static int zza(boolean r0) {
            if (r0 == 0) goto L5
            r0 = 1231(0x4cf, float:1.725E-42)
            return r0
        L5:
            r0 = 1237(0x4d5, float:1.733E-42)
            return r0
    }

    static int zzb(int r2, byte[] r3, int r4, int r5) {
            r0 = r4
        L1:
            int r1 = r4 + r5
            if (r0 >= r1) goto Ld
            int r2 = r2 * 31
            r1 = r3[r0]
            int r2 = r2 + r1
            int r0 = r0 + 1
            goto L1
        Ld:
            return r2
    }

    static java.lang.Object zzc(java.lang.Object r0, java.lang.String r1) {
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }
}
