package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzffw implements com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdo zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzffy zzb;

    zzffw(com.google.android.gms.internal.ads.zzffy r1, com.google.android.gms.ads.internal.client.zzdo r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
            r2 = this;
            com.google.android.gms.internal.ads.zzffy r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdqi r0 = com.google.android.gms.internal.ads.zzffy.zzr(r0)
            if (r0 == 0) goto L14
            com.google.android.gms.ads.internal.client.zzdo r0 = r2.zza     // Catch: android.os.RemoteException -> Le
            r0.zze()     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
        L14:
            return
    }
}
