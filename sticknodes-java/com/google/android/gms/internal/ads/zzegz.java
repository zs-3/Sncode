package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzegz implements com.google.android.gms.internal.ads.zzegq {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcqf zzb;
    private final java.util.concurrent.Executor zzc;

    zzegz(android.content.Context r1, com.google.android.gms.internal.ads.zzcqf r2, java.util.concurrent.Executor r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfgt r4, com.google.android.gms.internal.ads.zzfgh r5, com.google.android.gms.internal.ads.zzegn r6) throws com.google.android.gms.internal.ads.zzfhj, com.google.android.gms.internal.ads.zzeki {
            r3 = this;
            com.google.android.gms.internal.ads.zzctu r0 = new com.google.android.gms.internal.ads.zzctu
            java.lang.String r1 = r6.zza
            r0.<init>(r4, r5, r1)
            com.google.android.gms.internal.ads.zzdhc r4 = new com.google.android.gms.internal.ads.zzdhc
            com.google.android.gms.internal.ads.zzegy r1 = new com.google.android.gms.internal.ads.zzegy
            r1.<init>(r6)
            r2 = 0
            r4.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzcqd r1 = new com.google.android.gms.internal.ads.zzcqd
            int r5 = r5.zzaa
            r1.<init>(r5)
            com.google.android.gms.internal.ads.zzcqf r5 = r3.zzb
            com.google.android.gms.internal.ads.zzcqc r4 = r5.zza(r0, r4, r1)
            com.google.android.gms.internal.ads.zzcyz r5 = r4.zzd()
            com.google.android.gms.internal.ads.zzcof r0 = new com.google.android.gms.internal.ads.zzcof
            java.lang.Object r1 = r6.zzb
            com.google.android.gms.internal.ads.zzfia r1 = (com.google.android.gms.internal.ads.zzfia) r1
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r3.zzc
            r5.zzo(r0, r1)
            com.google.android.gms.internal.ads.zzczk r5 = r6.zzc
            com.google.android.gms.internal.ads.zzeig r5 = (com.google.android.gms.internal.ads.zzeig) r5
            com.google.android.gms.internal.ads.zzely r6 = r4.zzk()
            r5.zzc(r6)
            com.google.android.gms.internal.ads.zzcql r4 = r4.zza()
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(com.google.android.gms.internal.ads.zzfgt r3, com.google.android.gms.internal.ads.zzfgh r4, com.google.android.gms.internal.ads.zzegn r5) throws com.google.android.gms.internal.ads.zzfhj {
            r2 = this;
            java.lang.Object r0 = r5.zzb
            com.google.android.gms.internal.ads.zzfia r0 = (com.google.android.gms.internal.ads.zzfia) r0
            com.google.android.gms.internal.ads.zzfgq r3 = r3.zza
            com.google.android.gms.internal.ads.zzfhc r3 = r3.zza
            org.json.JSONObject r4 = r4.zzv
            java.lang.String r4 = r4.toString()
            android.content.Context r1 = r2.zza
            com.google.android.gms.internal.ads.zzczk r5 = r5.zzc
            com.google.android.gms.internal.ads.zzbpr r5 = (com.google.android.gms.internal.ads.zzbpr) r5
            com.google.android.gms.ads.internal.client.zzm r3 = r3.zzd
            r0.zzl(r1, r3, r4, r5)
            return
    }
}
