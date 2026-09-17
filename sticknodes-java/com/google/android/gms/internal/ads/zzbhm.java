package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbhm extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbhn {
    public zzbhm() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbhn zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbhn
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbhn r0 = (com.google.android.gms.internal.ads.zzbhn) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbhl r0 = new com.google.android.gms.internal.ads.zzbhl
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 != r5) goto L1d
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzby r2 = com.google.android.gms.ads.internal.client.zzbx.zzad(r2)
            android.os.IBinder r0 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zze(r2, r0)
            r4.writeNoException()
            return r5
        L1d:
            r2 = 0
            return r2
    }
}
