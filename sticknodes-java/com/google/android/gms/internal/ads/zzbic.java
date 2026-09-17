package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbic extends com.google.android.gms.dynamic.RemoteCreator {
    public zzbic() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl"
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
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbgp
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.internal.ads.zzbgp r3 = (com.google.android.gms.internal.ads.zzbgp) r3
            goto L18
        L12:
            com.google.android.gms.internal.ads.zzbgn r0 = new com.google.android.gms.internal.ads.zzbgn
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    public final com.google.android.gms.internal.ads.zzbgm zza(android.view.View r3, java.util.HashMap r4, java.util.HashMap r5) {
            r2 = this;
            r0 = 0
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L33 android.os.RemoteException -> L35
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L33 android.os.RemoteException -> L35
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L33 android.os.RemoteException -> L35
            android.content.Context r3 = r3.getContext()     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L33 android.os.RemoteException -> L35
            java.lang.Object r3 = r2.getRemoteCreatorInstance(r3)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L33 android.os.RemoteException -> L35
            com.google.android.gms.internal.ads.zzbgp r3 = (com.google.android.gms.internal.ads.zzbgp) r3     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L33 android.os.RemoteException -> L35
            android.os.IBinder r3 = r3.zze(r1, r4, r5)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L33 android.os.RemoteException -> L35
            if (r3 != 0) goto L1e
            goto L32
        L1e:
            java.lang.String r4 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L33 android.os.RemoteException -> L35
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzbgm     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L33 android.os.RemoteException -> L35
            if (r5 == 0) goto L2c
            com.google.android.gms.internal.ads.zzbgm r4 = (com.google.android.gms.internal.ads.zzbgm) r4     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L33 android.os.RemoteException -> L35
        L2a:
            r0 = r4
            goto L32
        L2c:
            com.google.android.gms.internal.ads.zzbgk r4 = new com.google.android.gms.internal.ads.zzbgk     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L33 android.os.RemoteException -> L35
            r4.<init>(r3)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L33 android.os.RemoteException -> L35
            goto L2a
        L32:
            return r0
        L33:
            r3 = move-exception
            goto L36
        L35:
            r3 = move-exception
        L36:
            java.lang.String r4 = "Could not create remote NativeAdViewHolderDelegate."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r4, r3)
            return r0
    }
}
