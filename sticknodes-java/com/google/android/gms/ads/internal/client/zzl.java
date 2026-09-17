package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzl extends com.google.android.gms.dynamic.RemoteCreator {
    public zzl() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdPreloaderCreator"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.client.zzcj
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.ads.internal.client.zzcj r3 = (com.google.android.gms.ads.internal.client.zzcj) r3
            goto L18
        L12:
            com.google.android.gms.ads.internal.client.zzcj r0 = new com.google.android.gms.ads.internal.client.zzcj
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    public final com.google.android.gms.ads.internal.client.zzci zza(android.content.Context r4, com.google.android.gms.internal.ads.zzbpl r5) {
            r3 = this;
            r0 = 0
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2c android.os.RemoteException -> L2e
            java.lang.Object r4 = r3.getRemoteCreatorInstance(r4)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2c android.os.RemoteException -> L2e
            com.google.android.gms.ads.internal.client.zzcj r4 = (com.google.android.gms.ads.internal.client.zzcj) r4     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2c android.os.RemoteException -> L2e
            r2 = 243220000(0xe7f3e20, float:3.1461089E-30)
            android.os.IBinder r4 = r4.zze(r1, r5, r2)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2c android.os.RemoteException -> L2e
            if (r4 != 0) goto L16
            r1 = r0
            goto L28
        L16:
            java.lang.String r1 = "com.google.android.gms.ads.internal.client.IAdPreloader"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2c android.os.RemoteException -> L2e
            boolean r2 = r1 instanceof com.google.android.gms.ads.internal.client.zzci     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2c android.os.RemoteException -> L2e
            if (r2 == 0) goto L23
            com.google.android.gms.ads.internal.client.zzci r1 = (com.google.android.gms.ads.internal.client.zzci) r1     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2c android.os.RemoteException -> L2e
            goto L28
        L23:
            com.google.android.gms.ads.internal.client.zzcg r1 = new com.google.android.gms.ads.internal.client.zzcg     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2c android.os.RemoteException -> L2e
            r1.<init>(r4)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2c android.os.RemoteException -> L2e
        L28:
            r1.zzh(r5)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2c android.os.RemoteException -> L2e
            return r1
        L2c:
            r4 = move-exception
            goto L2f
        L2e:
            r4 = move-exception
        L2f:
            java.lang.String r5 = "Could not get remote AdPreloaderCreator."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r5, r4)
            return r0
    }
}
