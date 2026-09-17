package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzesd implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.internal.ads.zzdrz zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzfhc zzd;

    public zzesd(com.google.android.gms.internal.ads.zzgfz r1, com.google.android.gms.internal.ads.zzdrz r2, com.google.android.gms.internal.ads.zzfhc r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzd = r3
            r0.zzc = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 17
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzesc r0 = new com.google.android.gms.internal.ads.zzesc
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzese zzc() throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.internal.ads.zzdrz r0 = r3.zzb
            com.google.android.gms.internal.ads.zzfhc r1 = r3.zzd
            java.lang.String r1 = r1.zzf
            java.lang.String r2 = r3.zzc
            org.json.JSONObject r1 = r0.zzb(r1, r2)
            org.json.JSONObject r0 = r0.zza()
            com.google.android.gms.internal.ads.zzese r2 = new com.google.android.gms.internal.ads.zzese
            r2.<init>(r1, r0)
            return r2
    }
}
