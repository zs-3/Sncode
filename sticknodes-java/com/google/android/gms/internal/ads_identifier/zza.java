package com.google.android.gms.internal.ads_identifier;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes.dex */
public class zza implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final java.lang.String zzb;

    protected zza(android.os.IBinder r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            java.lang.String r1 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
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

    protected final android.os.Parcel zzb(int r4, android.os.Parcel r5) throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r1 = r3.zza     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r2 = 0
            r1.transact(r4, r5, r0, r2)     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r0.readException()     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r5.recycle()
            return r0
        L11:
            r4 = move-exception
            goto L18
        L13:
            r4 = move-exception
            r0.recycle()     // Catch: java.lang.Throwable -> L11
            throw r4     // Catch: java.lang.Throwable -> L11
        L18:
            r5.recycle()
            throw r4
    }
}
