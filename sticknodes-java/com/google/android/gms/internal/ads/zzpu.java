package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzpu extends java.lang.Exception {
    public final int zza;
    public final boolean zzb;

    public zzpu(int r3, int r4, int r5, int r6, com.google.android.gms.internal.ads.zzaf r7, boolean r8, java.lang.Exception r9) {
            r2 = this;
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AudioTrack init failed "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " Config("
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ", "
            r0.append(r4)
            r0.append(r5)
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = ") "
            r0.append(r4)
            r0.append(r7)
            r4 = 1
            if (r4 == r8) goto L35
            java.lang.String r4 = ""
            goto L37
        L35:
            java.lang.String r4 = " (recoverable)"
        L37:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.<init>(r4, r9)
            r2.zza = r3
            r2.zzb = r8
            return
    }
}
