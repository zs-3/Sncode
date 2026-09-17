package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzban extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbao {
    public zzban() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbao zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbao
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbao r0 = (com.google.android.gms.internal.ads.zzbao) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbam r0 = new com.google.android.gms.internal.ads.zzbam
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            switch(r3) {
                case 2: goto L79;
                case 3: goto L5f;
                case 4: goto L31;
                case 5: goto L26;
                case 6: goto L18;
                case 7: goto L5;
                default: goto L3;
            }
        L3:
            r3 = 0
            return r3
        L5:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdr r3 = com.google.android.gms.ads.internal.client.zzdq.zzb(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzh(r3)
            r5.writeNoException()
            goto L83
        L18:
            boolean r3 = com.google.android.gms.internal.ads.zzayn.zzg(r4)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzg(r3)
            r5.writeNoException()
            goto L83
        L26:
            com.google.android.gms.ads.internal.client.zzdy r3 = r2.zzf()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
            goto L83
        L31:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            android.os.IBinder r6 = r4.readStrongBinder()
            if (r6 != 0) goto L41
            r6 = 0
            goto L55
        L41:
            java.lang.String r0 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback"
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbav
            if (r1 == 0) goto L4f
            r6 = r0
            com.google.android.gms.internal.ads.zzbav r6 = (com.google.android.gms.internal.ads.zzbav) r6
            goto L55
        L4f:
            com.google.android.gms.internal.ads.zzbat r0 = new com.google.android.gms.internal.ads.zzbat
            r0.<init>(r6)
            r6 = r0
        L55:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzi(r3, r6)
            r5.writeNoException()
            goto L83
        L5f:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L66
            goto L72
        L66:
            java.lang.String r6 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback"
            android.os.IInterface r3 = r3.queryLocalInterface(r6)
            boolean r6 = r3 instanceof com.google.android.gms.internal.ads.zzbas
            if (r6 == 0) goto L72
            com.google.android.gms.internal.ads.zzbas r3 = (com.google.android.gms.internal.ads.zzbas) r3
        L72:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r5.writeNoException()
            goto L83
        L79:
            com.google.android.gms.ads.internal.client.zzby r3 = r2.zze()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
        L83:
            r3 = 1
            return r3
    }
}
