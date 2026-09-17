package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzam extends com.google.android.gms.internal.games.zzfn {
    final /* synthetic */ com.google.android.gms.games.internal.zzbz zza;

    zzam(com.google.android.gms.games.internal.zzbz r2) {
            r1 = this;
            r1.zza = r2
            android.content.Context r2 = r2.getContext()
            android.os.Looper r2 = r2.getMainLooper()
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.games.zzfn
    protected final void zza(java.lang.String r4, int r5) {
            r3 = this;
            java.lang.String r0 = "GamesGmsClientImpl"
            com.google.android.gms.games.internal.zzbz r1 = r3.zza     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            boolean r1 = r1.isConnected()     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            if (r1 == 0) goto L16
            com.google.android.gms.games.internal.zzbz r1 = r3.zza     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            android.os.IInterface r1 = r1.getService()     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            r1.zzD(r4, r5)     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            return
        L16:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            r1.<init>()     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            java.lang.String r2 = "Unable to increment event "
            r1.append(r2)     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            r1.append(r4)     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            java.lang.String r4 = " by "
            r1.append(r4)     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            r1.append(r5)     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            java.lang.String r4 = " because the games client is no longer connected"
            r1.append(r4)     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            java.lang.String r4 = r1.toString()     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            com.google.android.gms.internal.games.zzft.zza(r0, r4)     // Catch: java.lang.SecurityException -> L38 android.os.RemoteException -> L41
            return
        L38:
            r4 = move-exception
            int r5 = com.google.android.gms.games.internal.zzbz.zze
            java.lang.String r5 = "Is player signed out?"
            com.google.android.gms.internal.games.zzft.zzb(r0, r5, r4)
            return
        L41:
            r4 = move-exception
            com.google.android.gms.games.internal.zzbz.zzM(r4)
            return
    }
}
