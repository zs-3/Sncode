package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzepl implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.internal.ads.zzfhc zzb;

    zzepl(com.google.android.gms.internal.ads.zzgfz r1, com.google.android.gms.internal.ads.zzfhc r2, com.google.android.gms.internal.ads.zzfhr r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 5
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzepk r0 = new com.google.android.gms.internal.ads.zzepk
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzepm zzc() throws java.lang.Exception {
            r4 = this;
            com.google.android.gms.internal.ads.zzepm r0 = new com.google.android.gms.internal.ads.zzepm
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgR
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L29
            com.google.android.gms.internal.ads.zzfhc r1 = r4.zzb
            com.google.android.gms.ads.internal.client.zzm r1 = r1.zzd
            java.lang.String r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(r1)
            java.lang.String r3 = "requester_type_2"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L29
            java.lang.String r2 = com.google.android.gms.internal.ads.zzfhr.zza()
        L29:
            r0.<init>(r2)
            return r0
    }
}
