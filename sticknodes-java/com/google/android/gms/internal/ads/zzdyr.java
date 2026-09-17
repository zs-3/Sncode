package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdyr implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;

    public zzdyr(com.google.android.gms.internal.ads.zzhja r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final android.content.pm.ApplicationInfo zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r1.zza
            java.lang.Object r0 = r0.zzb()
            android.content.Context r0 = (android.content.Context) r0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            com.google.android.gms.internal.ads.zzhiq.zzb(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r1 = this;
            android.content.pm.ApplicationInfo r0 = r1.zza()
            return r0
    }
}
