package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzan implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbub zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzap zzc;

    zzan(com.google.android.gms.ads.nonagon.signalgeneration.zzap r1, com.google.android.gms.internal.ads.zzbub r2, boolean r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbub r0 = r3.zza     // Catch: android.os.RemoteException -> L1b
            java.lang.String r4 = r4.getMessage()     // Catch: android.os.RemoteException -> L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L1b
            r1.<init>()     // Catch: android.os.RemoteException -> L1b
            java.lang.String r2 = "Internal error: "
            r1.append(r2)     // Catch: android.os.RemoteException -> L1b
            r1.append(r4)     // Catch: android.os.RemoteException -> L1b
            java.lang.String r4 = r1.toString()     // Catch: android.os.RemoteException -> L1b
            r0.zze(r4)     // Catch: android.os.RemoteException -> L1b
            return
        L1b:
            r4 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r6) {
            r5 = this;
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r0 = r5.zzc     // Catch: android.os.RemoteException -> L6c
            com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzH(r0, r6)     // Catch: android.os.RemoteException -> L6c
            com.google.android.gms.internal.ads.zzbub r0 = r5.zza     // Catch: android.os.RemoteException -> L6c
            r0.zzf(r6)     // Catch: android.os.RemoteException -> L6c
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r0 = r5.zzc     // Catch: android.os.RemoteException -> L6c
            boolean r0 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzM(r0)     // Catch: android.os.RemoteException -> L6c
            if (r0 != 0) goto L18
            boolean r0 = r5.zzb     // Catch: android.os.RemoteException -> L6c
            if (r0 == 0) goto L6b
        L18:
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L6c
        L1c:
            boolean r0 = r6.hasNext()     // Catch: android.os.RemoteException -> L6c
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r6.next()     // Catch: android.os.RemoteException -> L6c
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: android.os.RemoteException -> L6c
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r1 = r5.zzc     // Catch: android.os.RemoteException -> L6c
            boolean r1 = r1.zzO(r0)     // Catch: android.os.RemoteException -> L6c
            r2 = 0
            if (r1 == 0) goto L4b
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r1 = r5.zzc     // Catch: android.os.RemoteException -> L6c
            java.lang.String r3 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzx(r1)     // Catch: android.os.RemoteException -> L6c
            java.lang.String r4 = "1"
            android.net.Uri r0 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzd(r1, r0, r3, r4)     // Catch: android.os.RemoteException -> L6c
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r1 = r5.zzc     // Catch: android.os.RemoteException -> L6c
            com.google.android.gms.internal.ads.zzfng r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzs(r1)     // Catch: android.os.RemoteException -> L6c
            java.lang.String r0 = r0.toString()     // Catch: android.os.RemoteException -> L6c
            r1.zzc(r0, r2)     // Catch: android.os.RemoteException -> L6c
            goto L1c
        L4b:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhf     // Catch: android.os.RemoteException -> L6c
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: android.os.RemoteException -> L6c
            java.lang.Object r1 = r3.zza(r1)     // Catch: android.os.RemoteException -> L6c
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: android.os.RemoteException -> L6c
            boolean r1 = r1.booleanValue()     // Catch: android.os.RemoteException -> L6c
            if (r1 == 0) goto L1c
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r1 = r5.zzc     // Catch: android.os.RemoteException -> L6c
            com.google.android.gms.internal.ads.zzfng r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzs(r1)     // Catch: android.os.RemoteException -> L6c
            java.lang.String r0 = r0.toString()     // Catch: android.os.RemoteException -> L6c
            r1.zzc(r0, r2)     // Catch: android.os.RemoteException -> L6c
            goto L1c
        L6b:
            return
        L6c:
            r6 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
            return
    }
}
