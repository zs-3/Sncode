package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbmi extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbmj {
    public zzbmi() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.instream.client.IInstreamAd"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            r6 = 3
            if (r3 == r6) goto L63
            r6 = 4
            if (r3 == r6) goto L5c
            r6 = 5
            if (r3 == r6) goto L2e
            r6 = 6
            if (r3 == r6) goto L1c
            r4 = 7
            if (r3 == r4) goto L11
            r3 = 0
            return r3
        L11:
            com.google.android.gms.internal.ads.zzbfz r3 = r2.zzc()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
            goto L6d
        L1c:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zze(r3)
            r5.writeNoException()
            goto L6d
        L2e:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            android.os.IBinder r6 = r4.readStrongBinder()
            if (r6 != 0) goto L3e
            r6 = 0
            goto L52
        L3e:
            java.lang.String r0 = "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbmm
            if (r1 == 0) goto L4c
            r6 = r0
            com.google.android.gms.internal.ads.zzbmm r6 = (com.google.android.gms.internal.ads.zzbmm) r6
            goto L52
        L4c:
            com.google.android.gms.internal.ads.zzbmk r0 = new com.google.android.gms.internal.ads.zzbmk
            r0.<init>(r6)
            r6 = r0
        L52:
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzf(r3, r6)
            r5.writeNoException()
            goto L6d
        L5c:
            r2.zzd()
            r5.writeNoException()
            goto L6d
        L63:
            com.google.android.gms.ads.internal.client.zzeb r3 = r2.zzb()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
        L6d:
            r3 = 1
            return r3
    }
}
