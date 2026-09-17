package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzdt extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzdu {
    public zzdt() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IOutOfContextTester"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            r6 = 1
            if (r3 != r6) goto L21
            java.lang.String r3 = r4.readString()
            android.os.IBinder r0 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            android.os.IBinder r1 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zze(r3, r0, r1)
            r5.writeNoException()
            return r6
        L21:
            r3 = 0
            return r3
    }
}
