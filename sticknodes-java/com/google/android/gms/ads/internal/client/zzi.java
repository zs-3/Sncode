package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzi extends com.google.android.gms.dynamic.RemoteCreator {
    public zzi() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.AdLoaderBuilderCreatorImpl"
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
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.client.zzbv
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.ads.internal.client.zzbv r3 = (com.google.android.gms.ads.internal.client.zzbv) r3
            goto L18
        L12:
            com.google.android.gms.ads.internal.client.zzbv r0 = new com.google.android.gms.ads.internal.client.zzbv
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    public final com.google.android.gms.ads.internal.client.zzbu zza(android.content.Context r4, java.lang.String r5, com.google.android.gms.internal.ads.zzbpl r6) {
            r3 = this;
            r0 = 0
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2a android.os.RemoteException -> L2c
            java.lang.Object r4 = r3.getRemoteCreatorInstance(r4)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2a android.os.RemoteException -> L2c
            com.google.android.gms.ads.internal.client.zzbv r4 = (com.google.android.gms.ads.internal.client.zzbv) r4     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2a android.os.RemoteException -> L2c
            r2 = 243220000(0xe7f3e20, float:3.1461089E-30)
            android.os.IBinder r4 = r4.zze(r1, r5, r6, r2)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2a android.os.RemoteException -> L2c
            if (r4 != 0) goto L15
            goto L29
        L15:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2a android.os.RemoteException -> L2c
            boolean r6 = r5 instanceof com.google.android.gms.ads.internal.client.zzbu     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2a android.os.RemoteException -> L2c
            if (r6 == 0) goto L23
            com.google.android.gms.ads.internal.client.zzbu r5 = (com.google.android.gms.ads.internal.client.zzbu) r5     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2a android.os.RemoteException -> L2c
        L21:
            r0 = r5
            goto L29
        L23:
            com.google.android.gms.ads.internal.client.zzbs r5 = new com.google.android.gms.ads.internal.client.zzbs     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2a android.os.RemoteException -> L2c
            r5.<init>(r4)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L2a android.os.RemoteException -> L2c
            goto L21
        L29:
            return r0
        L2a:
            r4 = move-exception
            goto L2d
        L2c:
            r4 = move-exception
        L2d:
            java.lang.String r5 = "Could not create remote builder for AdLoader."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r5, r4)
            return r0
    }
}
