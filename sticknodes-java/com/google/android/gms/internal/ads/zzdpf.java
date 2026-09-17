package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdpf implements com.google.android.gms.internal.ads.zzbjw {
    private final com.google.android.gms.internal.ads.zzbhg zza;
    private final com.google.android.gms.internal.ads.zzdpt zzb;
    private final com.google.android.gms.internal.ads.zzhic zzc;

    public zzdpf(com.google.android.gms.internal.ads.zzdla r1, com.google.android.gms.internal.ads.zzdkp r2, com.google.android.gms.internal.ads.zzdpt r3, com.google.android.gms.internal.ads.zzhic r4) {
            r0 = this;
            r0.<init>()
            java.lang.String r2 = r2.zzA()
            com.google.android.gms.internal.ads.zzbhg r1 = r1.zzc(r2)
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r3, java.util.Map r4) {
            r2 = this;
            java.lang.String r3 = "asset"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.internal.ads.zzbhg r4 = r2.zza     // Catch: android.os.RemoteException -> L16
            com.google.android.gms.internal.ads.zzhic r0 = r2.zzc     // Catch: android.os.RemoteException -> L16
            java.lang.Object r0 = r0.zzb()     // Catch: android.os.RemoteException -> L16
            com.google.android.gms.internal.ads.zzbgw r0 = (com.google.android.gms.internal.ads.zzbgw) r0     // Catch: android.os.RemoteException -> L16
            r4.zze(r0, r3)     // Catch: android.os.RemoteException -> L16
            return
        L16:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to call onCustomClick for asset "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r3, r4)
            return
    }

    public final void zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhg r0 = r2.zza
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzdpt r0 = r2.zzb
            java.lang.String r1 = "/nativeAdCustomClick"
            r0.zzl(r1, r2)
            return
    }
}
