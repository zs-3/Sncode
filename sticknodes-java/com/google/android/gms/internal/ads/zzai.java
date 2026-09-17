package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzai {
    /* synthetic */ zzai(com.google.android.gms.internal.ads.zzo r1, int r2, int r3, float r4, long r5, com.google.android.gms.internal.ads.zzah r7) {
            r0 = this;
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "width must be positive, but is: "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4 = 1
            r5 = 0
            if (r2 <= 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            com.google.android.gms.internal.ads.zzdi.zze(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "height must be positive, but is: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            if (r3 <= 0) goto L32
            goto L33
        L32:
            r4 = 0
        L33:
            com.google.android.gms.internal.ads.zzdi.zze(r4, r1)
            return
    }
}
