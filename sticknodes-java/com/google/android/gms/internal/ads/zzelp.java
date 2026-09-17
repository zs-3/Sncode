package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzelp implements com.google.android.gms.internal.ads.zzegm {
    private final com.google.android.gms.internal.ads.zzemt zza;
    private final com.google.android.gms.internal.ads.zzdru zzb;

    zzelp(com.google.android.gms.internal.ads.zzemt r1, com.google.android.gms.internal.ads.zzdru r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegm
    public final com.google.android.gms.internal.ads.zzegn zza(java.lang.String r3, org.json.JSONObject r4) throws com.google.android.gms.internal.ads.zzfhj {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzbH
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L22
            com.google.android.gms.internal.ads.zzdru r4 = r2.zzb     // Catch: android.os.RemoteException -> L1a
            com.google.android.gms.internal.ads.zzbrk r4 = r4.zzb(r3)     // Catch: android.os.RemoteException -> L1a
            goto L28
        L1a:
            r4 = move-exception
            java.lang.String r1 = "Coundn't create RTB adapter: "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r4)
            r4 = r0
            goto L28
        L22:
            com.google.android.gms.internal.ads.zzemt r4 = r2.zza
            com.google.android.gms.internal.ads.zzbrk r4 = r4.zza(r3)
        L28:
            if (r4 != 0) goto L2b
            return r0
        L2b:
            com.google.android.gms.internal.ads.zzeig r0 = new com.google.android.gms.internal.ads.zzeig
            r0.<init>()
            com.google.android.gms.internal.ads.zzegn r1 = new com.google.android.gms.internal.ads.zzegn
            r1.<init>(r4, r0, r3)
            return r1
    }
}
