package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhiv {
    private final java.util.List zza;
    private final java.util.List zzb;

    /* synthetic */ zzhiv(int r1, int r2, com.google.android.gms.internal.ads.zzhiu r3) {
            r0 = this;
            r0.<init>()
            java.util.List r1 = com.google.android.gms.internal.ads.zzhif.zzc(r1)
            r0.zza = r1
            java.util.List r1 = com.google.android.gms.internal.ads.zzhif.zzc(r2)
            r0.zzb = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzhiv zza(com.google.android.gms.internal.ads.zzhir r2) {
            r1 = this;
            java.util.List r0 = r1.zzb
            r0.add(r2)
            return r1
    }

    public final com.google.android.gms.internal.ads.zzhiv zzb(com.google.android.gms.internal.ads.zzhir r2) {
            r1 = this;
            java.util.List r0 = r1.zza
            r0.add(r2)
            return r1
    }

    public final com.google.android.gms.internal.ads.zzhiw zzc() {
            r4 = this;
            com.google.android.gms.internal.ads.zzhiw r0 = new com.google.android.gms.internal.ads.zzhiw
            java.util.List r1 = r4.zza
            java.util.List r2 = r4.zzb
            r3 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }
}
