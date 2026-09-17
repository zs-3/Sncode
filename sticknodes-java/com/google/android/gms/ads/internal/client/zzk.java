package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzk extends com.google.android.gms.dynamic.RemoteCreator {
    private com.google.android.gms.internal.ads.zzbur zza;

    public zzk() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.AdManagerCreatorImpl"
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
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManagerCreator"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.client.zzbz
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.ads.internal.client.zzbz r3 = (com.google.android.gms.ads.internal.client.zzbz) r3
            goto L18
        L12:
            com.google.android.gms.ads.internal.client.zzbz r0 = new com.google.android.gms.ads.internal.client.zzbz
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    public final com.google.android.gms.ads.internal.client.zzby zza(android.content.Context r11, com.google.android.gms.ads.internal.client.zzs r12, java.lang.String r13, com.google.android.gms.internal.ads.zzbpl r14, int r15) {
            r10 = this;
            com.google.android.gms.internal.ads.zzbcv.zza(r11)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkn
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "com.google.android.gms.ads.internal.client.IAdManager"
            r2 = 0
            if (r0 == 0) goto L60
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch: java.lang.NullPointerException -> L4a android.os.RemoteException -> L4c com.google.android.gms.ads.internal.util.client.zzp -> L4e
            java.lang.String r0 = "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl"
            com.google.android.gms.ads.internal.client.zzj r3 = new com.google.android.gms.ads.internal.client.zzj     // Catch: java.lang.NullPointerException -> L4a android.os.RemoteException -> L4c com.google.android.gms.ads.internal.util.client.zzp -> L4e
            r3.<init>()     // Catch: java.lang.NullPointerException -> L4a android.os.RemoteException -> L4c com.google.android.gms.ads.internal.util.client.zzp -> L4e
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.client.zzq.zzb(r11, r0, r3)     // Catch: java.lang.NullPointerException -> L4a android.os.RemoteException -> L4c com.google.android.gms.ads.internal.util.client.zzp -> L4e
            r3 = r0
            com.google.android.gms.ads.internal.client.zzbz r3 = (com.google.android.gms.ads.internal.client.zzbz) r3     // Catch: java.lang.NullPointerException -> L4a android.os.RemoteException -> L4c com.google.android.gms.ads.internal.util.client.zzp -> L4e
            r8 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r5 = r12
            r6 = r13
            r7 = r14
            r9 = r15
            android.os.IBinder r12 = r3.zze(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.NullPointerException -> L4a android.os.RemoteException -> L4c com.google.android.gms.ads.internal.util.client.zzp -> L4e
            if (r12 != 0) goto L38
            goto L8b
        L38:
            android.os.IInterface r13 = r12.queryLocalInterface(r1)     // Catch: java.lang.NullPointerException -> L4a android.os.RemoteException -> L4c com.google.android.gms.ads.internal.util.client.zzp -> L4e
            boolean r14 = r13 instanceof com.google.android.gms.ads.internal.client.zzby     // Catch: java.lang.NullPointerException -> L4a android.os.RemoteException -> L4c com.google.android.gms.ads.internal.util.client.zzp -> L4e
            if (r14 == 0) goto L44
            com.google.android.gms.ads.internal.client.zzby r13 = (com.google.android.gms.ads.internal.client.zzby) r13     // Catch: java.lang.NullPointerException -> L4a android.os.RemoteException -> L4c com.google.android.gms.ads.internal.util.client.zzp -> L4e
        L42:
            r2 = r13
            goto L8b
        L44:
            com.google.android.gms.ads.internal.client.zzbw r13 = new com.google.android.gms.ads.internal.client.zzbw     // Catch: java.lang.NullPointerException -> L4a android.os.RemoteException -> L4c com.google.android.gms.ads.internal.util.client.zzp -> L4e
            r13.<init>(r12)     // Catch: java.lang.NullPointerException -> L4a android.os.RemoteException -> L4c com.google.android.gms.ads.internal.util.client.zzp -> L4e
            goto L42
        L4a:
            r12 = move-exception
            goto L4f
        L4c:
            r12 = move-exception
            goto L4f
        L4e:
            r12 = move-exception
        L4f:
            com.google.android.gms.internal.ads.zzbur r11 = com.google.android.gms.internal.ads.zzbup.zza(r11)
            r10.zza = r11
            java.lang.String r13 = "AdManagerCreator.newAdManagerByDynamiteLoader"
            r11.zzh(r12, r13)
            java.lang.String r11 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r11, r12)
            goto L8b
        L60:
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L8c android.os.RemoteException -> L8e
            java.lang.Object r11 = r10.getRemoteCreatorInstance(r11)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L8c android.os.RemoteException -> L8e
            r3 = r11
            com.google.android.gms.ads.internal.client.zzbz r3 = (com.google.android.gms.ads.internal.client.zzbz) r3     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L8c android.os.RemoteException -> L8e
            r8 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r5 = r12
            r6 = r13
            r7 = r14
            r9 = r15
            android.os.IBinder r11 = r3.zze(r4, r5, r6, r7, r8, r9)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L8c android.os.RemoteException -> L8e
            if (r11 != 0) goto L79
            goto L8b
        L79:
            android.os.IInterface r12 = r11.queryLocalInterface(r1)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L8c android.os.RemoteException -> L8e
            boolean r13 = r12 instanceof com.google.android.gms.ads.internal.client.zzby     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L8c android.os.RemoteException -> L8e
            if (r13 == 0) goto L85
            com.google.android.gms.ads.internal.client.zzby r12 = (com.google.android.gms.ads.internal.client.zzby) r12     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L8c android.os.RemoteException -> L8e
        L83:
            r2 = r12
            goto L8b
        L85:
            com.google.android.gms.ads.internal.client.zzbw r12 = new com.google.android.gms.ads.internal.client.zzbw     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L8c android.os.RemoteException -> L8e
            r12.<init>(r11)     // Catch: com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException -> L8c android.os.RemoteException -> L8e
            goto L83
        L8b:
            return r2
        L8c:
            r11 = move-exception
            goto L8f
        L8e:
            r11 = move-exception
        L8f:
            java.lang.String r12 = "Could not create remote AdManager."
            com.google.android.gms.ads.internal.util.client.zzm.zzf(r12, r11)
            return r2
    }
}
