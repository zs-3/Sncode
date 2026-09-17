package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzecy implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvq zza;

    zzecy(com.google.android.gms.internal.ads.zzecz r1, com.google.android.gms.internal.ads.zzbvq r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbvq r0 = r1.zza     // Catch: android.os.RemoteException -> La
            com.google.android.gms.ads.internal.util.zzbb r2 = com.google.android.gms.ads.internal.util.zzbb.zzb(r2)     // Catch: android.os.RemoteException -> La
            r0.zze(r2)     // Catch: android.os.RemoteException -> La
            return
        La:
            r2 = move-exception
            java.lang.String r0 = "Ad service can't call client"
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r2) {
            r1 = this;
            android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
            com.google.android.gms.internal.ads.zzbvq r0 = r1.zza     // Catch: android.os.RemoteException -> L8
            r0.zzf(r2)     // Catch: android.os.RemoteException -> L8
            return
        L8:
            r2 = move-exception
            java.lang.String r0 = "Ad service can't call client"
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r2)
            return
    }
}
