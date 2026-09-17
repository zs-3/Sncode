package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgrg {
    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset.forName(r0)
            return
    }

    public static final com.google.android.gms.internal.ads.zzgyx zza(java.lang.String r4) throws java.security.GeneralSecurityException {
            int r0 = r4.length()
            byte[] r0 = new byte[r0]
            r1 = 0
        L7:
            int r2 = r4.length()
            if (r1 >= r2) goto L36
            char r2 = r4.charAt(r1)
            r3 = 33
            if (r2 < r3) goto L1f
            r3 = 126(0x7e, float:1.77E-43)
            if (r2 > r3) goto L1f
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L7
        L1f:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Not a printable ASCII character: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L36:
            com.google.android.gms.internal.ads.zzgyx r4 = com.google.android.gms.internal.ads.zzgyx.zzb(r0)
            return r4
    }

    public static final com.google.android.gms.internal.ads.zzgyx zzb(java.lang.String r4) {
            int r0 = r4.length()
            byte[] r0 = new byte[r0]
            r1 = 0
        L7:
            int r2 = r4.length()
            if (r1 >= r2) goto L36
            char r2 = r4.charAt(r1)
            r3 = 33
            if (r2 < r3) goto L1f
            r3 = 126(0x7e, float:1.77E-43)
            if (r2 > r3) goto L1f
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L7
        L1f:
            com.google.android.gms.internal.ads.zzgrf r4 = new com.google.android.gms.internal.ads.zzgrf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Not a printable ASCII character: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L36:
            com.google.android.gms.internal.ads.zzgyx r4 = com.google.android.gms.internal.ads.zzgyx.zzb(r0)
            return r4
    }

    public static boolean zzc(byte[] r4, byte[] r5) {
            int r0 = r5.length
            int r1 = r4.length
            r2 = 0
            if (r0 < r1) goto L15
            r0 = 0
        L6:
            int r1 = r4.length
            if (r0 >= r1) goto L13
            r1 = r5[r0]
            r3 = r4[r0]
            if (r1 == r3) goto L10
            return r2
        L10:
            int r0 = r0 + 1
            goto L6
        L13:
            r4 = 1
            return r4
        L15:
            return r2
    }
}
