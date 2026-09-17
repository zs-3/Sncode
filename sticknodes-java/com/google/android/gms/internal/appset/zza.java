package com.google.android.gms.internal.appset;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public class zza implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final java.lang.String zzb;

    protected zza(android.os.IBinder r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            java.lang.String r1 = "com.google.android.gms.appset.internal.IAppSetService"
            r0.zzb = r1
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.zza
            return r0
    }

    protected final android.os.Parcel zza() {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r2.zzb
            r0.writeInterfaceToken(r1)
            return r0
    }

    protected final void zzb(int r4, android.os.Parcel r5) throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r4 = android.os.Parcel.obtain()
            android.os.IBinder r0 = r3.zza     // Catch: java.lang.Throwable -> L15
            r1 = 1
            r2 = 0
            r0.transact(r1, r5, r4, r2)     // Catch: java.lang.Throwable -> L15
            r4.readException()     // Catch: java.lang.Throwable -> L15
            r5.recycle()
            r4.recycle()
            return
        L15:
            r0 = move-exception
            r5.recycle()
            r4.recycle()
            throw r0
    }
}
