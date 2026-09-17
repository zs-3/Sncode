package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbtj extends com.google.android.gms.dynamic.RemoteCreator {
    public zzbtj() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.AdOverlayCreatorImpl"
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
            java.lang.String r0 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbtp
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.internal.ads.zzbtp r3 = (com.google.android.gms.internal.ads.zzbtp) r3
            goto L18
        L12:
            com.google.android.gms.internal.ads.zzbtn r0 = new com.google.android.gms.internal.ads.zzbtn
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    public final com.google.android.gms.internal.ads.zzbtm zza(android.app.Activity r5) {
            r4 = this;
            java.lang.String r0 = "Could not create remote AdOverlay."
            r1 = 0
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L29 android.os.RemoteException -> L2e
            java.lang.Object r5 = r4.getRemoteCreatorInstance(r5)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L29 android.os.RemoteException -> L2e
            com.google.android.gms.internal.ads.zzbtp r5 = (com.google.android.gms.internal.ads.zzbtp) r5     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L29 android.os.RemoteException -> L2e
            android.os.IBinder r5 = r5.zze(r2)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L29 android.os.RemoteException -> L2e
            if (r5 != 0) goto L14
            goto L28
        L14:
            java.lang.String r2 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay"
            android.os.IInterface r2 = r5.queryLocalInterface(r2)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L29 android.os.RemoteException -> L2e
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbtm     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L29 android.os.RemoteException -> L2e
            if (r3 == 0) goto L22
            com.google.android.gms.internal.ads.zzbtm r2 = (com.google.android.gms.internal.ads.zzbtm) r2     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L29 android.os.RemoteException -> L2e
        L20:
            r1 = r2
            goto L28
        L22:
            com.google.android.gms.internal.ads.zzbtk r2 = new com.google.android.gms.internal.ads.zzbtk     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L29 android.os.RemoteException -> L2e
            r2.<init>(r5)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L29 android.os.RemoteException -> L2e
            goto L20
        L28:
            return r1
        L29:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r5)
            return r1
        L2e:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r5)
            return r1
    }
}
