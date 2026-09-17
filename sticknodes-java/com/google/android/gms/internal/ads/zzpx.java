package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzpx extends java.lang.Exception {
    public final int zza;
    public final boolean zzb;
    public final com.google.android.gms.internal.ads.zzaf zzc;

    public zzpx(int r3, com.google.android.gms.internal.ads.zzaf r4, boolean r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AudioTrack write failed: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.zzb = r5
            r2.zza = r3
            r2.zzc = r4
            return
    }
}
