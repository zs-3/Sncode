package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcmh implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;

    public zzcmh(com.google.android.gms.internal.ads.zzhja r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r3.zza
            com.google.android.gms.internal.ads.zzchu r0 = (com.google.android.gms.internal.ads.zzchu) r0
            android.content.Context r0 = r0.zza()
            com.google.android.gms.internal.ads.zzfrk r1 = new com.google.android.gms.internal.ads.zzfrk
            com.google.android.gms.ads.internal.util.zzbt r2 = com.google.android.gms.ads.internal.zzu.zzt()
            android.os.Looper r2 = r2.zzb()
            r1.<init>(r0, r2)
            return r1
    }
}
