package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbib extends com.google.android.gms.dynamic.RemoteCreator {
    public zzbib() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl"
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
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbgj
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.internal.ads.zzbgj r3 = (com.google.android.gms.internal.ads.zzbgj) r3
            goto L18
        L12:
            com.google.android.gms.internal.ads.zzbgh r0 = new com.google.android.gms.internal.ads.zzbgh
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    public final com.google.android.gms.internal.ads.zzbgg zza(android.content.Context r4, android.widget.FrameLayout r5, android.widget.FrameLayout r6) {
            r3 = this;
            r0 = 0
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L32 android.os.RemoteException -> L34
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L32 android.os.RemoteException -> L34
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r6)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L32 android.os.RemoteException -> L34
            java.lang.Object r4 = r3.getRemoteCreatorInstance(r4)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L32 android.os.RemoteException -> L34
            com.google.android.gms.internal.ads.zzbgj r4 = (com.google.android.gms.internal.ads.zzbgj) r4     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L32 android.os.RemoteException -> L34
            r2 = 243220000(0xe7f3e20, float:3.1461089E-30)
            android.os.IBinder r4 = r4.zze(r1, r5, r6, r2)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L32 android.os.RemoteException -> L34
            if (r4 != 0) goto L1d
            goto L31
        L1d:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L32 android.os.RemoteException -> L34
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzbgg     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L32 android.os.RemoteException -> L34
            if (r6 == 0) goto L2b
            com.google.android.gms.internal.ads.zzbgg r5 = (com.google.android.gms.internal.ads.zzbgg) r5     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L32 android.os.RemoteException -> L34
        L29:
            r0 = r5
            goto L31
        L2b:
            com.google.android.gms.internal.ads.zzbge r5 = new com.google.android.gms.internal.ads.zzbge     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L32 android.os.RemoteException -> L34
            r5.<init>(r4)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L32 android.os.RemoteException -> L34
            goto L29
        L31:
            return r0
        L32:
            r4 = move-exception
            goto L35
        L34:
            r4 = move-exception
        L35:
            java.lang.String r5 = "Could not create remote NativeAdViewDelegate."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r5, r4)
            return r0
    }
}
