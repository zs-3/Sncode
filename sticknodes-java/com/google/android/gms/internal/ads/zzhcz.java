package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhcz {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhcz zzb = null;
    private final com.google.android.gms.internal.ads.zzhdl zzc;
    private final java.util.concurrent.ConcurrentMap zzd;

    static {
            com.google.android.gms.internal.ads.zzhcz r0 = new com.google.android.gms.internal.ads.zzhcz
            r0.<init>()
            com.google.android.gms.internal.ads.zzhcz.zzb = r0
            return
    }

    private zzhcz() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zzd = r0
            com.google.android.gms.internal.ads.zzhch r0 = new com.google.android.gms.internal.ads.zzhch
            r0.<init>()
            r1.zzc = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzhcz zza() {
            com.google.android.gms.internal.ads.zzhcz r0 = com.google.android.gms.internal.ads.zzhcz.zzb
            return r0
    }

    public final com.google.android.gms.internal.ads.zzhdk zzb(java.lang.Class r3) {
            r2 = this;
            java.lang.String r0 = "messageType"
            com.google.android.gms.internal.ads.zzhbr.zzc(r3, r0)
            java.util.concurrent.ConcurrentMap r1 = r2.zzd
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.internal.ads.zzhdk r1 = (com.google.android.gms.internal.ads.zzhdk) r1
            if (r1 != 0) goto L24
            com.google.android.gms.internal.ads.zzhdl r1 = r2.zzc
            com.google.android.gms.internal.ads.zzhdk r1 = r1.zza(r3)
            com.google.android.gms.internal.ads.zzhbr.zzc(r3, r0)
            java.util.concurrent.ConcurrentMap r0 = r2.zzd
            java.lang.Object r3 = r0.putIfAbsent(r3, r1)
            com.google.android.gms.internal.ads.zzhdk r3 = (com.google.android.gms.internal.ads.zzhdk) r3
            if (r3 != 0) goto L23
            goto L24
        L23:
            return r3
        L24:
            return r1
    }
}
