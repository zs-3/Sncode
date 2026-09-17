package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzecl implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbwa zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvt zzb;

    zzecl(com.google.android.gms.internal.ads.zzecp r1, com.google.android.gms.internal.ads.zzbwa r2, com.google.android.gms.internal.ads.zzbvt r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbvt r0 = r1.zzb     // Catch: android.os.RemoteException -> La
            com.google.android.gms.ads.internal.util.zzbb r2 = com.google.android.gms.ads.internal.util.zzbb.zzb(r2)     // Catch: android.os.RemoteException -> La
            r0.zze(r2)     // Catch: android.os.RemoteException -> La
            return
        La:
            r2 = move-exception
            java.lang.String r0 = "Service can't call client"
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r5) {
            r4 = this;
            android.os.ParcelFileDescriptor r5 = (android.os.ParcelFileDescriptor) r5
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcf     // Catch: android.os.RemoteException -> L4b
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: android.os.RemoteException -> L4b
            java.lang.Object r0 = r1.zza(r0)     // Catch: android.os.RemoteException -> L4b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: android.os.RemoteException -> L4b
            boolean r0 = r0.booleanValue()     // Catch: android.os.RemoteException -> L4b
            if (r0 == 0) goto L45
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcg     // Catch: android.os.RemoteException -> L4b
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: android.os.RemoteException -> L4b
            java.lang.Object r0 = r1.zza(r0)     // Catch: android.os.RemoteException -> L4b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: android.os.RemoteException -> L4b
            boolean r0 = r0.booleanValue()     // Catch: android.os.RemoteException -> L4b
            if (r0 == 0) goto L3d
            com.google.android.gms.internal.ads.zzbwa r0 = r4.zza     // Catch: android.os.RemoteException -> L4b
            android.os.Bundle r0 = r0.zzm     // Catch: android.os.RemoteException -> L4b
            if (r0 == 0) goto L3d
            com.google.android.gms.internal.ads.zzdtm r1 = com.google.android.gms.internal.ads.zzdtm.zzo     // Catch: android.os.RemoteException -> L4b
            java.lang.String r1 = r1.zza()     // Catch: android.os.RemoteException -> L4b
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: android.os.RemoteException -> L4b
            long r2 = r2.currentTimeMillis()     // Catch: android.os.RemoteException -> L4b
            r0.putLong(r1, r2)     // Catch: android.os.RemoteException -> L4b
        L3d:
            com.google.android.gms.internal.ads.zzbvt r0 = r4.zzb     // Catch: android.os.RemoteException -> L4b
            com.google.android.gms.internal.ads.zzbwa r1 = r4.zza     // Catch: android.os.RemoteException -> L4b
            r0.zzg(r5, r1)     // Catch: android.os.RemoteException -> L4b
            return
        L45:
            com.google.android.gms.internal.ads.zzbvt r0 = r4.zzb     // Catch: android.os.RemoteException -> L4b
            r0.zzf(r5)     // Catch: android.os.RemoteException -> L4b
            return
        L4b:
            r5 = move-exception
            java.lang.String r0 = "Service can't call client"
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r5)
            return
    }
}
