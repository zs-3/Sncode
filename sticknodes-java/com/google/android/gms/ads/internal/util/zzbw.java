package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbw extends com.google.android.gms.ads.internal.util.zzb {
    private final com.google.android.gms.ads.internal.util.client.zzr zza;
    private final java.lang.String zzb;

    public zzbw(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            com.google.android.gms.ads.internal.util.zzt r0 = com.google.android.gms.ads.internal.zzu.zzp()
            java.lang.String r2 = r0.zzc(r2, r3)
            r1.<init>()
            com.google.android.gms.ads.internal.util.client.zzr r3 = new com.google.android.gms.ads.internal.util.client.zzr
            r3.<init>(r2)
            r1.zza = r3
            r1.zzb = r4
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
            r2 = this;
            com.google.android.gms.ads.internal.util.client.zzr r0 = r2.zza
            java.lang.String r1 = r2.zzb
            r0.zza(r1)
            return
    }
}
