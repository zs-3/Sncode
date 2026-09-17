package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzgy extends com.google.android.gms.internal.ads.zzgh {
    public final int zzb;

    public zzgy(com.google.android.gms.internal.ads.zzgm r1, int r2, int r3) {
            r0 = this;
            r1 = 2008(0x7d8, float:2.814E-42)
            r2 = 1
            int r1 = zzb(r1, r2)
            r0.<init>(r1)
            r0.zzb = r2
            return
    }

    public zzgy(java.io.IOException r1, com.google.android.gms.internal.ads.zzgm r2, int r3, int r4) {
            r0 = this;
            int r2 = zzb(r3, r4)
            r0.<init>(r1, r2)
            r0.zzb = r4
            return
    }

    public zzgy(java.lang.String r1, com.google.android.gms.internal.ads.zzgm r2, int r3, int r4) {
            r0 = this;
            int r2 = zzb(r3, r4)
            r0.<init>(r1, r2)
            r0.zzb = r4
            return
    }

    public zzgy(java.lang.String r1, java.io.IOException r2, com.google.android.gms.internal.ads.zzgm r3, int r4, int r5) {
            r0 = this;
            int r3 = zzb(r4, r5)
            r0.<init>(r1, r2, r3)
            r0.zzb = r5
            return
    }

    public static com.google.android.gms.internal.ads.zzgy zza(java.io.IOException r4, com.google.android.gms.internal.ads.zzgm r5, int r6) {
            java.lang.String r0 = r4.getMessage()
            boolean r1 = r4 instanceof java.net.SocketTimeoutException
            r2 = 2001(0x7d1, float:2.804E-42)
            r3 = 2007(0x7d7, float:2.812E-42)
            if (r1 == 0) goto Lf
            r2 = 2002(0x7d2, float:2.805E-42)
            goto L26
        Lf:
            boolean r1 = r4 instanceof java.io.InterruptedIOException
            if (r1 == 0) goto L16
            r2 = 1004(0x3ec, float:1.407E-42)
            goto L26
        L16:
            if (r0 == 0) goto L26
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfxi.zza(r0)
            java.lang.String r1 = "cleartext.*not permitted.*"
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L26
            r2 = 2007(0x7d7, float:2.812E-42)
        L26:
            if (r2 != r3) goto L2e
            com.google.android.gms.internal.ads.zzgx r6 = new com.google.android.gms.internal.ads.zzgx
            r6.<init>(r4, r5)
            goto L34
        L2e:
            com.google.android.gms.internal.ads.zzgy r0 = new com.google.android.gms.internal.ads.zzgy
            r0.<init>(r4, r5, r2, r6)
            r6 = r0
        L34:
            return r6
    }

    private static int zzb(int r1, int r2) {
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 != r0) goto Lc
            r1 = 1
            if (r2 == r1) goto La
            r1 = 2000(0x7d0, float:2.803E-42)
            goto Lc
        La:
            r1 = 2001(0x7d1, float:2.804E-42)
        Lc:
            return r1
    }
}
