package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbdm extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbdn {
    public zzbdm() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L3c
            r0 = 2
            if (r2 == r0) goto L31
            r0 = 3
            if (r2 == r0) goto L1f
            r3 = 4
            if (r2 == r3) goto L18
            r3 = 5
            if (r2 == r3) goto L11
            r2 = 0
            return r2
        L11:
            r1.zzf()
            r4.writeNoException()
            goto L46
        L18:
            r1.zze()
            r4.writeNoException()
            goto L46
        L1f:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzd(r2)
            r4.writeNoException()
            goto L46
        L31:
            java.lang.String r2 = r1.zzc()
            r4.writeNoException()
            r4.writeString(r2)
            goto L46
        L3c:
            java.lang.String r2 = r1.zzb()
            r4.writeNoException()
            r4.writeString(r2)
        L46:
            return r5
    }
}
